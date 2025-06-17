import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.next();
         char m[]=n.toCharArray();
        int c=0;
        char cs='\0';
  
        
        for(int i=0;i<m.length-1;i++){
          boolean b=true;
            for(int j=0;j<m.length;j++){
                if(i!=j&&m[i]==m[j]){
                  b=false;
                    break;
                }
              
            }
            if(b){
            cs=m[i];
            c=1;
                break;
            }
           
        }
        if(c==1)
             System.out.println(cs);
        else
        System.out.println("All the characters are repetitive");
        
           
       
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}