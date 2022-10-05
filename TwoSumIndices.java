import java.util.*;
//LeetCode TwoSum
class TwoSumIndices{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10000];
        System.out.println("Enter the length of the array : ");
        int l = in.nextInt();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<l;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter target element : ");
        int t = in.nextInt();
        int[] b = twoSum(a, t);
        System.out.printf("[%d, %d]",b[0],b[1]);
        in.close();
    }
}