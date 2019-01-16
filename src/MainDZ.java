public class MainDZ {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3, 4));
        System.out.println(checkTwoNumbers(1, 2));
        printIsPositive(-10);
        printWelcome("name");
        System.out.println(isLeapYears(2014));

    }

    public static void testMet1(int a) {
        if (a < 18) {
            return;
        } else if (a < 5) {
            return;
        }
    }


    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));

    }

    public static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    public static void printIsPositive(int var) {
        System.out.println("Your number is  " + ((var >= 0) ? "positive" : "negative") + "!");

    }

    public static boolean isNegative(int var) {
        return (var < 0);
    }

    public static void printWelcome(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isLeapYears(int year) {
        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        byte b = 127;
        short s = 3100;
        int i = 12345;
        long l = 43214L;
        char c = 65;
        float f = 1234.5678f;
        double d = 5678.1234;
        boolean boo = true;
        String str="Fancy String";

    }
}
