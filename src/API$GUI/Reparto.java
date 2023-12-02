package API$GUI;

public class Reparto {

    private String nombreActor;
    private String rol;

    // Constructor, getters y setters
    public Reparto(String nombreActor, String rol) {
        this.nombreActor = nombreActor;
        this.rol = rol;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public String getRol() {
        return rol;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
