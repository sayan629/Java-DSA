package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Stringarray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str=new String[5];
        int i;
        System.out.println("Enter the String");
        for(i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
