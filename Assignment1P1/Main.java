package Assignment1P1;

public class Main {
    public static void main(String[] args) {
        input inp = new input();
        factorial fact = new factorial();

        boolean run = true;
        int choice;
        int number;
        long result;

        do{
            System.out.print("\n\nWhich input method do you want to use: \n1.Scanner\n2.BufferedReader\n3.DataInputStream\n4.Console\n5.Exit\n=");
            choice = inp.inputChoice();

            switch (choice)
            {
                case 1:
                    number = inp.scannerInput();
                    result = fact.calc(number);
                    System.out.print("The Factorial of " + number + "= "+result);
                    break;

                case 2:
                    number = inp.bufferedReaderInput();
                    result = fact.calc(number);
                    System.out.print("The Factorial of " + number + "= "+result);
                    break;

                case 3:
                    number = inp.dataInputStream();
                    result = fact.calc(number);
                    System.out.print("The Factorial of " + number + " = "+result);
                    break;

                case 4:
                    number = inp.consoleInput();
                    result = fact.calc(number);
                    System.out.print("The Factorial of " + number + " = "+result);
                    break;

                case 5:
                    run = false;
                    System.out.println("Thank you for using.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(run);
    }
}
