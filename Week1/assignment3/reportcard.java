import java.util.Scanner;
public class reportcard {
    private static float percentage;

    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int english,chemistry,computer,physics,maths;
        int i = 0;
        float total;
        percentage = i;
        System.out.println("Enter 5 subject marks ");
        english=sc.nextInt();
        chemistry=sc.nextInt();
        computer=sc.nextInt();
        physics=sc.nextInt();
        maths=sc.nextInt();
        total=english+chemistry+computer+physics+maths;
        percentage=(total/500)*100;
        System.out.println("total marks is:"+ total);
    }
    System.out.println("total percentage is:"+ percentage);
    if(percentage>=90){
        System.out.println("grade is A+");
    }
    else if (percentage>=80){
        System.out.println("grade is A");
    }
    else if (percentage>=70){
        System.out.println("grade is B");
    }
    else if (percentage>=60){
        System.out.println("grdae id C");
    }
    else if(percentage>=50){
        System.out.println("grage is D");
    }
    else if(percentage>=33 && percentage<=49){
        System.out.println("Grade is E");
    }
    else{
        System.out.println("fail");
    }
}   
}


