
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfPositiveNumber = 0;

        int numberOfNumber = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                numberOfNumber += 1;
                numberOfPositiveNumber += 1;
            }
        }

        if (numberOfNumber == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum/numberOfPositiveNumber;
            System.out.println(average);
        }


    }
}
