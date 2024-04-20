public class PrefixSum<T> {
    private final SegmentTree<T> segmentTree;

    public PrefixSum(T[] array, Monoid<T> monoid) {
        this.segmentTree = new SegmentTree<>(array, monoid);
    }

    public T prefixSumFunc(int start, int end) {
        return segmentTree.Find(start, end);
    }
}