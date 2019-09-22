import java.util.Scanner;

/**
 * @author 17910
 */
//class Number{
//    int[] arr={1,2,3};
//}
//class Perm1{
//    static void swap(Number number,int start,int end) {
//        int temp;
//        temp=number.arr[start];
//        number.arr[start]=number.arr[end];
//        number.arr[end]=temp;
//    }
//    static void perm0(Number n, int k, int m)
//    {
//
//        if(k==m){
//            for(int i=0; i<=m; i++) {System.out.print(n.arr[i]);
//
//        }
//            System.out.print("\n");
//        }
//        else{
//            for(int i=k; i<=m; i++){
//                swap(n,k,i);
//                perm0(n,k+1,m);
//                swap(n,k,i);
//            }
//        }
//    }
//    public static void main(String[] args){
//        Number n= new Number();
//        perm0(n, 0, 2);
//    }
//}
//





class Perm1 {
    private static int k = 0;

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        perm(a, 0, 2);
    }

    public static void perm(int[] a, int m, int n) {
        if (m == n) {
            k++;
            System.out.print(k + "个:");
            for (int i = 0; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        } else {
            for (int i = m; i <= n; i++) {
                int temp = a[m];
                a[m] = a[i];
                a[i] = temp;
                perm(a, m + 1, n);
                temp = a[m];
                a[m] = a[i];
                a[i] = temp;
            }
        }
    }
}