import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        float p,r,t;
        System.out.println("\nPrincipal - ");
        p=s.nextFloat();
        System.out.println("\nRate of Interest - ");
        r=s.nextFloat();
        System.out.println("\nTime period - ");
        t=s.nextFloat();
        float si=p*r*t/100;
        System.out.println("\nSimple Interest - "+si);
    }
}
//Time Complexity - O(1) 
//Space Complexity - O(1)
