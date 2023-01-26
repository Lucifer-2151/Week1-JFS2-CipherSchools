import java.util.Scanner;

public class BikePolice {
    public static void main (String args[]) {
    	try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Speed : ");
            int speed = sc.nextInt();
            
            System.out.println("Today is Your Birthday ?");
            boolean isbirthday = sc.nextBoolean();
            
            if(isbirthday == true) {
            	speed -= 5;
            }
            
            if(speed > 80) {
            System.out.println("High ticket");
            } else if(speed >= 60) {
            System.out.println("Mid ticket");
            } else {
            System.out.println("No ticket");
            }
        }
    }
}