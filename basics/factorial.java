import java.util.Scanner;

public class factorial {

    public static int fact(int x){
        int f=1;
        for (int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n=sc.nextInt();
        System.out.println("Factorial is - " + fact(n));
    }
}

//Time complexity - O(n)
//Space complexity - O(1)
