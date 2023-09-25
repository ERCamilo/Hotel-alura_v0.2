package com.mycompany.hotel;

import java.sql.Date;

public class Reservas {

    private Integer numeroDeReserva;
    private java.sql.Date checkIn;
    private java.sql.Date checkOut;
    private Double valor;
    private String formaDePago;
    private  int IdHuesped;

    public Reservas() {
    }

    public Reservas(Date checkIn, Date checkOut, Double valor, String formaDePago) {

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.valor = valor;
        this.formaDePago = formaDePago;
    }

    public int getIdHuesped() {
        return IdHuesped;
    }

    public void setIdHuesped(Integer idHuesped) {

        if (idHuesped != -1) {
            this.IdHuesped = idHuesped;
        } else {
            System.out.println("com.mycompany.hotel.Reservas.setIdHuesped()");

            System.out.println("No se pudo obtener el ID del Huesped");
        }
    }

    public Integer getNumeroDeReserva() {
        return numeroDeReserva;
    }

    public void setNumeroDeReserva(Integer numeroDeReserva) {
        this.numeroDeReserva = numeroDeReserva;
    }

    public java.sql.Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public java.sql.Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

}
