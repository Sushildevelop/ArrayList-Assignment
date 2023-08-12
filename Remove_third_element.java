package Practice.ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_third_element {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("length of arraylist: ");
        int n=sc.nextInt();
        System.out.println("Takes the input array: ");
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.remove(2);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
