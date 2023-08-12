package Practice.ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_integer {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("length of the Arraylist: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("takes the input for arraylist");
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
