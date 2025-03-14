import java.util.*;
public class intro {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int[] arr = new int[num];
        for(int i =0;i<num;i++){
            arr[i] = scr.nextInt();
        }
        int[] hash= new int[13];

        for(int i =0;i<num;i++){
            hash[arr[i]] +=1;
        }
        System.out.println("Write your querry");
        int querry = scr.nextInt();
        for(int i=0;i<querry;i++)
        {
            int q = scr.nextInt();
            System.out.println("This appears " + hash[q] +" times");            
        }

    }
}
