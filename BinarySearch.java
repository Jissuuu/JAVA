import java.util.*;

class BinarySearch{
    static void sort(int[] a){
        int n = a.length;
        int t;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i-1);j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    static int BinarySrch(int[] a, int t){
        int n = a.length;
        int l=0,m,h=(n-1);
        while(l<=h){
            m=(l+h)/2;
            if(t==a[m]){
                return m;
            }
            else if(t<a[m]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements in array : ");
        int l = in.nextInt();
        int[] n = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0;i<l;i++){
            n[i]=in.nextInt();
        }
        System.out.println("Enter element to be searched : ");
        int k = in.nextInt();
        in.close();
        sort(n);
        System.out.print("Sorted Array : ");
        for(int i=0;i<l;i++){
            System.out.printf("%d ",n[i]);
        }
        System.out.println("\n");
        if(BinarySrch(n, k)==-1){
            System.out.println("Element not Present");
        }
        else{
            System.out.printf("Element is present at %d position in the sorted array",(BinarySrch(n, k)+1));
        }
    }
}