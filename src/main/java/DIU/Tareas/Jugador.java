package DIU.Tareas;

/**
 *
 * @author Belial
 */
public class Jugador {

    private String apellidos;
    private int edad;
    private String puesto;
    private String nacionalidad;
    private int goles;

    public Jugador(String apellidos, int edad, String puesto, String nacionalidad, int goles) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

}
