package Practice.ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert_element {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("length of Arraylist");
        int n=sc.nextInt();
        System.out.println("take input of arraylist: ");
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("enter the element to be inserted: ");
        int x=sc.nextInt();
        list.add(0,x);
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
