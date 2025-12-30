public class Q2{
    
    

    //makine no üretim hata 
    // oran = hata / ü-retim * 100 


    public static double[] errorRate(int[][] list)
    {
        double[] rate = new double[list.length];
        for(int i = 0;i<list.length;i++)
        {
            //hata / üretim * 100

            rate[i] = ((double) list[i][2] / list[i][1]) * 100;
        }
        return rate;
    }


    public static void auditMachines(double rates[],int[][] list)
    {
        for(int i = 0;i<rates.length;i++)
        {
            if(rates[i]> 10.0)
            {
                System.out.println("Makine : "+list[i][0] + "Hata payı : " + rates[i] );
            }
        }
    }

    public static void updateTargets(int[][] list)
    {
        //Hata sayısı 20'den az olan makinelerin üretim hedefini %20 arttır
        // üretim = üretim*(120/100)
        //üretim = list[i][1]

        for(int i = 0;i<list.length;i++)
        {
            if(list[i][2] < 20)
            {
                list[i][1] = (int) (list[i][1] * (1.2)); 
            }
        }

    }

    public static void main(String[] args) {
        
        int[][] production = {
            {1, 1000, 50},
            {2, 1200, 120},
            {3, 900, 10},
            {4, 1500, 300},
            {5, 1100, 55}
        };

        double[] errorRates = errorRate(production);
        auditMachines(errorRates, production);
        updateTargets(production);
        for(int[] makine : production)
        {
            System.out.println(makine[0] + "Yeni hedef : " + makine[1]);
        }

    }
}