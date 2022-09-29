import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         //Целые типы
        byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 2000000000l;


        //Вещественные типы
        double aDouble = 8.123456789;
        float aFloat = 8.23453f;


        //Логический тип
        boolean aBoolen = false;
        boolean bBolen = 2 > 3;



        //Символьный тип
        char aChar = 97; //ищет в таблице 'a'


        //Действия с числами
        int a = 10, b = 5;
        double res;

        res = a + b;
        System.out.println(res);

         res = a - b;
        System.out.println(res);

        res = a * b;
        System.out.println(res);

        res = a / b;
        System.out.println(res);



        //
        int i = 0;
        System.out.println( i++ );
        System.out.println( i );



    }

}