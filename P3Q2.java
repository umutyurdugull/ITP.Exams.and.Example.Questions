
public class P3Q2 {
    public static void main(String[] args) {
        

        int[] numbers = new int[100];
        for(int i = 0;i<numbers.length;i++)
        {
            numbers[i] = (int)(Math.random() * 10);
        }
        int count = 0;

        for(int i = 0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers.length -2;i++)
        {
            if(numbers[i] == 5 && numbers[i+1] == 3 && numbers[i+2] == 8)

                {
                    count++;
                }
        }
        System.out.println("Count is : "+count);
    }
}
