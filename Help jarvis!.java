import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String n=sc.next();
            int len=n.length();
            int arr[]=new int[len];
            for(int j=0;j<len;j++){
                arr[j]=Character.getNumericValue(n.charAt(j));
            }
            Arrays.sort(arr);
            int temp=0;
            for(int j=1;j<len;j++){
                if(arr[j]-arr[j-1]!=1)
                    temp++;
            }
            if(temp==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
