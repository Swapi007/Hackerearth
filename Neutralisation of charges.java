import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Character> st=new Stack<>();
        String s=sc.next();
        
        for(int i=0;i<n;i++){
            if((!st.isEmpty())&&(st.peek()==s.charAt(i)))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        int k=st.size();
        System.out.print(k);
        System.out.println();
        char ch1[]=new char[k];
        
        while(!st.isEmpty()){
            ch1[k-1]=st.pop();
            k--;
        }
        for(int i=0;i<ch1.length;i++)
            System.out.print(ch1[i]);
    }
}
