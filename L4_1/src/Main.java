import static java.lang.Float.NaN;

public class Main {
    public static void main(String[] args) {
        double x = 20;
        System.out.println(sqrt(x));
    }

    public static double sqrt(double x) {

            if (x >= 0) {
                x = Math.sqrt(x);
            }
            else throw new IllegalArgumentException ("Expected non-negative number, got " + x);
//         catch (IllegalArgumentException ex) {
//            //System.out.println("Expected non-negative number, got " + x);
//            //System|.out.println(ex.toString());
//            //System.out.println(ex.getMessage());
//            ex.printStackTrace();
//            //System.err.println("Expected non-negative number, got " + x);
//        }

        return  x; // your implementation here
    }
}
