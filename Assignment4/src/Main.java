import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int i;

    public static void main(String[] args) {
        ArrayList <Integer> Numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int Num1 = scan.nextInt();
        int Num2 = scan.nextInt();
        int Num3 = scan.nextInt();
        int Num4 = scan.nextInt();
        int Num5 = scan.nextInt();
        Numbers.add(Num1);
        Numbers.add(Num2);
        Numbers.add(Num3);
        Numbers.add(Num4);
        Numbers.add(Num5);
        System.out.println("list without arranging " + Numbers);

        int min =Numbers.get(0);
        for (i =1; i<Numbers.size(); i++)
            if (Numbers.get(i)<=min)
                min=Numbers.get(i);


        System.out.println("Minimum number" + min);
    }
}