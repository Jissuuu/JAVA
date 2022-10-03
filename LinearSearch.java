import java.util.Scanner;

class LinearSearch{
    static void LinearSrch(int[] a, int t){
        int n = a.length;
        int f=0;
        if(n==0){
            System.out.println("Length of array is zero");
        }
        else{
            for(int i=0;i<n;i++){
                if(t==a[i]){
                    System.out.printf("Element is present at %d position in given array",(i+1));
                    break;
                }
                else{
                    f++;
                }
            }
        }
        if(f==n){
            System.out.println("Element is not present");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l;
        System.out.println("Enter number of elements in array : ");
        l = in.nextInt();
        int[] n = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0;i<l;i++){
            n[i] = in.nextInt();
        }
        System.out.println("Enter element to be searched : ");
        int a = in.nextInt();
        in.close();
        LinearSrch(n, a);
    }
}