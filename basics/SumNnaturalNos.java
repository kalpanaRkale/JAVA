public class SumNnaturalNos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int n = s.nextInt();
        int sum=0,i=1;
        while(i<=n){
            System.out.print( i + " ");
            sum=sum+i;
            i=i+1;
        }
        System.out.println("\nThe sum of numbers upto "+n+" is "+sum);
    }
}
