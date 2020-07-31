import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[k];
        int op[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            op[i]=arr[i];
            for(int j=0;j<k;j++){
                if(arr[j+i]>op[i])
                    op[i]=arr[j+i];
            }
        System.out.print(op[i]+" ");
        }
    }
}

