import java.util.Scanner;
public class Madlib {
    public static void main(String[] args) {
        //creating scanner object to receive user input
        Scanner madScanner = new Scanner(System.in);

        //defining the initial phrases without any user input
        String p1 = "My first date and I met at a ";
        String p2 = " star restaurant. We were having a lot of fun until my date spilled ";
        String p3 = " all over my new T-shirt. I immediately called the waiter to bring us our check and it turned out to be ";
        String p4 = ". It was ";
        String p5 = " that my date offered to pay for my t-shirt and the dinner. But, I was still extremely ";
        String p6 = ", and then I started ";
        String p7 = " the restaurant without saying a word to her.";

        //getting the user input
        System.out.println("Enter a whole number");
        int input1 = madScanner.nextInt();

        System.out.println("Enter a drink");
        String input2 = madScanner.next();

        System.out.println("Enter a decimal number");
        double input3 = madScanner.nextDouble();

        System.out.println("Enter true/false");
        boolean input4 = madScanner.nextBoolean();

        System.out.println("Enter a adjective");
        String input5 = madScanner.next();

        System.out.println("Enter a verb");
        String input6 = madScanner.next();
        
        
        
        // output and scanner close
        System.out.println(p1 + input1 + p2 + input2 + p3 + input3 + p4 + input4 + p5 + input5 + p6 + input6 + p7);
        madScanner.close(); 

    }
}
