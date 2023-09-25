package com.mycompany.Controller;

import com.mycompany.DAO.HuespedDAO;
import com.mycompany.hotel.Huesped;
import com.mycompany.hotel.Reservas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HuespedController implements HuespedDAO {

    private Connection conexion;
    private List<Huesped> listarHuesped;

    public HuespedController() {
        Connection conn = ConexionController.getConnectionHuespedes();
        this.conexion = conn;
    }

    @Override
    public int registrar(Huesped huesped) {
        int idHuesped = -1;

        try {
            PreparedStatement insertar = conexion.prepareStatement("INSERT INTO huespedes (nombre,apellido,fechaDeNacimiento,nacionalidad,telefono)VALUES(?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            insertar.setString(1, huesped.getNombreHuesped());
            insertar.setString(2, huesped.getApellidoHuesped());
            insertar.setDate(3, (Date) huesped.getFechaDeNacimiento());
            insertar.setString(4, huesped.getNacionalidad());
            insertar.setString(5, huesped.getTelefono());
            //insertar.setInt(6,huesped.getNumeroDeReserva());
            // insertar.setInt(7,huesped.getNumeroDeHuested());
            int filasAfectadas = insertar.executeUpdate();

            if (filasAfectadas > 0) {

                ResultSet generatedKeys = insertar.getGeneratedKeys();
                if (generatedKeys.next()) {
                    idHuesped = generatedKeys.getInt(1);
                }

                JOptionPane.showMessageDialog(null, "Registro completado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idHuesped;
    }

    @Override
    public void modificar(JTable tabla) {
               Huesped huesped = TablaController.obtenerHuespedDesdeFilaSeleccionada(tabla);
               
        try {
            if (huesped.getNumeroDeHuested() == 0) {
                JOptionPane.showMessageDialog(null, "Por favor, elige un huesped a modificar.");
                return;
            }

                
            boolean actualizado = TablaController.updateHuespedBD(huesped);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "El huesped se ha actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el huesped.");
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar el huesped: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(JTable tabla) {

        Huesped huesped = TablaController.obtenerHuespedDesdeFilaSeleccionada(tabla);
        int id = huesped.getNumeroDeHuested();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este elemento?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Realizar la eliminación en la base de datos
            if (TablaController.eliminarEnBaseDeDatos(id, "huespedes")) {
                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                int filaSeleccionada = tabla.getSelectedRow();
                modeloTabla.removeRow(filaSeleccionada); // Eliminar la fila de la tabla visual
                JOptionPane.showMessageDialog(null, "Elemento eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el elemento.");
            }
        }
    }

    @Override
    public void buscar(Huesped huesped) {
    }

    @Override
    public void listarHuesped() {
        List<Huesped> listaHuesped = new ArrayList<>();

        try (PreparedStatement consulta = conexion.prepareStatement("SELECT* FROM huespedes")) {
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Huesped huesped = new Huesped();

                huesped.setNumeroDeHuested(resultado.getInt("idHuesped"));
                huesped.setNombreHuesped(resultado.getString("nombre"));
                huesped.setApellidoHuesped(resultado.getString("apellido"));
                huesped.setFechaDeNacimiento(resultado.getDate("fechaDeNacimiento"));
                huesped.setNacionalidad(resultado.getString("nacionalidad"));
                huesped.setTelefono(resultado.getString("telefono"));
                // huesped.setNumeroDeReserva(resultado.getInt("numeroReserva"));

                listaHuesped.add(huesped);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.listarHuesped = listaHuesped;
    }

    public void llenarTablaHuesped(JTable tablaHuesped) {

        try {
            if (conexion != null) {

                List<Huesped> listaHuesped = listarHuesped;
                DefaultTableModel modeloTabla = (DefaultTableModel) tablaHuesped.getModel();
                modeloTabla.setRowCount(0);

                for (Huesped huesped : listaHuesped) {
                    Object[] fila = {
                        huesped.getNumeroDeHuested(),
                        huesped.getNombreHuesped(),
                        huesped.getApellidoHuesped(),
                        huesped.getFechaDeNacimiento(),
                        huesped.getNacionalidad(),
                        huesped.getTelefono()
                    };
                    modeloTabla.addRow(fila);
                }
            } else {
                System.err.println("La conexión a la base de datos Huespedes es nula.");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al llenar la tabla Reservas.");

        }
    }

}
