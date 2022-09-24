import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your Operarion");
        System.out.println("1 for Aaddition");
        System.out.println("2 for Subraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");

        int Choose = scan.nextInt();

        System.out.println("Enter Two NUmber");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (Choose == 1) {
            System.out.println("The answer is: " + add(x, y));
        } else if (Choose == 2) {
            System.out.println("The answer is: " + sub(x, y));
        } else if (Choose == 3) {
            System.out.println("The answer is: " + mul(x, y));
        } else if (Choose == 3) {
            System.out.println("The answer is: " + Division(x, y));
        } else {
            system.out.println("You're out of range");
        }

    }

    public static int add(int x, int y) {
        int n;
        n = x + y;
        return n;
    }

    public static int sub(int x, int y) {
        int n;
        n = x - y;
        return n;
    }

    public static int mul(int x, int y) {
        int n;
        n = x * y;
        return n;
    }

    public static int Division(int x, int y) {
        int n;
        n = x / y;
        return n;
    }
}