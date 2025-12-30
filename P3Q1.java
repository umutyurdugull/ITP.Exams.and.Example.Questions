public class P3Q1 {
    public static void main(String[] args) {
        
        int i = 200;
        while(i >= 0)
        {

            if(i % 5 == 0 && i % 7 == 0)
            {
                System.out.println(i);
            }

            i = i -1;
        }

    }
}
