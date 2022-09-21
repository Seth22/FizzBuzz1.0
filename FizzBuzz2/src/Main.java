import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the number of integers to Fizz Buzz!");
        Scanner input = new Scanner(System.in);
        int y = Math.abs(input.nextInt());
        int x = 1;
        while(x<=y) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Fizz Buzz");
                ++x;
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
                ++x;
            } else if (x % 5 == 0) {
                System.out.println("buzz");
                ++x;
            } else {
                System.out.println(x);
                ++x;
            }
        }
    }
}

//created by Seth!
