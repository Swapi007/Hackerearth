import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int N=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++){
                if((j+1)%p==0){
                    arr[j]++;
                }
                if((j+1)%q==0){
                    arr[j]++;
                }
                if((j+1)%r==0){
                    arr[j]++;
                }
            }
            int count=0;
            for(int j=0;j<N;j++)
                if(arr[j]==1)
                    count++;
            System.out.println(count);
        }
    }
}
