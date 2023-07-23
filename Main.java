import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int y1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int y2 = sc.nextInt();
        System.out.print("Please enter the third number: ");
        int y3 = sc.nextInt();


        int max = Math.max(y1,y2);
        int maxNew = Math.max(max,y3);
        System.out.println("The biggest number is: "+maxNew);


        //______________________________________________________


        Scanner one = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0)|| year%400==0) System.out.println("It's a leap year");
        else System.out.println("It's not a leap year");
    }
}


