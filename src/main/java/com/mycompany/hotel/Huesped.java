package com.mycompany.hotel;

import java.sql.Date;

public class Huesped {

    private int numeroDeHuesped;
    private String nombre;
    private String apellido;
    private java.sql.Date fechaDeNacimiento;
    private String nacionalidad;
    private String telefono;

    public Huesped() {

    }

    public Huesped(String nombre, String apellido, Date fechaDeNacimiento, String nacionalidad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public Integer getNumeroDeHuested() {
        return numeroDeHuesped;
    }

    public void setNumeroDeHuested(Integer numeroDeHuested) {
        this.numeroDeHuesped = numeroDeHuested;
    }

    public String getNombreHuesped() {
        return nombre;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombre = nombreHuesped;
    }

    public String getApellidoHuesped() {
        return apellido;
    }

    public void setApellidoHuesped(String apellidoHuesped) {
        this.apellido = apellidoHuesped;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(java.sql.Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
