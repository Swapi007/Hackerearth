import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int groups=1;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                groups++;
        }
        System.out.println(groups);
    }
}
