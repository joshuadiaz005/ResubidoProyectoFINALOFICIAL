package Paquetes.Servicios;

import Paquetes.Entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioServices extends GestionDb<Usuario> {
    private static UsuarioServices instancia;
    private UsuarioServices (){
        super(Usuario.class);
    }

    public static UsuarioServices getInstancia(){
        if(instancia==null){
            instancia = new UsuarioServices();
        }
        return instancia;
    }


    public List<Usuario> getUsuario(String username){
        EntityManager entityManager = getEntityManager();
        Query query= entityManager.createNamedQuery("Usuario.findByUsername");
        query.setParameter("username", username+"%");
        return query.getResultList();
    }

}