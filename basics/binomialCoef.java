public class BinomialCoef {

    // Helper function to calculate factorial
    private static int fact(int x){
        int f = 1;
        for (int i = 1; i <= x; i++){
            f = f * i;
        }
        return f;
    }

    // Function to calculate binomial coefficient
    public static int binCoef(int n, int r){
        int f_n = fact(n);
        int f_r = fact(r);
        int f_nnr = fact(n - r);

        int binCoeff = f_n / (f_r * f_nnr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coefficient of 5C2 - " + binCoef(5, 2));
    }
}

//Time complexity - O(n)
//Space complexity - O(1)
