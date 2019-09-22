
import java.util.Arrays;
/**
 * @author 17910
 */
public class MergeSort {
    public static void mergeSort(int []a,int left,int right){
        int mid;
        int []b=new int[right-left+1];
        if(left<right){
            mid=(left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            Merge(a,b,left,mid,right);
        }
    }
    public static void Merge(int []a,int[]b,int left,int mid,int right){
        int i,j,k=0;
        i=left;
        j=mid+1;
        while(i<=mid&&j<=right){
            if(a[i]<=a[j]){
                b[k++]=a[i++];
            }else {
                b[k++]=a[j++];
            }
        }
        while (i<=mid){
            b[k++]=a[i++];
        }
        while (j<=right){
            b[k++]=a[j++];
        }
        for (int k2 = 0; k2 < b.length; k2++) {
            a[k2 + left] =b[k2];
        }

    }

    public static void main(String[] args){
        int []a={2,3,5,1,4,8};
        MergeSort.mergeSort(a,0,5);
        System.out.println(Arrays.toString(a));

    }
}

//
//public class MergeSort {
//    public static  Comparable[] mergeSort(Comparable a[],int left,int right){
//        int mid;
//        Comparable[] b= new Comparable[right-left+1];
//        if(left<right){
//            mid=(left+right)/2;
//            mergeSort(a,left,mid);
//            mergeSort(a,mid+1,right);
//            Merge(a,b,left,mid,right);
//        }
//        return a;
//    }
//    public static void Merge(Comparable[]a,Comparable[]b,int left,int mid,int right){
//        int i,j,k=0;
//        i=left;
//        j=mid+1;
//        while(i<=mid&&j<=right){
//            if(a[i].compareTo(a[j])<=0){
//                b[k++]=a[i++];
//            }else {
//                b[k++]=a[j++];
//            }
//        }
//        while (i<=mid){
//            b[k++]=a[i++];
//        }
//        while (j<=right){
//            b[k++]=a[j++];
//        }
//        for (int k2 = 0; k2 < b.length; k2++) {
//            a[k2 + left] =b[k2];
//        }
//
//    }
//
//    public static void main(String[] args){
//        Comparable []a={2,3,5,1,4,8};
//        MergeSort.mergeSort(a,0,5);
//        System.out.println(Arrays.toString(a));
//
//    }
//}
