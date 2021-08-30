package bai19_StringAndRegex.bai_tap.ValidateNameClass;

public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;
    public static final String[] validClassName = new String[]{"C1243H", "A1484K", "P8765I"};
    public static final String[] invalidClassName = new String[]{"C14202G", "8794G", "A1245"};

    public static void main(String args[]) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
}
