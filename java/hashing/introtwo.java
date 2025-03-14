import java.util.*;
public class introtwo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        int[] hash = new int[26];
        for(int i =0;i<str.length();i++){
            hash[str.charAt(i)-'a'] +=1;
        }
        int querry = scr.nextInt();
        for(int i =0;i<querry;i++){
            String a = scr.next();
            System.out.println("The charater "+a+" is " +hash[a.charAt(0)-'a']+ " times");
        }
    }
}
