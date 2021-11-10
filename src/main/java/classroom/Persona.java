package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        cedula = 0;
    }

    Persona(){
        this(0);
    }

    Persona(String nombre) {
        this(nombre,1)
    }   
    
    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }
    
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
