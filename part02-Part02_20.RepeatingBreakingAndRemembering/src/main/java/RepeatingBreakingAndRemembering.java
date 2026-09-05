
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        double average;
        int even = 0;
        int odd = 0;
        

        System.out.println("Give numbers:");
        

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                sum += number;
                numberOfNumbers++;
                even++;
            } else {
                sum += number;
                numberOfNumbers++;
                odd++;
            }

        }

        average = (double) sum/numberOfNumbers;

        System.out.print("Sum: "+sum+"\n");
        System.out.print("Numbers: "+numberOfNumbers+"\n");
        System.out.print("Average: "+average+"\n");
        System.out.print("Even: "+even+"\n");
        System.out.print("Odd: "+odd);

    }
}
