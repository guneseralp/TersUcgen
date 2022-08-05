import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n= scan.nextInt();

        for (int a=1; a<n; a++){
            for (int b = 1; b<=a; b++){
                System.out.print(" ");
            }
            for (int c=1; c<= (2*n-(2*a+1));c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
