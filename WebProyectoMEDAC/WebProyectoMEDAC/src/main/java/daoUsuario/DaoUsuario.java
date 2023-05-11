/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoUsuario;

import conexion.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DaoUsuario {

    private static final Logger log = Logger.getLogger(DaoUsuario.class
            .getPackage().getName());

    public static void insertarUsuario(String nombre, String apellido1, String apellido2, String email, String contraseña) throws ClassNotFoundException, SQLException {

        Connection conexion = Conexion.conectar();
        Statement stm = conexion.createStatement();
        String insertIntoUsuario = "insert into usuario(nombre_usuario,apellido1_usuario,apellido2_usuario,email_usuario,contraseña_usuario)values";
        insertIntoUsuario += "('" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + email + "','" + contraseña + "')";
        //Execute update nos devuelve el número de filas insertadas
        int filas = stm.executeUpdate(insertIntoUsuario);
        log.log(Level.INFO, "N\u00famero de filas afectadas... {0]", filas);
        int registrosAfectados = stm.getUpdateCount();

        conexion.setAutoCommit(false);
        conexion.commit();
        if (registrosAfectados < 1) {
            conexion.rollback();
            conexion.close();
        }
        log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
        stm.close();
        conexion.close();

        boolean checkConexion = conexion.isClosed();
        log.log(Level.INFO, "Conexión cerrada...{0}", checkConexion);

    }

    public static void borrarUsuario(int id_usuario) throws ClassNotFoundException, SQLException {

        //delete from usuarios where id_usuario = 20;
        Connection conexion = Conexion.conectar();
        Statement stm = conexion.createStatement();
        String borrarUsuario = "delete from usuario where id_usuario =" + id_usuario;

        int filas = stm.executeUpdate(borrarUsuario);
        log.log(Level.INFO, "N\u00famero de filas afectadas... {0]", filas);
        int registrosAfectados = stm.getUpdateCount();

        conexion.setAutoCommit(false);
        conexion.commit();
        if (registrosAfectados < 1) {
            conexion.rollback();
            conexion.close();
        }
        log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
        stm.close();
        conexion.close();

        boolean checkConexion = conexion.isClosed();
        log.log(Level.INFO, "Conexión cerrada...{0}", checkConexion);

    }

    public static ArrayList<Usuario> verUsuario() throws ClassNotFoundException, SQLException {

        Connection conexion = Conexion.conectar();
        Statement stm = conexion.createStatement();
        String consultaUsuario = "select * from jugadores";
        ResultSet rsUsuario = stm.executeQuery(consultaUsuario);
        ArrayList<Usuario> lista_usuario = new ArrayList<>();
        while (rsUsuario.next()) {
            lista_usuario.add(new Usuario(rsUsuario.getInt("id_usuario"), rsUsuario.getString("nombre_usuario"), rsUsuario.getString("apellido1_usuario"), rsUsuario.getString("apellido2_usuario"),
                    rsUsuario.getString("email_usuario"), rsUsuario.getString("contraseña_usuario")));
        }

        return lista_usuario;
    }

    public static void actualizarUsuario(int id_usuario, String nombre, String apellido1, String apellido2, String email, String contraseña) throws ClassNotFoundException, SQLException {

        Connection conexion = Conexion.conectar();
        String actualizarUsuario = "update usuario set nombre_usuario = ?, apellido1_usuario = ?, apellido2_usuario = ?, email_usuario = ?, contraseña_usuario = ? where id_usuario = ?";
        PreparedStatement pstmt = conexion.prepareStatement(actualizarUsuario);

        pstmt.setString(1, nombre);
        pstmt.setString(2, apellido1);
        pstmt.setString(3, apellido2);
        pstmt.setString(4, email);
        pstmt.setString(5, contraseña);
        pstmt.setInt(6, id_usuario);

        int filas = pstmt.executeUpdate();
        log.log(Level.INFO, "N\u00famero de filas afectadas... {0]", filas);
        int registrosAfectados = pstmt.getUpdateCount();

        conexion.setAutoCommit(false);
        conexion.commit();
        if (registrosAfectados < 1) {
            conexion.rollback();
            conexion.close();
        }
        log.log(Level.INFO, "N\u00famero de registros afectados...{0}", registrosAfectados);
        pstmt.close();
        conexion.close();

        boolean checkConexion = conexion.isClosed();
        log.log(Level.INFO, "Conexión cerrada...{0}", checkConexion);

    }
}
