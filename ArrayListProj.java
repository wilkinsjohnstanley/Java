import java.util.ArrayList;
public class ArrayListProj {
    public static void main(String[] args) {
        ArrayList fruitlist=new ArrayList();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");
        fruitlist.add("Green bean");
        fruitlist.remove("Green bean");
        //fruitList.clear();

        //contains() method returns a boolean value
        System.out.println(fruitlist.contains("Rasberry"));
        System.out.println(fruitlist);
    }
}
