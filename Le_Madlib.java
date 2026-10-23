import java.util.Scanner;
public class Le_Madlib {
    public static void main(String[] args) {
        // Intializes the scanner object
        Scanner madScanner = new Scanner(System.in);
        // Initializes original story, prints it out, and documents all indexes for phrases
        String original = "My first date and I met at a _n star restaurant. We were having a lot of fun until my date spilled _dr all over my new T-shirt. I immediately called the waiter to bring us our check and it turned out to be $_de. It was _b that my date offered to pay for my t-shirt and the dinner. But, I was still extremely _a, and then I started _v the restaurant without saying a word to her.";
        System.out.println(original);
        int i1 = original.indexOf("_n");
        int i2 = original.indexOf("_dr");
        int i3 = original.indexOf("_de");
        int i4 = original.indexOf("_b");
        int i5 = original.indexOf("_a");
        int i6 = original.indexOf("_v");
        // Parses the original story for each phrase
        String p1 = original.substring(0, i1);
        String p2 = original.substring(i1 + 2, i2);
        String p3 = original.substring(i2 + 3, i3);
        String p4 = original.substring(i3 + 3, i4);
        String p5 = original.substring(i4 + 2, i5);
        String p6 = original.substring(i5 + 2, i6);
        String p7 = original.substring(i6 + 2);
        // This segment asks the user for a variety of input to make the madlib
        System.out.println("Enter a whole number");
        int input1 = madScanner.nextInt();

        System.out.println("Enter a drink");
        String input2 = madScanner.next();

        System.out.println("Enter a decimal number (two decimal places)");
        double input3 = madScanner.nextDouble();

        System.out.println("Enter true/false");
        boolean input4 = madScanner.nextBoolean();

        System.out.println("Enter a adjective");
        String input5 = madScanner.next();

        System.out.println("Enter a verb");
        String input6 = madScanner.next();
        
        
        // output and scanner close
        //Concatentes all of the inputs and strings and prints and final madlib
        System.out.println(p1 + input1 + p2 + input2 + p3 + input3 + p4 + input4 + p5 + input5 + p6 + input6 + p7);
        madScanner.close(); 

    }
}
