public class BoolMultiplyMonoid implements Monoid<Boolean>{
    public BoolMultiplyMonoid() {}

    public Boolean Zero() {
        return true;
    }

    public Boolean Operation(Boolean a, Boolean b) {
        return a && b;
    }
}
