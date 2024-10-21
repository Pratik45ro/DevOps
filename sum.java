public class sum {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as arguments.");
            return;
        }

        // Parse the command-line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = a + b;

        // Display the result
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
