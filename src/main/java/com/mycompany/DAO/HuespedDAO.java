package com.mycompany.DAO;

import com.mycompany.hotel.Huesped;
import javax.swing.JTable;

public interface HuespedDAO {

    public int registrar(Huesped huesped);
    public void modificar(JTable tabla);
    public void eliminar(JTable tabla);
    public void buscar(Huesped huesped);
    public void listarHuesped();

}
