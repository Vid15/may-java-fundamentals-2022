import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter first number");
            int input1=scanner.nextInt();
            System.out.println("enter second number");
            int input2=scanner.nextInt();
            int sum=input1+input2;
            System.out.println("the sum is"+sum);
        }


    }
}