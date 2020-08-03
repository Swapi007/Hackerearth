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
        Arrays.sort(arr);
        int maxfreq=1;
        int freq=1;
        int element=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
                freq++;
            else
                freq=1;
            if(freq>maxfreq){
                maxfreq=freq;
                element=arr[i];
            }
        }
        System.out.println(element);

    }
}
