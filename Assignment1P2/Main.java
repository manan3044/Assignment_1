package Assignment1P2;

public class Main
{
    public static void main(String[] args) {
        input inp = new input();
        calculator calc = new calculator();

        double[] nos = new double[2];
        int choice;
        boolean run = true;

        do{
            System.out.print("\n\nWhich operation do you want to perform: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Power\n6.Square\n7.Mean\n8.Variance\n9.Exit\n=");
            choice = inp.inputChoice();

            switch (choice)
            {
                case 1:
                    nos = inp.inputNumbers();
                    double sum = calc.add(nos[0], nos[1]);
                    System.out.println("Sum of " + nos[0] + " and " + nos[1] + " = " + sum);
                    break;

                case 2:
                    nos = inp.inputNumbers();
                    double sub = calc.subtract(nos[0], nos[1]);
                    System.out.println("Difference of " + nos[0] + " and " + nos[1] + " = " + sub);
                    break;

                case 3:
                    nos = inp.inputNumbers();
                    double multiply = calc.multiply(nos[0], nos[1]);
                    System.out.println("Multiplication of " + nos[0] + " and " + nos[1] + " = " + multiply);
                    break;

                case 4:
                    nos = inp.inputNumbers();
                    double div = calc.divide(nos[0], nos[1]);
                    System.out.println("Division of " + nos[0] + " and " + nos[1] + " = " + div);
                    break;

                case 5:
                    double no = inp.inputNumber();
                    double srt = calc.srt(no);
                    System.out.println("Square Root of " + no + " = " + srt);
                    break;

                case 6:
                    nos = inp.inputNumbers();
                    double power = calc.power(nos[0], nos[1]);
                    System.out.println(nos[0] + " power " + nos[1] + " = " + power);
                    break;

                case 7:
                    nos = inp.inputString();
                    double mean = calc.mean(nos);
                    System.out.println("Mean of numbers = " + mean);
                    break;

                case 8:
                    nos = inp.inputString();
                    double var = calc.variance(nos);
                    System.out.println("Variance of numbers = " + var);
                    break;

                case 9:
                    System.out.println("\nTHANK YOU FOR USING");
                    run = false;
                    break;

                default:
                    System.out.println("\nInvalid Operation");
            }
        }while(run);
    }
}