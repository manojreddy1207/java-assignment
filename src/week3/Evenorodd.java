package week3;
import java.util.Scanner;
public class Evenorodd {

    class main {
        public static void main(String[] args) {
            int number;
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            if(number % 2 == 0) {
                System.out.println("Even Number");
            }
            else {
                System.out.println("odd Number");

            }
            input.close();
        }
    }

}
