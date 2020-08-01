import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int count=0,skip=0;
        for(int i=0;i<n;i++){
            if((arr[i] > x) && (skip == 0)) {

                skip = 1;

            } 
            else if((arr[i] <= x)){

                count++;

            } 
            else {

                break;
            }
        }
        System.out.println(count);
    }
}
