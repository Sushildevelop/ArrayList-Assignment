package Practice.ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swap_two_elements {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("length of arraylist: ");
        int n=sc.nextInt();
        System.out.println("Takes the input array: ");
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("enter the indices to swap the elements of: ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int temp=list.get(i);
        Collections.swap(list,i,j);
        for (int k=0;k<n;k++){
            System.out.print(list.get(k)+" ");
        }
    }
}
