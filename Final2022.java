public class Final2022 {
    public static void main(String[] args) {
     
        double[][] student = createArray();
        displayArray(calcSuccessGrade(student));
        unsuccessfulStd(student);
    }

    /*
    
    Neden display kısımlarında i + 1 kullandık ? 
        i kullandığımız zaman student'in indexini yazdıracaktı.
        Gerçek bir uygulama geliştirdiğinizi ve programlama bilmeyen bir kişinin programı kullandığını düşünün.
        0. öğrenci diye bir şey gördüğünde programın hatalı olduğunu düşünebilir
        Kullanıcının daha rahat okuyabilmesi için böyle bir değişikliğe gidilmiştir.
    
    */

    public static void displayArray(double[][] student)
    {
        for(int i = 0;i<student.length;i++)
        {
            System.out.println((i+1) + ".student Midterm : "+ student[i][0] + " Final: " + student[i][1] + "Success : " +  student[i][2]);
            System.out.println();
        }
    }

    public static double[][] calcSuccessGrade(double[][] student)
    {

        // successGrade = Midterm x 0.4 + Final x 0.6 


        for(int i = 0;i<student.length;i++)
        {

            student[i][2] = student[i][0] * 0.4 +  student[i][1] * 0.6;
        }
        return student;
    }
    public static char[] scoreChar(double[][] student){ 
        char[] letterGrade = new char[5]; 
        for(int i = 0; i < student.length; i++){ 
        if(student[i][2] <= 100 && student[i][2] >= 90) 
            letterGrade[i] = 'A'; 
        else if(student[i][2] <= 89 && student[i][2] >= 80) 
            letterGrade[i] = 'B'; 
        else if(student[i][2] <= 79 && student[i][2] >= 70) 
            letterGrade[i] = 'C'; 
        else if(student[i][2] <= 69 && student[i][2] >= 60) 
            letterGrade[i] = 'D'; 
        else 
            letterGrade[i] = 'F'; 
} 
        return letterGrade; 
    } 

    public static void unsuccessfulStd(double[][] student)
    {
        char[] letterGrade = scoreChar(student);
        for(int i = 0;i<letterGrade.length;i++)
        {
            if(letterGrade[i] == 'F')
            {
                System.out.println((i+1) + " " + student[i][2]);
            }
        }
    }

    public static double[][] createArray(){
        double[][] student = {
        {55.0, 83.0, 0}
        ,{84.0, 75.0, 0}, 
        {68.0, 90.0, 0}, 
        {26.0, 45.0, 0}, 
        {87.0, 93.0, 0}}; 


        return student; 
    }
}
