

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
            StackTraceElement[] traceElements = new StackTraceElement[ex.getStackTrace().length];

//            str = ex.getStackTrace()[0].getMethodName();
            if (traceElements.length <= 0){
                str = null;
            }
//
            else {
               str = ex.getStackTrace()[traceElements.length-1].getClassName() + "#" +
                       ex.getStackTrace()[traceElements.length-1].getMethodName();

            }
//            //System.out.println(traceElements.length);

            return str;
        }

    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

}
