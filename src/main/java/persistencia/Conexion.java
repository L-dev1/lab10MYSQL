package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    String url="jdbc:mysql://localhost:3306/";
    String bd="instituto";
    String usuario="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection con;
    //Constructor
    public Conexion() {}
    public Connection Conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url+bd, usuario,password);
            System.out.println("Conectado");
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar la base de datos" + e.getMessage());
        }
        return con;
    }
    public void desconectar() {
        try{

            con.close();
        }catch (SQLException e) {
            System.out.println("Error al desconectar la base de datos");
        }
    }
}
