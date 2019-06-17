import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args) {

        int num, i, total = 0;

        Scanner keyboard = new Scanner(System.in);



        // Loop should start here
        for ( i=1; i<11; i++) {
            System.out.println("Enter a number");
            num = keyboard.nextInt();
            total += num; //total = total + num
        }

        System.out.println("The total of all 10 numbers is " + total);

    }

}