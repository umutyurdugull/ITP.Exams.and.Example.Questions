import java.util.Scanner;

public class P2Q1 {
    public static void main(String[] args) {
       
        int min, hour;
        double hourHandAngle, minuteHandAngle,angle;
        // hourhand = akrep
        // minuteHand = yelkovan
        // Daha hassas olması için float yerine double kullanıcaz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour : ");
        hour = sc.nextInt();
        System.out.println("Enter min : 0-59");
        min = sc.nextInt();
        /*
        Açıların hesaplanması
        Akrep her saatte 30 derece hareket eder, dakikalar da akrebi etkiler. Her dakikada 0.5 derece akrep oynar. Bunu hesaba katmamız lazım
        */
       hourHandAngle = (hour % 12) *30 + (min * 0.5);
       minuteHandAngle = min * 6;
       angle = Math.abs(hourHandAngle - minuteHandAngle);
       if(angle > 180)
       {
        angle = 360 - angle;
       }
       System.out.println("Angle is : " + angle);
    }
}
