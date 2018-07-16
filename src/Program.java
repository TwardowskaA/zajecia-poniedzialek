import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        double[] numbers =  new double[3];

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        numbers[0] = input.nextDouble();
        System.out.println("Podaj druga liczbę");
        numbers[1] = input.nextDouble();
        System.out.println("Podaj trzecia liczbę");
        numbers[2] = input.nextDouble();

        
        double suma = numbers[0] + numbers[1] + numbers[2];

        System.out.print(numbers[0] + "+" + numbers[1] + "+" + numbers[2] + "=" + suma);

    }
}
