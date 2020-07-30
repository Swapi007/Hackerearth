import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int N=sc.nextInt();
            int k=sc.nextInt();
            int alice[]=new int[N];
            int bob[]=new int[N];
            for(int i=0;i<N;i++)
                alice[i]=sc.nextInt();
            for(int i=0;i<N;i++)
                bob[i]=sc.nextInt();
            int max_bob=bob[0];
            for(int i=0;i<N;i++){
                if(bob[i]>max_bob)
                    max_bob=bob[i];
            }
            long count=0;
            for(int i=0;i<N;i++){
                if(alice[i]<=max_bob){
                    count=count+max_bob-alice[i]+1;
                }
            }
            System.out.println(k*count);
        }
    }
}
