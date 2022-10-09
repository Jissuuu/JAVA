import java.util.Scanner;
//Merge Sorted Array
class MergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<(m+n);i++){
            nums1[i]=nums2[j];
            j++;
        }
        int t;
        for(int i=0;i<(m+n-1);i++){
            for(int j=i+1;j<(m+n);j++){
                if(nums1[j]<nums1[j-1]){
                    t=nums1[j];
                    nums1[j]=nums1[i];
                    nums1[i]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums1 = {1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
        for(int i=0;i<(m+n);i++){
            System.out.printf("%d  ",nums1[i]);
        }
    }
}