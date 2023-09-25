
package com.mycompany.DAO;

import com.mycompany.hotel.Reservas;
import javax.swing.JTable;

public interface ReservaDAO {

    public void registrar(Reservas reserva);
    public void modificar(JTable tabla);
    public void eliminar(JTable tabla);
    public void buscar(Reservas reserva);
    public void listarReserva();
}
