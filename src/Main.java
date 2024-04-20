public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 2, 4, 6};
        Double[] doublesArray = {1.1, 3.6, 2.4, 2.6, 2.7, 10.1};


        Monoid<Integer> maxMonoid = new MaxMonoid();
        Monoid<Double> minMonoid = new MinMonoid();
        SegmentTree<Double> minSegmentTree = new SegmentTree<>(doublesArray, minMonoid);


        System.out.println("Максимум из чисел: " + maxMonoid.Operation(3, 5));
        System.out.println("Минимум из чисел: " + minMonoid.Operation(3.5, 5.6));
        System.out.println("Дерево отрезков " + minSegmentTree.Find(4,6));


        Group<Integer> sumGroup = new SumGroup();
        Group<Double> multiplyGroup = new MultiplyGroup();


        System.out.println("Обратный элемент для 3 в группе со сложением: " + sumGroup.Inverse(3));
        System.out.println("Обратный элемент для 2.0 в группе с умножением: " + multiplyGroup.Inverse(2.0));


        PrefixSum<Integer> prefixSum = new PrefixSum<>(array, sumGroup);

        System.out.println("Префиксная сумма от 0 до 3: " + prefixSum.prefixSumFunc(0, 3));
        System.out.println("Префиксная сумма от 2 до 5: " + prefixSum.prefixSumFunc(2, 5));


        Monoid<Integer>  multiplyMonoid = new MultiplyMonoid();

        Ring<Integer> integerRing = new Ring<>(multiplyMonoid, sumGroup);
        int result =  integerRing.multiply(2, 3);
        result = integerRing.add(result, 4);
        System.out.println("Результат умножения и сложения: " + result);


        Monoid<Boolean> boolMultiplyMonoid = new BoolMultiplyMonoid();
        Group<Boolean> boolSumGroup= new BoolSumGroup();

        Ring<Boolean> booleanRing = new Ring<>(boolMultiplyMonoid, boolSumGroup);
        boolean boolResult = booleanRing.multiply(true, false);
        boolResult = booleanRing.add(boolResult, true);
        System.out.println("Результат итераций над логическими занчениями: " + boolResult);

        Integer[][] data = {{1, 2}, {3, 4}};
        Matrix<Integer> matrix = new Matrix<>(data, integerRing);
        matrix.scalarMultiply(2);
        System.out.println("Умножение матрицы на скаляр: ");
        matrix.print();

        Integer[] coefficients = {1, 2, 3};

        Polynom<Integer> polynom = new Polynom<>(coefficients, integerRing);
        System.out.println("Полином: " + polynom);
    }
}
