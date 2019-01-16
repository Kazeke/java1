package lesson1;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        byte b1 = 10;     // -128 +127
//        short s1 = 110;    // -32000 +32000
//        int i1 = 1234567; // -2000000000 +200000000
//        long l1 = 10;      // - + 1224345646464L
//
//        float f1 = 102.1f;
//        double d1 = 12.23445;
//
//        char c1 = 'c';
//        boolean b2 = true;
//
//        String str1 = "Hello World";

//        int a = 5;
//
//        if (a ==5) {
//            System.out.println(" a = 5");
//        } else if (a == 10) {
//            System.out.println(" а равно 10");
//        } else {
//            System.out.println("а это не известное число");
//
//        }
//
//
        PrintMessage();
        String str2 = PrintMessageHello("Vaska");
        System.out.println(str2);
    }

    static void PrintMessage() {
        System.out.println("Hello");
    }

    static String PrintMessageHello(String str) {
        return "Hello " + str;
    }

}
