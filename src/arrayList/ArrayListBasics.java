package arrayList;
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        
    ArrayList<String> fruits=new ArrayList<>();

    //adding items to arrayList
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");

    //printing
    System.out.println(fruits);

    //access
    System.out.println(fruits.get(1));

    //updating elements
    fruits.set(1,"siddhi");

    //removing elements
    fruits.remove("Banana");

    //checking
    System.out.println(fruits.contains("Mango"));

    //traversing
    for(String i:fruits){
        System.out.println(i);
    }
}
}
