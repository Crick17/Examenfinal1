import java.util.LinkedList;
import java.util.Queue;

public class ColaHeroes {
    private Queue<Heroe> cola;

    public ColaHeroes() {
        cola = new LinkedList<>();
    }


    public void mostrarHeroesConPoderReal() {
        for (Heroe h : cola) {
            double multiplicador;
            switch (h.getRaza()) {
                case "Mutante":
                    multiplicador = 1.3;
                    break;
                case "Alienígena":
                    multiplicador = 1.5;
                    break;
                default:
                    multiplicador = 1.0;
                    break;
            }
            double poderReal = h.getNivelPoder() * multiplicador;

            System.out.println("Nombre: " + h.getNombre());
            System.out.println("Raza: " + h.getRaza());
            System.out.println("Nivel Poder: " + h.getNivelPoder());
            System.out.println("Habilidad: " + h.getHabilidad());
            System.out.printf("Poder Real Calculado: %.2f\n", poderReal);
            System.out.println("-------------------------------");
        }
    }
}