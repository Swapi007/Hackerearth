import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            int max=arr[0];
            for(int j=0;j<n;j++){
                if(arr[j]>max)
                    max=arr[j];
            }
            sum-=max;
            if(max<sum)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}
