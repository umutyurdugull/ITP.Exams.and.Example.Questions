import java.util.Scanner;

public class P3Q3 {



    public static boolean  isPrime(int n)
    {
        for(int i = 2;i<n;i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int count, sum;
        count = 0;
        sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if(n < 0){
                break;
            }
            boolean prime = isPrime(n);
            if(prime == true)
            {
                count++;
                sum = sum + n;
            }
        }
        double avg = (double)(sum / count);
        System.out.println(avg);
    }   
}