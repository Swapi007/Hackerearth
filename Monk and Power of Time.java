import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int i=0;
        int count=0;
        while(!q.isEmpty()){
            if(q.peek()==arr[i]){
                q.poll();
                i++;
            }
            else{
                q.add(q.poll());
            }
            count++;
        }
        System.out.println(count);
    }
}
