import java.util.Scanner;

public class area{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the length");
            double length=scanner.nextDouble();
            System.out.println("enter the width");
            double width=scanner.nextDouble();
            double area=length*width;
            System.out.println("the area of rectangle is"+area);
        }


    }
}
