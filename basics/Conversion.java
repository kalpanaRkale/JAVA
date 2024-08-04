// convert binary numbers to decimal and decimal numbers to binary.

public class Conversion {

    // Method to convert binary number to decimal
    public static void bin2dec(int n) {
        int binN = n;
        int pow = 0, decN = 0;

        while (binN > 0) {
            int ld = binN % 10;
            decN = decN + (ld * (int) Math.pow(2, pow));
            pow++;
            binN = binN / 10;
        }
        System.out.println("Decimal of " + n + " is - " + decN);
    }

    // Method to convert decimal number to binary
    public static void dec2bin(int n) {
        int pow = 0;
        int binN = 0;
        int originalN = n;  // Save the original value of n

        while (n > 0) {
            int r = n % 2;
            binN = binN + (r * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + originalN + " is - " + binN);
    }

    public static void main(String[] args) {
        bin2dec(101);
        bin2dec(101010001);
        bin2dec(1010101);

        dec2bin(5);
        dec2bin(85);
        dec2bin(337);
    }
}

//time complexity - O(log n)
//space complexity - O(1)
