package logica;

import persistencia.Conexion;

import java.sql.*;
import java.util.Scanner;

public class Alumno extends Persona implements  InterfaceAgregarPersona{

    //Constructor heredado
    public Alumno(){}
    public Alumno(int codigo, String nombre, String apellido, int dni, String direccion) {
        super(codigo, nombre, apellido, dni, direccion);
    }
    //Metodo para pedir datos de para agregar
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ponga el codigo del alumno");
        setCodigo(sc.nextInt());
        System.out.println("Ponga el nombre del alumno");
        setNombre(sc.next());
        System.out.println("Ponga el apellido del alumno");
        setApellido(sc.next());
        System.out.println("Ponga el dni del alumno");
        setDni(sc.nextInt());
        System.out.println("Ponga el direccion del alumno");
        setDireccion(sc.next());

    }

    //metodo agregar persona
    @Override
    public void agregarAlumno() {
        Conexion con = new Conexion();
        PreparedStatement ps;
        String sql= "INSERT INTO Alumnos (Codigo, Nombre, Apellido, DNI, Direccion) VALUES (?,?,?,?,?)";

        try{
            Alumno alumno = new Alumno();
            alumno.pedirDatos();
            ps = con.Conectar().prepareStatement(sql);
            ps.setInt(1, alumno.getCodigo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setInt(4, alumno.getDni());
            ps.setString(5, alumno.getDireccion());
            int filasInsertadas = ps.executeUpdate();

            System.out.println("Inserto exitosamente");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error al insertar");
        }

    }

    @Override
    public void datosAlumnos() {
        

        try {
            Conexion conex = new Conexion();
            Statement st;
            ResultSet rs;
            st = conex.Conectar().createStatement();
            rs = st.executeQuery("SELECT * FROM alumnos");
            while (rs.next()) {
                int Codigo = rs.getInt("Codigo");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int DNI = rs.getInt("DNI");
                String Direccion = rs.getString("Direccion");
                System.out.println(Codigo + "|" + Nombre + "|" + Apellido + "|" + DNI + "|" + Direccion);
                conex.desconectar();
            }
        } catch (Exception e) {
            System.out.println("Errorrrr: " + e.getMessage());
        }

    }
}
