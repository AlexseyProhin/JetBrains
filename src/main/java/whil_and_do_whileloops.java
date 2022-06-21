import java.util.Scanner;

public class whil_and_do_whileloops {
    /*
    A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.

n!, or factorial n, is a product of all natural numbers from 1 to n inclusive: for example, 5! = 1 * 2 * 3 * 4 * 5.

Just in case: wiki on factorials.

For example, the user enters 100. This means m = 100 and n = 5 because 5! = 120 (see the factorial formula) and this is the smallest number that satisfies the condition n! > m.

Pay attention that the user may input a really big number so choose an appropriate data type!

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long fact = 1;
        int count = 1;
        while (fact <= number) {
            count++;
            fact *= count;
        }
        System.out.println(count);
    }
}

