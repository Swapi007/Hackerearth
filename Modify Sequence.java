import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]-=arr[i];
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                flag=false;
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
