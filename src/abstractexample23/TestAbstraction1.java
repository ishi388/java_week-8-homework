package abstractexample23;

/**
 * Create the fourth class name TestAbstraction1 and inside create the
 * main method as below.
 */
public class TestAbstraction1 {
    // In real scenario, method is called by programmer or user
    public static void main(String[] args) {
        Shape s=new Circle1();//In a real scenario, object is provided through method, eg getShape() method
        s.draw();
    }
}
