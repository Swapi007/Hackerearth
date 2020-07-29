import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int N=sc.nextInt();
            int R=sc.nextInt();
            long height[]=new long[N];
            for(int j=0;j<N;j++){
                height[j]=sc.nextInt();
            }
            long max=height[0];
            int count=1;
            for(int j=1;j<N;j++){
                if(height[j]>max){
                    count++;
                    max=height[j];
                }
                    
            }
            System.out.println(R*count);
        }
    }
}
