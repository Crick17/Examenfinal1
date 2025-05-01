public class Heroe {
    private String nombre;
    private String raza;
    private int nivelPoder;
    private String habilidad;

    public Heroe() {
        this.nombre = "Spider-Man";
        this.raza = "Humano";
        this.nivelPoder = 80;
        this.habilidad = "Agilidad";
    }

    public Heroe(String nombre, String raza, int nivelPoder, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }

    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
    public int getNivelPoder() { return nivelPoder; }
    public String getHabilidad() { return habilidad; }
}

