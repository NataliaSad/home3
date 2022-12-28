public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
  int a = 50000;
  System.out.println("значение переменной с типом a равно" + a);
  byte b = 10;
  System.out.println("значение переменной с типом b равно" +b);
  short c = 30000;
  System.out.println("значение с переменной с типом c равно" +c);
  long l  = 2000L;
  System.out.println("значение переменной с типом l равно" + l);
  double d = 65.37;
  System.out.println("значение переменной с типом d равно" +d);
  float f = 35.87f;
  System.out.println("значение переменной с типом f равно" +f);
  System.out.println(" Задача 2");
  double e = 27.12;
  System.out.println(" e равно" + e);
  long k = 987678965549L;
  System.out.println(" k равно" +k);
  float m = 2.786f;
  System.out.println("m равно" + m);
  short n = 569;
  System.out.println("n равно" +n);
  short o =-159;
  System.out.println("o равно" +o);
  short p = 27897;
  System.out.println("p равно" + p);
  byte s = 67;
  System.out.println("s равно" +s);
System.out.println("Задача 3");
short totalSheets = 480;
byte LP = 23;
short AS = 27;
int EA =30;
int toEach = LP + AS + EA;
System.out.println("на каждого ученика расчитано листов бумаги" + totalSheets/toEach);
System.out.println("Задача 4");
byte bootlock = 16;
byte time = 2;
System.out.println(" за 20 минут машина произвела " + bootlock/time * 20 + " штук бутылок ");
System.out.println(" за сутки машина произвела " + bootlock/time * 24 * 60 + " штук бутылок ");
System.out.println("за 3 дня машина произвела " + bootlock/time * 3 * 24 * 60 + " штук бутылок ");
System.out.println( " за 1 месяц машина произвела " + bootlock/time * 30 * 24 * 60 + " штук бутылок" );
System.out.println( "Задача 5");
byte whitePaint = 2;
byte brownPaint = 4;
int totalCansPerClass = whitePaint + brownPaint;
short totalCansPerSchool = 120;
System.out.println( " в школе, где " + totalCansPerSchool/totalCansPerClass + " классов " + "нужно " + whitePaint + " банки белой краски и " + brownPaint + " коричневой");
System.out.println( " Задача 6 ");
 short bananas = 5;
 short weightOfOneBanana = 80;
 int totalBanana = bananas * weightOfOneBanana;
 System.out.println( " общий вес бананов " + totalBanana + " грамм");
 int milk100Ml = 105;
 System.out.println(" в 200 мл молока содержится " + 2 * milk100Ml + " грамм молока " );
 int iceCream = 100;
 System.out.println( "в двух брикетах содержится " + 2 * iceCream + " грамм  мороженого ");
 int egg = 4;
 int weighEgg = 70;
 int allEgg = egg * weighEgg;
 System.out.println(" вес всех яиц " + allEgg + " грамм ");
 int allbreakfast = totalBanana + milk100Ml * 2 + iceCream * 2 +allEgg;
 System.out.println( " вес всего завтрака " + allbreakfast + " грамм ");
 float weighInKg = allbreakfast / 1000f;
 System.out.println( "вес завтрака в килограммах " + weighInKg );
 System.out.println( " Задача 7 ");
 int weigh = 7;
 int weighKg = 7 * 1000;
 System.out.println( " вес в граммах " + weighKg);
 int weigh250 = weighKg/250;
 System.out.println( " колличество  при потере ежедневно 250 грамм " + weigh250 + " дней ");
 int weigh500 = weighKg/500;
 System.out.println( " колличество при потере ежедневно 500 грамм " + weigh500 + " дней ");
 int average = (weigh250 + weigh500) /2;
 System.out.println( " среднее колличество " + average + " день ");
 System.out.println( " Задача 8 ");
 int masha = 67760;
 int procM = masha + (masha * 10 / 100);
 int beforePromotionM = masha *12;
 int afterPromotionM = procM *12;
 int differenceM = afterPromotionM -beforePromotionM;
 System.out.println( " Маша теперь получает "  + procM + " рублей " +  " до повышения годовой доход составил " + beforePromotionM +  " рублей" + " после повышения годовой доход составил " + afterPromotionM + " рублей " + " и вырос за год на " +differenceM + " рублей ");
 int denis = 83690;
 int procD = denis + ( denis *10 /100);
 int beforePromotionD = denis *12;
 int afterPromotionD = procD *12;
 int differenceD = afterPromotionD - beforePromotionD;
 System.out.println( " Денис теперь получает " + procD + " рублей " + " до повышения годовой доход составил " + beforePromotionD + " рублей " + " после повышения годовой доход составил " + afterPromotionD + " рублей " + " и вырос за год  на " + differenceD + " рублей ");
 int kristina = 76230;
 int procK = kristina + (kristina *10/100 );
 int beforePromotionK =kristina *12;
 int afterPromotionK = procK *12;
 int differenceK = afterPromotionK - beforePromotionK;
 System.out.println( " Кристина теперь получает " + procK + " рублей " + " до повышения годовой доход составил " + beforePromotionK + " рублей " + " после повышения годовой доход составил " + afterPromotionK + " рублей " + " и вырос за год на " + differenceK + " рублей ");
































    }
}