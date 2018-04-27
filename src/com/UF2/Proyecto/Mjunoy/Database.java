package com.UF2.Proyecto.Mjunoy;

import com.UF2.Proyecto.Mjunoy.model.Administrador;
import com.UF2.Proyecto.Mjunoy.model.Tienda;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    static final String url = "jdbc:sqlite:BBDD/veterinapp.db";
    static final int DATABASE_VERSION = 10;

    static Database instance;
    static Connection conn;

    public static Database get(){
        if (instance == null) {
            instance = new Database();

            try {

                conn = DriverManager.getConnection(url);
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }

            if (instance.getVersion() != DATABASE_VERSION){
                System.out.println( "VERSION = " + instance.getVersion());
                instance.upgradeDatabase();
                instance.setVersion();
            }
        }
        return instance;
    }

    public int getVersion(){
        try (Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery("PRAGMA user_version");
            while (rs.next()) {
                return rs.getInt( "user_version");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void setVersion(){
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("PRAGMA user_version = "+ DATABASE_VERSION);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    void upgradeDatabase(){
        deleteTables();
        createTable();
    }

    void deleteTables(){
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS tiendas");
            stmt.execute("DROP TABLE IF EXISTS veterinarios");
            stmt.execute("DROP TABLE IF EXISTS administradores");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    void createTable(){
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS tiendas (" +
                    "codigo_T integer primary key autoincrement," +
                    "nombre text," +
                    "direccion text," +
                    "telefono integer," +
                    "horario text," +
                    "web text," +
                    "especializacion text," +
                    "peluqueria boolean," +
                    "puntuacion integer," +
                    "mostrar boolean);");
            stmt.execute("CREATE TABLE IF NOT EXISTS veterinarios (" +
                    "codigo_V integer primary key autoincrement," +
                    "nombre text," +
                    "direccion text," +
                    "telefono integer," +
                    "horario text," +
                    "web text," +
                    "especializacion text," +
                    "visita_N real," +
                    "visita_U real," +
                    "vacuna real," +
                    "chipado real," +
                    "urgencias24 boolean," +
                    "puntuacion integer," +
                    "mostrar boolean);");
            stmt.execute("CREATE TABLE administradores (" +
                    "codigo_A integer primary key autoincrement," +
                    "usuario text," +
                    "contraseña text);");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertTienda(Tienda tienda){
        String sql= "INSERT INTO tiendas(nombre,direccion,telefono," +
                "horario,web,especializacion,peluqueria,puntuacion,mostrar)" +
                "VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,tienda.nombre);
            pstmt.setString(2,tienda.direccion);
            pstmt.setInt(3,tienda.telefono);
            pstmt.setString(4,tienda.horario);
            pstmt.setString(5,tienda.web);
            pstmt.setString(6,tienda.especializacion);
            pstmt.setBoolean(7,tienda.peluqueria);
            pstmt.setInt(8,0);
            pstmt.setBoolean(9,false);
            pstmt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void insertVeterinario(Veterinario veterinario){
        String sql= "INSERT INTO veterinarios(nombre,direccion,telefono," +
                "horario,web,especializacion,visita_N,visita_U,vacuna," +
                "chipado,urgencias24,puntuacion,mostrar)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,veterinario.nombre);
            pstmt.setString(2,veterinario.direccion);
            pstmt.setInt(3,veterinario.telefono);
            pstmt.setString(4,veterinario.horario);
            pstmt.setString(5,veterinario.web);
            pstmt.setString(6,veterinario.especializacion);
            pstmt.setDouble(7,veterinario.visita_N);
            pstmt.setDouble(8,veterinario.visita_U);
            pstmt.setDouble(9,veterinario.vacuna);
            pstmt.setDouble(10,veterinario.chipado);
            pstmt.setBoolean(11,veterinario.urgencias24);
            pstmt.setInt(12,0);
            pstmt.setBoolean(13,false);
            pstmt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void insertAdministrador(Administrador administrador){
        String sql="INSERT INTO administradores(usuario,contraseña)" +
                "VALUES (?,?)";

        try (PreparedStatement pstmt= conn.prepareStatement(sql)){
            pstmt.setString(1,administrador.usuario);
            pstmt.setString(2,administrador.contraseña);
            pstmt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static List<Tienda> selectAllTiendas(){

        List<Tienda> resultado= new ArrayList<>();

        String sql="SELECT * FROM tiendas";

        try (Statement stmt = conn.createStatement()){

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Tienda tienda = new Tienda(rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getInt("telefono"),
                        rs.getString("horario"),
                        rs.getString("web"),
                        rs.getString("especializacion"),
                        rs.getBoolean("peluqueria"),
                        rs.getInt("puntuacion"),
                        rs.getBoolean("mostrar"),
                        rs.getInt("codigo_T"));
                resultado.add(tienda);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return resultado;
    }
    public static List<Veterinario> selectAllVeterinarios(){

        List<Veterinario> resultado= new ArrayList<>();

        String sql="SELECT * FROM veterinarios";

        try (Statement stmt = conn.createStatement()){

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Veterinario veterinario = new Veterinario(rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getInt("telefono"),
                        rs.getString("horario"),
                        rs.getString("web"),
                        rs.getString("especializacion"),
                        rs.getDouble("visita_N"),
                        rs.getDouble("visita_U"),
                        rs.getDouble("vacuna"),
                        rs.getDouble("chipado"),
                        rs.getBoolean("urgencias24"),
                        rs.getInt("puntuacion"),
                        rs.getBoolean("mostrar"),
                        rs.getInt("codigo_V"));
                resultado.add(veterinario);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return resultado;
    }

    public static List<Administrador> selectAllAdministradores(){
        List<Administrador> administradores = new ArrayList<>();

        String sql="SELECT * FROM administradores";

        try (Statement stmt = conn.createStatement()){

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Administrador administrador = new Administrador(rs.getString("usuario"),
                        rs.getString("contraseña"));

                administradores.add(administrador);
             }
        }catch (SQLException e){

            System.out.println(e.getMessage());
        }

        return administradores;
    }

    public static boolean añadirPuntuacionTienda(int puntuacion,int codigo){
        boolean resultado=false;

        String sql ="UPDATE tiendas set puntuacion= ? where codigo_T = ?;";
        try (PreparedStatement pstmt= conn.prepareStatement(sql)){
            pstmt.setInt(1,puntuacion);
            pstmt.setInt(2,codigo);
            pstmt.execute();
            resultado = true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static boolean añadirPuntuacionVeterinario(int puntuacion,int codigo){
        boolean resultado=false;

        String sql ="UPDATE veterinarios set puntuacion= ? where codigo_V = ?;";
        try (PreparedStatement pstmt= conn.prepareStatement(sql)){
            pstmt.setInt(1,puntuacion);
            pstmt.setInt(2,codigo);
            pstmt.execute();
            resultado = true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static boolean autorizarTienda(boolean mostrar,int codigo){
        boolean resultado=false;

        String sql ="UPDATE tiendas set mostrar= ? where codigo_T = ?;";
        try (PreparedStatement pstmt= conn.prepareStatement(sql)){
            pstmt.setBoolean(1,mostrar);
            pstmt.setInt(2,codigo);
            pstmt.execute();
            resultado = true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static boolean autorizarVeterinario(boolean mostrar,int codigo){
        boolean resultado=false;

        String sql ="UPDATE veterinarios set mostrar= ? where codigo_V = ?;";
        try (PreparedStatement pstmt= conn.prepareStatement(sql)){
            pstmt.setBoolean(1,mostrar);
            pstmt.setInt(2,codigo);
            pstmt.execute();
            resultado = true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return resultado;
    }
}
