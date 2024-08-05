public class MaxOf3Nums {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;;
        System.out.println("\nEnter 3 numbers - ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("Maximum of the numbers is - "+a);
            }
            else{
                System.out.println("Maximum of the numbers is - "+c);
            }
        }
        else{
            if (b>c){
                System.out.println("Maximum of the numbers is - "+b);
            }
            else{
                System.out.println("Maximum of the numbers is - "+c);
            }
        }
    }
}
//Time Complexity - O(1)
//Space Complexity - O(1)
