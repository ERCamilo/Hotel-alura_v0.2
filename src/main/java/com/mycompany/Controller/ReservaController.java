package com.mycompany.Controller;

import com.mycompany.DAO.ReservaDAO;
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

public class ReservaController implements ReservaDAO {

    private final Connection conexion;
    private List<Reservas> listarReserva;

    public ReservaController() {
        Connection conn = ConexionController.getConnectionReservas();
        this.conexion = conn;
    }

    @Override
    public void registrar(Reservas reserva) {
        try (PreparedStatement insertar = conexion.prepareStatement("INSERT INTO reservas (checkIn,checkOut,valor,formaDePago,idHuesped)VALUES(?,?,?,?,?)")) {

            insertar.setDate(1, (Date) reserva.getCheckIn());
            insertar.setDate(2, (Date) reserva.getCheckOut());
            insertar.setDouble(3, reserva.getValor());
            insertar.setString(4, reserva.getFormaDePago());
            insertar.setInt(5, reserva.getIdHuesped());

            int filasAfectadas = insertar.executeUpdate();

            if (filasAfectadas > 0) {

                JOptionPane.showMessageDialog(null, "Registro completado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modificar(JTable tabla) {

       Reservas reserva = TablaController.obtenerReservaDesdeFilaSeleccionada(tabla);
               
        try {
            if (reserva.getNumeroDeReserva() == 0) {
                JOptionPane.showMessageDialog(null, "Por favor, elige una reserva a modificar.");
                return;
            }

                
            boolean actualizado = TablaController.updateReservasBD(reserva);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "La reserva se ha actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la reserva.");
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar la reserva: " + e.getMessage());
        }

    }

    @Override
    public void eliminar(JTable tabla) {
        Reservas reserva = TablaController.obtenerReservaDesdeFilaSeleccionada(tabla);
        int id = reserva.getNumeroDeReserva();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este elemento?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Realizar la eliminación en la base de datos
            if (TablaController.eliminarEnBaseDeDatos(id, "reservas")) {
                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                int filaSeleccionada = tabla.getSelectedRow();

                modeloTabla.removeRow(filaSeleccionada); // Eliminar la fila de la tabla visual

                JOptionPane.showMessageDialog(null, "Elemento eliminado exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el elemento.");
            }
        }
    }
    
    //TODO
    @Override
    public void buscar(Reservas reserva) {
    }

    @Override
    public void listarReserva() {

        List<Reservas> getListarReserva = new ArrayList<>();

        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT* FROM reservas");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Reservas reserva = new Reservas();

                reserva.setNumeroDeReserva(resultado.getInt("idReserva"));
                reserva.setCheckIn(resultado.getDate("checkIn"));
                reserva.setCheckOut(resultado.getDate("checkOut"));
                reserva.setValor(resultado.getDouble("valor"));
                reserva.setFormaDePago(resultado.getString("formaDePago"));
                reserva.setIdHuesped(resultado.getInt("idHuesped"));

                getListarReserva.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("com.mycompany.Controller.ReservaController.listarReserva()");
        }
        this.listarReserva = getListarReserva;
    }

    public void llenarTablaReservas(JTable tablaHuesped) {

        try {
            if (conexion != null) {

                List<Reservas> listaReserva = listarReserva;
                DefaultTableModel modeloTabla = (DefaultTableModel) tablaHuesped.getModel();
                modeloTabla.setRowCount(0);

                for (Reservas reserva : listaReserva) {
                    Object[] fila = {
                        reserva.getNumeroDeReserva(),
                        reserva.getCheckIn(),
                        reserva.getCheckOut(),
                        reserva.getValor(),
                        reserva.getFormaDePago(),
                        reserva.getIdHuesped()
                    };
                    
                    modeloTabla.addRow(fila);
                }
            } else {
                System.err.println("La conexión a la base de datos Reserva es nula.");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al llenar la tabla Reservas.");

        }
    }

    public void llenarTablaReservas(JTable tablaHuesped, String filtro) {
        Object[] fila = null;

        try {
            if (conexion != null) {

                List<Reservas> listaReserva = listarReserva;
                DefaultTableModel modeloTabla = (DefaultTableModel) tablaHuesped.getModel();
                modeloTabla.setRowCount(0);

                for (Reservas reserva : listaReserva) {
                    if (filtro != null) {

                        if (Integer.toString(reserva.getIdHuesped()).contains(filtro)
                                || reserva.getNumeroDeReserva().toString().contains(filtro)
                                || (reserva.getCheckIn().toString().contains(filtro))
                                || (reserva.getCheckOut().toString().contains(filtro))
                                || (reserva.getValor().toString().contains(filtro))
                                || (reserva.getFormaDePago().contains(filtro))) {

                            Object[] fila1 = {
                                reserva.getNumeroDeReserva(),
                                reserva.getCheckIn(),
                                reserva.getCheckOut(),
                                reserva.getValor(),
                                reserva.getFormaDePago(),
                                reserva.getIdHuesped()
                            };

                            fila = fila1;
                        } else {

                            Object[] fila2 = {
                                reserva.getNumeroDeReserva(),
                                reserva.getCheckIn(),
                                reserva.getCheckOut(),
                                reserva.getValor(),
                                reserva.getFormaDePago(),
                                reserva.getIdHuesped()
                            };

                            fila = fila2;
                        }

                    }
                }

                modeloTabla.addRow(fila);

            } else {
                System.err.println("La conexión a la base de datos Reserva es nula.");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al llenar la tabla Reservas.");

        }
    }

    
}
