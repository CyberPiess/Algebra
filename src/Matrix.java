public class Matrix<T> {
    private final T[][] data;
    private final Ring<T> ring;

    public Matrix(T[][] data, Ring<T> ring) {
        this.data = data;
        this.ring = ring;
    }

    public void scalarMultiply(T scalar) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = ring.multiply(data[i][j], scalar);
            }
        }
    }

    public void print() {
        for (T[] row : data) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}