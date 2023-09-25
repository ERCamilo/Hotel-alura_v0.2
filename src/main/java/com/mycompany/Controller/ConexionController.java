package com.mycompany.Controller;

import com.mycompany.DBAdmin.AutenticadorDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionController {

    private static Connection connectionHuespedes;
    private static Connection connectionReservas;

    public ConexionController() {
//        ConexionController.url = AutenticadorDB.getUrl();
//        ConexionController.user = AutenticadorDB.getUser();
//        ConexionController.password = AutenticadorDB.getPassword();
    }

    public Connection obtenerConexion() {

        try {

            AutenticadorDB abd = new AutenticadorDB();
            String user = abd.getUser();
            String url = abd.getUrl();
            String password = abd.getPassword();

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

            try {
                AutenticadorDB abd = new AutenticadorDB();
                String user = abd.getUser();
                String url = abd.getUrl();
                String password = abd.getPassword();

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

            try {
                AutenticadorDB abd = new AutenticadorDB();
                String user = abd.getUser();
                String url = abd.getUrl();
                String password = abd.getPassword();
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
