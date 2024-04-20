public class MaxMonoid implements Monoid<Integer> {
    public MaxMonoid() {}

    public Integer Zero() {
       return 0;
    }

    public Integer Operation(Integer a, Integer b){
        return Math.max(a, b);
    }
}
