public class FastOperation<T> {
    private final Monoid<T> monoid;

    public FastOperation(Monoid<T> monoid) {
        this.monoid = monoid;
    }

    public T apply(T element) {
        T result = monoid.Zero();

        if (result.equals(1)) {
            for (int i = 0; i < (int)element; i++) {
                result = monoid.Operation(result, element);
            }
        } else {
            result = monoid.Operation(result, element);
        }

        return result;
    }
}