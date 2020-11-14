package fundamentals.coderecap;

public class ConstantTest {
    public static final Point pointConstant = new Point(3,0);

    public static void main(String[] args) {
//        This would work if x would not be final
//        pointConstant.x=4;
        System.out.println(pointConstant.toString());
    }
}
