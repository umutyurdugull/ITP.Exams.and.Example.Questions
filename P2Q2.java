public class P2Q2 {
    

    public static void main(String[] args) {
        

        //En cok tekrar eden karakteri bulmamız istenmiş.
        //Lorem ipsum metnin'den 200 karakterlik bir metin alalım.
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut al";
        /*
        Karakter sayısını test etmek için
        int x = text.length();
        System.out.println(x);
        */
        //// Standart ASCII 128, genişletilmiş ASCII 256 karakterdir. 256 güvenli bir seçimdir.
        int[] freq = new int[256];
        for(int i = 0;i< text.length();i++)
        {
            char c = text.charAt(i);
            freq[c]++;
            //örnek --> 'a' harfi geldiginde bunun ascii kodu olan 97. elemana gider. freq[97]'deki sayı +1 artar.
            //Bunu yaptıktan sonra da bu indexlerdeki sayılardan en büyüğünü bulmamız gerekiyor
        }
        char mostFreq = ' ';

        int maxCount = -1;
        //defensive programming, text dedigimiz string boş olabilirdi. Ya da yazdığımız kod hatalı olup string'i okuyamayabilirdi. Bu tarz ekrana count bastırılacağı durumlarda count değişkenlerinin -1'den başlatılması daha mantıklı ve hataları görmemize yardımcı olacaktır.
        for(int i = 0;i<text.length();i++)
        {
            char c = text.charAt(i);
            //En çok tekrar eden karakter boşluk olabilir.
            if (c == ' ') {
                continue; 
            }
            if(freq[c] > maxCount)
            {
                maxCount = freq[c];
                mostFreq = c;
            }
        }

        System.out.println("The char is : " + mostFreq);
        System.out.println("The count of that char is : " + maxCount);
    }

}
