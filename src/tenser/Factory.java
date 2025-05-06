package tenser;

public class Factory {

    // 모든 메소드가 public static일 것
    public static Matrix getMatrix() {
        return new Matrix();
    }
    public static Vector getVector() {
        return new Vector();
    }
    public static Scalar getScalar() {
        return new Scalar();
    }


}
