
public class Q1 {




    public static void findThichkest(int[][] list)
    {
        int maxId =0;
        int maxPage =0;
        for(int i = 0;i<list.length;i++)
        {
            if(list[i][1] > maxPage )
            {
                maxPage = list[i][1];
                maxId = list[i][0];
            }
        }
        System.out.println("Thickest Book has " +maxPage+"pages. The book ID is : " + maxId  );


    }

    public static double[] calculateReadingTime(int[][] list)
    {
        double[] hours = new double[list.length];
        for(int i = 0;i<hours.length;i++)
        {
            hours[i] = list[i][1] / 40.0;
        }
        return hours;
    }

    public static void displayLibrary(int[][] list)
    {
        System.out.println("ID\tSAYFA\tTÜR");

        for(int i = 0;i<list.length;i++)
        {
            System.out.print(list[i][0] + "\t" + list[i][1]);
            if(list[i][2] == 0) System.out.print("\t Roman");
            else if(list[i][2] == 1) System.out.print("\t Bilim");
            else if(list[i][2] == 2) System.out.print("\t Tarih");
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        
        int[][] books = { 
            {101, 320,0},
            {102,150,1},
            {103,450,2},            
            {104,200,0},
            {105,600,1}
    };
    displayLibrary(books);
    double[] times = calculateReadingTime(books);
    for(int i =0;i<times.length;i++)
    {
    System.out.println("Kitap " + books[i][0] + ": " + times[i] + " saat");    
    }
    findThichkest(books);
    }
}
