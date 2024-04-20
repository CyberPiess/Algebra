public class SegmentTree<T> {
    private final T[] tree;
    private final T[] array;
    private final Monoid<T> monoid;

    public SegmentTree(T[] array, Monoid<T> monoid) {
        this.array = array;
        this.monoid = monoid;
        int n = array.length;
        this.tree = (T[]) new Object[4 * n];
        Build(1, 0, n - 1);
    }

    private void Build(int node, int start, int end) {
        if (start == end) {
            tree[node] = array[start];
        } else {
            int mid = (start + end) / 2;
            Build(2 * node, start, mid);
            Build(2 * node + 1, mid + 1, end);
            tree[node] = monoid.Operation(tree[2 * node], tree[2 * node + 1]);
        }
    }

    public T query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return monoid.Zero();
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        T left = query(2 * node, start, mid, l, r);
        T right = query(2 * node + 1, mid + 1, end, l, r);
        return monoid.Operation(left, right);
    }

    public T Find(int l, int r) {
        return query(1, 0, array.length - 1, l, r);
    }
}