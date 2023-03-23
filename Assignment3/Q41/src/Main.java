import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter the Three sides of triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        double [] sides = {s1, s2, s3} ;

         Triangle T = new Triangle ("Blue" , true , sides);
            double p = sides [1] + sides [2] + sides [3] ;
            double H = p/2;
            double A= Math.sqrt(H*(H-sides[1])*(H-sides[2])*(H-sides[3]));
        }
        System.out.println (T);
        System.out.println ("Area= " + A);
        System.out.println ("Perimeter ="+ p);
    }
}