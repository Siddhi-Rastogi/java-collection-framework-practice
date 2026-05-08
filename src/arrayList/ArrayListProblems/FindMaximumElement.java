package arrayList.ArrayListProblems;
import java.util.ArrayList;
public class FindMaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(8);
        arr.add(1);
        arr.add(9);
        arr.add(3);
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum element in arr: "+ max);


    }
}
