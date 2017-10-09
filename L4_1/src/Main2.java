

public class Main2 {
    public static void main(String[] args) {

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        System.out.println(getCallerClassAndMethodName());
        m1();

    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            String str;
            StackTraceElement[] traceElements = new StackTraceElement[ex.getStackTrace().length];

//            str = ex.getStackTrace()[0].getMethodName();
            if (traceElements.length <= 2){
                str = null;
            }
//
            else {
               str = ex.getStackTrace()[ex.getStackTrace().length-(ex.getStackTrace().length-1)].getClassName() + "#" +
                       ex.getStackTrace()[ex.getStackTrace().length-(ex.getStackTrace().length -2)].getMethodName(); // + " number:" + traceElements.length;

            }
//            //System.out.println(traceElements.length);

            return str;
        }

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }



}
