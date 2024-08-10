public class ReverseNo {
    public static void main(String[] args) {
        int n=10899;
        System.out.println("Number is - " + n);
        int rev=0;
        while(n>0){
             int lastDigit = n % 10;
             rev= rev * 10+ lastDigit;
             //System.out.print(lastDigit);  //print the reverse of the number
             n=n/10;
        }
        System.out.println("Reversed number is - " + rev);
    }
}
