package arrayList.ArrayListProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size of list: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size(); i++) {

            int count = 1;
            boolean visited = false;

            for(int k = 0; k < i; k++) {
                if(list.get(i).equals(list.get(k))) {
                    visited = true;
                    break;
                }
            }

            if(visited) {
                continue;
            }

            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            System.out.println(list.get(i) + " -> " + count);
        }

        sc.close();
    }
}