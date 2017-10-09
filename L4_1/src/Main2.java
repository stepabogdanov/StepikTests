

public class Main2 {
    public static void main(String[] args) {

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();

    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            String str;
            str = ex.getStackTrace()[1].getMethodName();
            if (str.equals("main")){
                str = null;
            }

            else {

               str = ex.getStackTrace()[0].getClassName() + "#" + ex.getStackTrace()[1].getMethodName();
            }

            return str;
        }

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

}
