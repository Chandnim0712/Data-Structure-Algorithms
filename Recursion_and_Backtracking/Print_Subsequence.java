import java.util.*;
import java.io.*;
public class Print_Subsequence{
    public static void main (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,"");
    }
    public static void printSS(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        printSS(str, ans + ch);
        printSS(str, ans);
    }
}