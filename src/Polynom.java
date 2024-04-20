import java.util.List;
import java.util.ArrayList;
public class Polynom<T> {
    private final T[] coefficients;
    private final Ring<T> ring;

    public Polynom(T[] coefficients, Ring<T> ring) {
        this.coefficients = coefficients;
        this.ring = ring;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            if (i == 0) {
                builder.append(coefficients[i]);
            } else {
                builder.append(" + ").append(coefficients[i]).append("x^").append(i);
            }
        }
        return builder.toString();
    }
}