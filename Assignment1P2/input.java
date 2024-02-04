package Assignment1P2;
import java.util.Scanner;

public class input {
    public int inputChoice()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public double inputNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        return sc.nextDouble();
    }

    public double[] inputNumbers() {

        double[] numbers = new double[2];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        numbers[0] = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        numbers[1] = sc.nextDouble();

        return numbers;
    }

    public double[] inputString()
    {
        Scanner s = new Scanner(System.in);
        int count=0;

        double[] d2 = new double[20];

        do {
            System.out.print("Enter your number: ");
            String str = s.next();
            if (str.equals("end")) {
                break;
            } else {

                double num = Double.parseDouble(str);
                d2[count] = num;
                count++;
            }
        }
        while(true);

        return d2;
    }
}