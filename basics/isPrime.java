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

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrime(17));
        System.out.println(isPrime(2));
    }
}

//Time Complexity - O(sqrt n)
//Space Complexity - O(1)
