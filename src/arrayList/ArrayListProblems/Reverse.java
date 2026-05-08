package arrayList.ArrayListProblems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println("Before : "+ al);
        int i=0;
        int j=al.size()-1;
        while(i<j){
           int temp=al.get(i);
           al.set(i,al.get(j));
           al.set(j,temp);
           i++;
           j--;
        }
        System.out.println("After : "+ al);
        sc.close();
    }
    
}
