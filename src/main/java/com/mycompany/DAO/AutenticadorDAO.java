
package com.mycompany.DAO;

import com.mycompany.hotel.Login;



public interface AutenticadorDAO {
    
       public  void registrar(Login login);
       public void eliminar(Login login);
       public void modificar(Login login, String newPassword);
}
