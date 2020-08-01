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
        int digits[]=new int[10];
        for(int i=0;i<n;i++){
            digcount(digits,arr[i]);
        }
        int max=digits[0];
        for(int i=0;i<10;i++){
            if(digits[i]>max)
                max=digits[i];
        }
        System.out.println(max);
    }   
    public static void digcount(int[] digits,int x){
        int hm[]=new int[10];
        while(x>0){
            if(hm[x%10]==0)
                digits[x%10]++;
            hm[x%10]=1;
            x/=10;
        }
    } 
}
