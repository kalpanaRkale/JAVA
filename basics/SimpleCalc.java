import java.util.Scanner;

public class SimpleCalc{
    public static void main(String[] args) {
        int a=10, b=5;
        int sum=a+b;
        System.out.println("\nNumbers are - "+a+" and "+b);
        System.out.println("Sum = "+sum);

        int x,y,add,sub,prodt,quot,modulo;
        Scanner s= new Scanner(System.in);
        System.out.println("\nEnter number 1 = ");
        x=s.nextInt();
        System.out.println("\nEnter number 2 = ");
        y=s.nextInt();
        add=x+y;
        sub=x-y;
        prodt=x*y;
        quot=x/y;
        modulo=x%y;
        System.out.println("\nAddition = "+add+"\nSubtraction = "+sub+"\nMultiplication = "+prodt+"\nDivision = "+quot+"\nRemainder = "+modulo);
    }
}
//Time complexity - O(1)
//Space complexity - O(1)
