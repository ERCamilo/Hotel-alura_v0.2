package com.mycompany.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionController {

    private static Connection connectionHuespedes;
    private static Connection connectionReservas;

    public ConexionController() {
    }

//    public ConexionController(String url, String user, String password) {
//        if (url == null) {
//            this.url = "jdbc:mysql://localhost/control_de_stock?useTimezone=true&serverTimeZone=UTC";
//        }
//        if (user == null) {
//            this.user = "root";
//        }
//        if (password == null) {
//            this.password = "Erc159753.";
//        }
//    }
    public Connection obtenerConexion() {

        String url = "jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimeZone=UTC";
        String user = "root";
        String password = "Erc159753.";
        try {
            Connection conection = DriverManager.getConnection(url, user, password);
            System.out.println("se inicio la conexion");
            return conection;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error de conexion");

        }

        return null;
    }

    public static Connection getConnectionHuespedes() {

        if (connectionHuespedes == null) {

            String url = "jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimeZone=UTC";
            String user = "root";
            String password = "Erc159753.";
            try {
                connectionHuespedes = DriverManager.getConnection(url, user, password);
                System.out.println("se inicio la conexion");

            } catch (SQLException ex) {
                Logger.getLogger(ConexionController.class
                        .getName()).log(Level.SEVERE, null, ex);
                System.out.println("error de conexion");

            }

            return connectionHuespedes;
        }
        return null;
    }

    public static Connection getConnectionReservas() {

        if (connectionReservas == null) {

            String url = "jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimeZone=UTC";
            String user = "root";
            String password = "Erc159753.";
            try {
                connectionReservas = DriverManager.getConnection(url, user, password);
                System.out.println("se inicio la conexion");

            } catch (SQLException ex) {
                Logger.getLogger(ConexionController.class
                        .getName()).log(Level.SEVERE, null, ex);
                System.out.println("error de conexion");

            }

            return connectionReservas;
        }
        return null;
    }

    public static void closeConnectionHuespedes() {
        if (connectionHuespedes != null) {
            try {
                connectionHuespedes.close();
                System.out.println("se cerro la conexion");

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("error al cerrar la conexion");

            } finally {
                connectionHuespedes = null;
                System.out.println("se cerro la conexion");

            }
        }
    }

    public static void closeConnectionReservas() {
        if (connectionReservas != null) {
            try {
                connectionReservas.close();
                System.out.println("se cerro la conexion");

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("error al cerrar la conexion");

            } finally {
                connectionReservas = null;
                System.out.println("se cerro la conexion");

            }
        }
    }
}
