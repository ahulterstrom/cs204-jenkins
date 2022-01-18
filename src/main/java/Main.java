public class Main {

    public static void main(String[] args) {
        // Check how many arguments were passed in
        if(args.length == 0)
        {
            System.out.println("Too few arguments");
            System.exit(0);
        }
        String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = 0;
        if(args.length == 3){
            y = Integer.parseInt(args[2]);
        }
        String z;

        Calculator calculator = new Calculator();


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
