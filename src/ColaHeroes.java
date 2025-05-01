import java.util.LinkedList;
import java.util.Queue;

public class ColaHeroes {
    private Queue<Heroe> cola;

    public ColaHeroes() {
        cola = new LinkedList<>();
    }

    public void encolarHeroes() {
        cola.offer(new Heroe());
        cola.offer(new Heroe("Wolverine", "Mutante", 90, "Regeneración-Garras de adamaintuim "));
        cola.offer(new Heroe("Iron Man", "Humano", 85, "Tecnología-Millonario-Filantropo"));
        cola.offer(new Heroe("Thor", "Alienígena", 95, "Trueno-Dios del trueno"));
        cola.offer(new Heroe("Erick", "Mutante", 88, "Telepatía a objetos metalicos"));
        cola.offer(new Heroe("Megatron", "Robot", 120, "Armas potentes"));
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