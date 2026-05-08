package arrayList.ArrayListProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int even=0;
        int odd=0;
        for(int num:arr){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: "+even +" Odd: "+ odd);
    }
}
