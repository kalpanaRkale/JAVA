public class KadanesAlgo {

    // Method to find the maximum sum of any subarray using Kadane's Algorithm
    public static void KadanesAlgo(int numbers[]){
        //Time complexity - O(n)

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<numbers.length;i++){
            currSum += numbers[i];

            if (currSum<0){
                currSum=0;
            }
             maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("Maximum Sum of Subarray is - "+ maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {4,-2,-7,8,10,1,-4};
        KadanesAlgo(arr);
    }
}
//Time Complexity - O(n) 
//Space Complexity - O(1) 
