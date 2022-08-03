public class Main {
    public static void main(String[] args) {
//Задание 1
 byte catAge = 7;
 short dogAge = 10;
 int mouseAge = 20;
 long horseAge = -100;
 float apple = 1.15f;
 double sugar = 3.5678;
 boolean dogIsAdult = dogAge>2;
 char bar = 36;
  System.out.println(horseAge);

        //Задание 2
        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float jointWeight = weight1 + weight2;
        float weightDifference = weight2 - weight1;
        System.out.println("Общий вес боксеров " + jointWeight +"кг");
        System.out.println(" Разница в весе " + weightDifference +"кг");

        //Задание 3
        int egg = 4;
        int banana = 5;
        int milk = 210;
        int icecream = 2;
        int jointWeight2 = (egg* 70 + banana* 80 + milk + icecream* 100);
        System.out.println("Общий вес завтрака в граммах " + jointWeight2 + "гр");
        float weightkg = jointWeight2/1000f;
        System.out.println("Общий вес завтрака в килограммах " + weightkg + "кг");

        //Задание 4
         int weightDown1 = 250;
         int weightDown2 = 500;
         int weightLost = 7;
         int weightLost2 = weightLost*1000;
         int timeNeed1 = weightLost2/weightDown1;
         int timeNeed2 = weightLost2/weightDown2;
         int timeAverage = (timeNeed1+timeNeed2)/2;
         System.out.println ("Потребуется " + timeNeed1 + " дней");
         System.out.println ("Потребуется " + timeNeed2 + " дней");
         System.out.println ("Потребуется в среднем " + timeAverage + " день");

         //Задание 5
int Masha = 67_760;
int Denis = 83_690;
int Cristina = 76_230;
float salaryUpMasha = (float)Masha/100*10f;
float salaryUpDenis = (float)Denis/100*10f;
float salaryUpCristina = (float)Cristina/100*10f;
int newMasha = Masha + (int)salaryUpMasha;
int newDenis = Denis + (int)salaryUpDenis;
int newCristina = Cristina +(int)salaryUpCristina;
        System.out.println ("Маша получит " + newMasha + " рублей");
        System.out.println ("Денис получит " + newDenis + " рублей");
        System.out.println ("Кристина получит " + newCristina + " рублей");
 int yearMasha1 =   Masha * 12;
 int yearMasha2 = newMasha *12;
 int differenceMasha = yearMasha2 - yearMasha1;
 int yearDenis1 =   Denis * 12;
 int yearDenis2 = newDenis * 12;
 int differenceDenis = yearDenis2 - yearDenis1;
 int yearCristina1 =   Cristina * 12;
 int yearCristina2 = newCristina *12;
 int differenceCristina = yearCristina2 - yearCristina1;
        System.out.println("Разница в годовом доходе составит " + differenceMasha);
        System.out.println("Разница в годовом доходе составит "+ differenceDenis);
        System.out.println("Разница в годовом доходе составит "+ differenceCristina);

    }
}