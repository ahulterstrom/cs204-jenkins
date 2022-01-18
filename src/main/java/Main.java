import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line=scanner.nextLine();
            String[] inputArray=line.trim().split("\\s+");

            // Check how many arguments were passed in
            if (inputArray.length == 0) {
                System.out.println("Too few arguments");
            }
            String operation=inputArray[0];
            int x=Integer.parseInt(inputArray[1]);
            int y=0;
            if (inputArray.length == 3) {
                y=Integer.parseInt(inputArray[2]);
            }
            String z;

            Calculator calculator=new Calculator();


            switch (operation) {
                case "add":
                    z=Integer.toString(calculator.add(x, y));
                    break;
                case "subtract":
                    z=Integer.toString(calculator.subtract(x, y));
                    break;
                case "multiply":
                    z=Integer.toString(calculator.multiply(x, y));
                    break;
                case "divide":
                    z=Integer.toString(calculator.divide(x, y));
                    break;
                case "fibonacci":
                    z=Integer.toString(calculator.fibonacciNumberFinder(x));
                    break;
                case "binary":
                    z=calculator.intToBinaryNumber(x);
                    break;
                default:
                    throw new Error("Operator not recognized");
            }
            System.out.println(z);
        }
    }

}
