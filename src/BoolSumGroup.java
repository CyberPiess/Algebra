public class BoolSumGroup implements Group<Boolean>{
    public Boolean Zero() {
        return false;
    }
    public Boolean Operation(Boolean a, Boolean b) {
        return a || b;
    }
    public Boolean Inverse(Boolean element) {
        return !element;
    }
}
