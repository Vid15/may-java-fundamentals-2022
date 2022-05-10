import java.util.Scanner;
public class day {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            int hour;
            System.out.println("Enter hours");
            hour=scanner.nextInt();
            if(hour>=1&&hour<=12){
                System.out.println("Good morning");
            }
            else if(hour>=12&&hour<=16){
                System.out.println("Good afternoon");
            }
            else if(hour>=16&&hour<=20){
                System.out.println("Good evening");
            }
            else if(hour>=20&&hour<=24){
                System.out.println("Good night");
            }
            
        }
    }
}

