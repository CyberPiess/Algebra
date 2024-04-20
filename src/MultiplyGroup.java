public class MultiplyGroup implements Group<Double> {
    public MultiplyGroup() {}

    public Double Zero() {
        return 1.0;
    }

    public Double Operation(Double a, Double b) {
        return a * b;
    }

    public Double Inverse(Double element) {
        if (element == 0.0) {
            throw new IllegalArgumentException("Cannot find inverse for zero");
        }
        return 1 / element;
    }
}

