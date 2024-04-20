public class MultiplyMonoid implements Monoid<Integer> {
    public MultiplyMonoid() {}

    public Integer Zero() {
        return 1;
    }

    public Integer Operation(Integer a, Integer b){
        return a*b;
    }
}
