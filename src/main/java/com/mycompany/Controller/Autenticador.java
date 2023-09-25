package com.mycompany.Controller;

import com.mycompany.DAO.AutenticadorDAO;
import com.mycompany.hotel.Login;
import java.util.HashMap;
import java.util.Map;

public class Autenticador extends Login implements AutenticadorDAO {

    private static Map<String, String> listaUsuarios = new HashMap<>();

    public Autenticador() {
        this.listaUsuarios.put("admin", "admin");
        System.out.println(listaUsuarios.get("admin"));
    }

    @Override
    public void registrar(Login login) {

        String ususario = login.getUsuario();
        String password = login.getPassword();
        listaUsuarios.put(ususario, password);
    }

    @Override
    public void eliminar(Login login) {

    }

    @Override
    public void modificar(Login login, String newPassword) {
        
        String usuario = login.getUsuario();
        String password = login.getPassword();
        
        listaUsuarios.replace(usuario,password, newPassword);

    }

    public boolean obtenerAutentificacion(Login login) {

        String usuario= login.getUsuario();
        String passwordUtilizado = login.getPassword();
        String password= listaUsuarios.get(usuario);
        
        System.out.println("com.mycompany.Controller.Autenticador.obtenerAutentificacion()");
                System.out.println("usuario = "+usuario + " passwordUtilizado = "+passwordUtilizado + " password = "+password);
        System.out.println(passwordUtilizado.equals(password));
        
        return passwordUtilizado.equals(password);
        
    }

}
