import java.util.Objects;

public class Trabajador {
    private String nombre;
    private double salario;

    public Trabajador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador: " + nombre + " | Salario: $" + salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(nombre, that.nombre) // == 0 && Double.compare(salario, that.salario)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, salario);
    }

    //nomina
    public double getSalario() {
        return salario;
    }
}