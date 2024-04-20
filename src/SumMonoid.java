public class SumMonoid implements Monoid<Integer> {
    public SumMonoid() {}

    public Integer Zero() {
        return 0;
    }

    public Integer Operation(Integer a, Integer b){
        return a+b;
    }
}
