package Practice.ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class All_positive_integer {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("array input: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                list.add(arr[i]);
            }
        }
        if (list.size()==0){
            System.out.print("NA");
            return;
        }

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
