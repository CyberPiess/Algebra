public class MinMonoid implements Monoid<Double> {
    public MinMonoid() {}

    public Double Zero() {
        return Double.POSITIVE_INFINITY;
    }

    public Double Operation(Double a, Double b){
        return Math.min(a, b);
    }
}
