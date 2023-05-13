public class que3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No number provided as command line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        System.out.println("Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
