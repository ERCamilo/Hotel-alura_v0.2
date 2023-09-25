package com.mycompany.Controller;

import com.mycompany.hotel.Huesped;
import com.mycompany.hotel.Reservas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TablaController {

    static String quitarAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static boolean tieneFilaElegida(JTable tabla) {
        return tabla.getSelectedRowCount() == 0 || tabla.getSelectedColumnCount() == 0;
    }

    static java.sql.Date getFecha(String date) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaUtil = formatoFecha.parse(date);
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            return fechaSQL;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean eliminarEnBaseDeDatos(int id, String nombreTabla) {
        ConexionController conn = new ConexionController();
        Connection conActual = conn.obtenerConexion();

        String idTabla = "";
        String tabla = "";

        switch (nombreTabla) {
            case "reservas" -> {
                idTabla = "idReserva";
                tabla = "reservas";
            }
            case "huespedes" -> {
                idTabla = "idHuesped";
                tabla = "huespedes";
            }
        }

        try {
            PreparedStatement eliminar = conActual.prepareStatement("DELETE FROM " + tabla + " WHERE " + idTabla + " = ?");
            eliminar.setInt(1, id);

            int filasAfectadas = eliminar.executeUpdate();

            return filasAfectadas > 0; // Devuelve true si se eliminó al menos una fila, de lo contrario false.
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error, retorna false.
        }
    }

    //Tabla Reservas
    public static Reservas obtenerReservaDesdeFilaSeleccionada(JTable tabla) {
        if (tieneFilaElegida(tabla)) {
            JOptionPane.showMessageDialog(null, "Por favor, elige un elemento en la tabla.");
            return null;
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        int filaSeleccionada = tabla.getSelectedRow();
        int id = (int) modeloTabla.getValueAt(filaSeleccionada, 0);
        java.sql.Date checkIn = getFecha(modeloTabla.getValueAt(filaSeleccionada, 1).toString());
        java.sql.Date checkOut = getFecha(modeloTabla.getValueAt(filaSeleccionada, 2).toString());
        Double costo = Double.parseDouble(modeloTabla.getValueAt(filaSeleccionada, 3).toString());
        String formaDePago = (String) modeloTabla.getValueAt(filaSeleccionada, 4);
        int idHuesped = (int) modeloTabla.getValueAt(filaSeleccionada, 5);

        Reservas reserva = new Reservas();

        reserva.setNumeroDeReserva(id);
        reserva.setCheckIn(checkIn);
        reserva.setCheckOut(checkOut);
        reserva.setValor(costo);
        reserva.setFormaDePago(formaDePago);
        reserva.setIdHuesped(idHuesped);

        return reserva;
    }

    public static boolean updateReservasBD(Reservas reserva) {
        ConexionController conn = new ConexionController();
        Connection conActual = conn.obtenerConexion();

        try {
            PreparedStatement actualizar
                    = conActual.prepareStatement("UPDATE reservas SET checkIn = ?, checkOut = ?, valor = ?, formaDePago = ?, idHuesped = ? WHERE idReserva = ?");

            actualizar.setDate(1, reserva.getCheckIn());
            actualizar.setDate(2, reserva.getCheckOut());
            actualizar.setDouble(3, reserva.getValor());
            actualizar.setString(4, reserva.getFormaDePago());
            actualizar.setInt(5, reserva.getIdHuesped());
            actualizar.setInt(6, reserva.getNumeroDeReserva());

            actualizar.executeUpdate();

            int filasAfectadas = actualizar.executeUpdate();
            return filasAfectadas > 0; // Devuelve true si se actualizó al menos una fila, de lo contrario false.
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error, retorna false.
        }
    }

    //Tabla Huespedes
    public static Huesped obtenerHuespedDesdeFilaSeleccionada(JTable tabla) {
        if (tieneFilaElegida(tabla)) {
            JOptionPane.showMessageDialog(null, "Por favor, elige un elemento en la tabla.");
            return null;
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        int filaSeleccionada = tabla.getSelectedRow();

        int id = (int) modeloTabla.getValueAt(filaSeleccionada, 0);
        String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
        String apellido = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
        Date fechaDeNacimiento = getFecha(modeloTabla.getValueAt(filaSeleccionada, 3).toString());
        String nacionalidad = (String) modeloTabla.getValueAt(filaSeleccionada, 4);
        String telefono = (String) modeloTabla.getValueAt(filaSeleccionada, 5);

        Huesped huesped = new Huesped();

        huesped.setNumeroDeHuested(id);
        huesped.setNombreHuesped(nombre);
        huesped.setApellidoHuesped(apellido);
        huesped.setFechaDeNacimiento(fechaDeNacimiento);
        huesped.setNacionalidad(nacionalidad);
        huesped.setTelefono(telefono);

        return huesped;
    }

    public static boolean updateHuespedBD(Huesped huesped) {
        ConexionController conn = new ConexionController();
        Connection conActual = conn.obtenerConexion();

        try {
            PreparedStatement actualizar
                    = conActual.prepareStatement("UPDATE huesped SET nombre = ?, apellido = ?, fechaDeNacimiento = ?, nacionalidad = ?, telefono = ? WHERE idHuesped = ?");

            actualizar.setString(1, huesped.getNombreHuesped());
            actualizar.setString(2, huesped.getApellidoHuesped());
            actualizar.setDate(3, huesped.getFechaDeNacimiento());
            actualizar.setString(4, huesped.getNacionalidad());
            actualizar.setString(5, huesped.getTelefono());
            actualizar.setInt(6, huesped.getNumeroDeHuested());

            actualizar.executeUpdate();

            int filasAfectadas = actualizar.executeUpdate();
            conActual.close();
            /**
             * *
             */
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error, retorna false.
        }

    }

    //buscar
    public void buscar(JTable tabla, JTextField filtro) {

        String textoBuscado = quitarAcentos(filtro.getText().toLowerCase());

        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();

        int numeroDeFilas = modeloTabla.getRowCount();
        int numeroDeColumnas = modeloTabla.getColumnCount();

        for (int i = numeroDeFilas - 1; i >= 0; i--) {
            String fila = "";

            for (int x = numeroDeColumnas - 1; x >= 0; x--) {
                try {
                    fila = fila + " " + quitarAcentos(modeloTabla.getValueAt(i, x).toString().toLowerCase());
                } catch (Exception e) {
                    fila = fila + " ";
                }
            }

            if (!fila.contains(textoBuscado)) {

                modeloTabla.removeRow(i);
            }

        }
    }

}
