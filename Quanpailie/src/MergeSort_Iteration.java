import java.util.Arrays;

/**
 * @author 17910
 */
public class MergeSort_Iteration {
    public static void mergeSort(int[] a, int n){
        int []b=new int[n];
        int s=1;
        while (s<n){
            mergePass(a,b,s,n);
            s+=s;
            mergePass(b,a,s,n);
            s+=s;
        }
    }

    public static void mergePass(int[] x,int[] y,int s,int n){
        int i=0;
        int o=2;
        while(i<=n-s*o){
            merge(x,y,i,i+s-1,i+2*s-1);
            i=i+2*s;
        }
        if (i+s<n){
            merge(x,y,i,i+s-1,n-1);
        }else {
            for(int j=i;j<=n-1;j++){
                y[j]=x[j];
            }
        }
    }
       public static void merge(int []a,int[]b,int l,int m,int r){
            int i,j,k=l;
            i=l;
            j=m+1;
            while(i<=m&&j<=r){
                if(a[i]<a[j]){
                    b[k++]=a[i++];
                }else {
                    b[k++]=a[j++];
                }
            }
            while (i<=m){
                b[k++]=a[i++];
            }
            while (j<=r){
                b[k++]=a[j++];
            }

        }
        public static void main(String[] args){
            int []a={2,3,5,1,4,8};
            mergeSort(a,6);
            System.out.println(Arrays.toString(a));
        }
    }
