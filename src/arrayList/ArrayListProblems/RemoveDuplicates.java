package arrayList.ArrayListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());

        }
        ArrayList<Integer> nums =new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(!nums.contains(arr.get(i))){
                nums.add(arr.get(i));
            }
        }
        System.out.println(nums);
        sc.close();

    }
}
