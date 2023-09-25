/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DBAdmin;

public class AutenticadorDB {

    private  String url = "jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimeZone=UTC";
    private  String user = "root";
    private  String password = "";

    public  String getUrl() {
        return url;
    }

    public  void setUrl(String url) {
        this.url = url;
    }

    public  String getUser() {
        return user;
    }

    public  void setUser(String user) {
         this.user = user;
    }

    public  String getPassword() {
        return password;
    }

    public  void setPassword(String password) {
        this.password = password;
    }

}
