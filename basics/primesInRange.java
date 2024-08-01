public class PrimeNumbers {

  public static boolean isPrime(int n){

        if (n==2){
            return false;
        }

        //for (int i=2; i<n; i++){  [non - optimized]
        for (int i=2; i<=Math.sqrt(n); i++){  //optimized
        if (n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange (int a, int b){
        for (int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(10, 45);
    }
}

//Time Complexity - O((b−a+1) 
//Space Complexity - O(1)
