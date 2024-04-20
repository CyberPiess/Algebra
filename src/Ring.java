public class Ring<T> {
    private final Monoid<T> multiplyMonoid;
    private final Group<T> SumGroup;

    public Ring(Monoid<T> multiplicationMonoid, Group<T> additionGroup) {
        this.multiplyMonoid = multiplicationMonoid;
        this.SumGroup = additionGroup;
    }

    public T add(T a, T b) {
        return SumGroup.Operation(a, b);
    }

    public T multiply(T a, T b) {
        return multiplyMonoid.Operation(a, b);
    }

    public T negate(T a) {
        return SumGroup.Inverse(a);
    }

    public T zero() {
        return multiplyMonoid.Zero();
    }

    public T one() {
        return SumGroup.Zero();
    }
}