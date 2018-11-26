import java.util.Scanner;

import java.lang.Object;
import java.util.*;
public class MyClass {
    static List<String> result = new ArrayList<String>();
    static String message;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        String[] parts = inp.split(" ");

        MyClass.repeatTest(parts);

    }
    public static void repeatTest(String[] parts){
        for (String item : parts){
            item = item.toString();
           if(Arrays.asList(result).contains(item)){
               message = "no";
               break;
           }
           else{ 
               result.add(item);
               message="yes";
           }
        
        }
     System.out.println(message);
    }
}
