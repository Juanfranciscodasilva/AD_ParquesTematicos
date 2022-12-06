package BBDD.sqlite;

import BBDD.mysql.*;
import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLITE_EspectaculoBD {
    
    public static void insertEspectaculo(Espectaculo espe) throws SQLException, Exception{
            Connection con = SQLITE_BD.conectarBD();
            String sql = "INSERT INTO ESPECTACULOS VALUES(null,?,?,?,?,0,?)";
            PreparedStatement state = con.prepareStatement(sql);
        try{
            state.setString(1, espe.getNombre());
            state.setInt(2, espe.getAforo());
            state.setString(3, espe.getDescripcion());
            state.setString(4, espe.getLugar());
            state.setString(5, espe.getEncargado().getDni());
            state.executeUpdate();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
       
    }
    
    public static void updateEspectaculo(Espectaculo espe) throws SQLException, Exception{
            Connection con = SQLITE_BD.conectarBD();
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ESPECTACULOS SET ");
            sql.append("NOMBRE = ?, AFORO = ?, DESCRIPCION = ?, ");
            sql.append("LUGAR = ?, BAJA = ?, EMPLEADO_FK = ? ");
            sql.append("WHERE ID = ?");
            PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            state.setString(1, espe.getNombre());
            state.setInt(2, espe.getAforo());
            state.setString(3, espe.getDescripcion());
            state.setString(4, espe.getLugar());
            state.setBoolean(5, espe.isBaja());
            state.setString(6, espe.getEncargado().getDni());
            state.setInt(7, espe.getId());
            state.executeUpdate();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
    
    public static void deleteEspectaculo(Espectaculo espe) throws SQLException, Exception{
        Connection con = SQLITE_BD.conectarBD();
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM ESPECTACULOS WHERE ID = ? ");
        PreparedStatement state = con.prepareStatement(sql.toString());
        try{
            SQLITE_EspectaculoClienteBD.deleteAllFromEspectaculo(espe.getId());
            state.setInt(1, espe.getId());
            state.executeUpdate();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
    
    public static List<Espectaculo> getAllEspectaculos() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id idEspectaculo, e.nombre nombreEspectaculo, e.aforo aforoEspectaculo, ");
        sql.append("e.descripcion descripcionEspectaculo, e.lugar lugarEspectaculo, e.baja bajaEspectaculo, ");
        sql.append("em.dni dniEmpleado, em.nombre nombreEmpleado, em.apellido apellidoEmpleado, ");
        sql.append("em.fecha_nacimiento nacimientoEmpleado, em.fecha_contrato contratoEmpleado, ");
        sql.append("em.nacionalidad nacionalidadEmpleado, em.cargo cargoEmpleado, em.baja bajaEmpleado ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        Statement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosWithClientes() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id idEspectaculo, e.nombre nombreEspectaculo, e.aforo aforoEspectaculo, ");
        sql.append("e.descripcion descripcionEspectaculo, e.lugar lugarEspectaculo, e.baja bajaEspectaculo, ");
        sql.append("em.dni dniEmpleado, em.nombre nombreEmpleado, em.apellido apellidoEmpleado, ");
        sql.append("em.fecha_nacimiento nacimientoEmpleado, em.fecha_contrato contratoEmpleado, ");
        sql.append("em.nacionalidad nacionalidadEmpleado, em.cargo cargoEmpleado, em.baja bajaEmpleado ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        Statement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                List<Cliente> listaClientes = SQLITE_ClienteBD.getAllClientesFromEspectaculo(espec.getId());
                espec.setListaClientes(listaClientes);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosNoBajaWithClientes() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id idEspectaculo, e.nombre nombreEspectaculo, e.aforo aforoEspectaculo, ");
        sql.append("e.descripcion descripcionEspectaculo, e.lugar lugarEspectaculo, e.baja bajaEspectaculo, ");
        sql.append("em.dni dniEmpleado, em.nombre nombreEmpleado, em.apellido apellidoEmpleado, ");
        sql.append("em.fecha_nacimiento nacimientoEmpleado, em.fecha_contrato contratoEmpleado, ");
        sql.append("em.nacionalidad nacionalidadEmpleado, em.cargo cargoEmpleado, em.baja bajaEmpleado ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        sql.append("WHERE e.baja = 0 ");
        Statement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                List<Cliente> listaClientes = SQLITE_ClienteBD.getAllClientesFromEspectaculo(espec.getId());
                espec.setListaClientes(listaClientes);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static Espectaculo mappearEspectaculo(ResultSet result) throws SQLException, Exception{
        Espectaculo espec = new Espectaculo();
        if(result != null){
            espec.setId(result.getInt("ID"));
            espec.setNombre(result.getString("NOMBRE"));
            espec.setAforo(result.getInt("AFORO"));
            espec.setDescripcion(result.getString("DESCRIPCION"));
            espec.setLugar(result.getString("LUGAR"));
            espec.setBaja(result.getBoolean("BAJA"));
        }
        return espec;
    }
    
    public static Espectaculo mappearSelectAllWithEncargado(ResultSet result) throws SQLException, Exception{
        Espectaculo espec = new Espectaculo();
        if(result != null){
            espec.setId(result.getInt("idEspectaculo"));
            espec.setNombre(result.getString("nombreEspectaculo"));
            espec.setAforo(result.getInt("aforoEspectaculo"));
            espec.setDescripcion(result.getString("descripcionEspectaculo"));
            espec.setLugar(result.getString("lugarEspectaculo"));
            espec.setBaja(result.getBoolean("bajaEspectaculo"));
            Empleado emple = new Empleado();
            emple.setDni(result.getString("dniEmpleado"));
            emple.setNombre(result.getString("nombreEmpleado"));
            emple.setApellido1(result.getString("apellidoEmpleado"));
            emple.setFechaNacimiento(result.getDate("nacimientoEmpleado"));
            emple.setFechaContratacion(result.getDate("contratoEmpleado"));
            emple.setNacionalidad(result.getString("nacionalidadEmpleado"));
            emple.setCargo(result.getString("cargoEmpleado"));
            emple.setBaja(result.getBoolean("bajaEmpleado"));
            espec.setEncargado(emple);
        }
        return espec;
    }
    
    public static List<Espectaculo> getEspectaculosBajaFalse() throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.id idEspectaculo, e.nombre nombreEspectaculo, e.aforo aforoEspectaculo, ");
        sql.append("e.descripcion descripcionEspectaculo, e.lugar lugarEspectaculo, e.baja bajaEspectaculo, ");
        sql.append("em.dni dniEmpleado, em.nombre nombreEmpleado, em.apellido apellidoEmpleado, ");
        sql.append("em.fecha_nacimiento nacimientoEmpleado, em.fecha_contrato contratoEmpleado, ");
        sql.append("em.nacionalidad nacionalidadEmpleado, em.cargo cargoEmpleado, em.baja bajaEmpleado ");
        sql.append("FROM ESPECTACULOS e ");
        sql.append("LEFT JOIN EMPLE em ON e.EMPLEADO_FK = em.DNI ");
        sql.append("WHERE e.baja = 0");
        Statement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.createStatement();
            ResultSet result = state.executeQuery(sql.toString());
            while(result.next()){
                Espectaculo espec = mappearSelectAllWithEncargado(result);
                espectaculos.add(espec);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosFromCliente(String dniCliente) throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT e.* FROM espectaculo_cliente ec ");
        sql.append("LEFT JOIN espectaculos e ON e.ID = ec.ID_ESPECTACULO ");
        sql.append("WHERE ec.DNI_CLIENTE = ? ");
        PreparedStatement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.prepareStatement(sql.toString());
            state.setString(1, dniCliente);
            ResultSet result = state.executeQuery();
            while(result.next()){
                Espectaculo espe = mappearEspectaculo(result);
                espectaculos.add(espe);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
    
    public static List<Espectaculo> getAllEspectaculosFromEmpleado(String dniEmpleado) throws SQLException, Exception{
        List<Espectaculo> espectaculos = new ArrayList<>();
        Connection con = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM espectaculos WHERE EMPLEADO_FK = ?");
        PreparedStatement state = null;
        try{
            con = SQLITE_BD.conectarBD();
            state = con.prepareStatement(sql.toString());
            state.setString(1, dniEmpleado);
            ResultSet result = state.executeQuery();
            while(result.next()){
                Espectaculo espe = mappearEspectaculo(result);
                espectaculos.add(espe);
            }
            result.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            if(state != null){
                state.close();
            }
            if(con != null){
                con.close();
            }
        }
        return espectaculos;
    }
}
