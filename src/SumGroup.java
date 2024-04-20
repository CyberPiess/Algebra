public class SumGroup implements Group<Integer>{
    public SumGroup() {}

    public Integer Zero() {
        return 0;
    }

    public Integer Operation(Integer a, Integer b) {
        return a + b;
    }

    public Integer Inverse(Integer element) {
        return -element;
    }
}