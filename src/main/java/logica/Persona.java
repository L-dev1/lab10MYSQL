package logica;

public abstract class Persona {
    //Atributos de una persona (faltan algunos claro)
    private int codigo;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    //Constructor
    public Persona() {}
    public Persona(int codigo, String nombre, String apellido,  int dni, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }
    //metodo
    //Getters y setters para esta clase abstracta

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
