import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner scan = new Scanner(System.in);

        int userinput = scan.nextInt();
        
        System.out.println("You entered the number " + userinput);
    }
}
