package Task1;

public class Task1Class {

    public static void main(String[] args){
        byte a = 15;
        short b = 100;
        int c = 1000000;
        long d = 100000000;
        char letter = 'M';
        double e = 2525.25;
        float pi = 3.14f;
        boolean result = true;
        String title = "Java";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println (title);
        System.out.println (letter);
        System.out.println (e);
        System.out.println (pi);
        System.out.println (result+ "\n");

        byte a1 = (byte) (a + 5);
        System.out.println(a1);
        byte a2 = (byte) (a - 5);
        System.out.println(a2);
        byte a3 = (byte) (a * 5);
        System.out.println(a3);
        byte a4 = (byte) (a / 5);
        System.out.println(a4);
        byte a5 = (byte) (a % 5);
        System.out.println(a5);
        byte a7 = ++a;
        System.out.println(a7);
        byte a8 = --a5;
        System.out.println(a8 + "\n");



        double e1 = e +1.5;
        System.out.println(e1);
        double e2 = e - 1.5;
        System.out.println(e2);
        double e3 = e * 2;
        System.out.println(e3);
        double e4 = e / 2.5;
        System.out.println(e4);
        double e5 = e % 5;
        System.out.println(e5);
        double e6 = ++e;
        System.out.println(e6);
        double e7 = --e;/*Тут у меня вопрос почему оно сначала выполняет ++е , а потом
          --е и остаётся на месте типо, а не берет просто «е» и отнимает от него типа тут
          должно же быть 2524.25, в первом я проверил когда написал --а5 оно отрабатывает нормально когда
           нету действия ++ или -- над переменной */
        System.out.println(e7);



    }
}
