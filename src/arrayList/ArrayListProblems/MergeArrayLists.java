package arrayList.ArrayListProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayLists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of first list:");
        for(int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of second list:");
        for(int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> mergedList = new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Merged ArrayList: " + mergedList);

        sc.close();
    }
} 