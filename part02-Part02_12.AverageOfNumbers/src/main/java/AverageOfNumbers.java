
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
            numberOfNumbers += 1;
        }

        float averageOfNumbers = (float) sum/numberOfNumbers;
        System.out.println("Average of the numbers: "+averageOfNumbers);

    }
}
