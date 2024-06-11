package collections;
import java.util.*;
public class Main{  
   // @SuppressWarnings("unchecked")  
    public static void main(String[] args) {  
  
        ArrayList<Smartphone> phoneList = new ArrayList<>();  
        Smartphone ph1 = new Smartphone("Apple", "6s", 50000, 10);  
        Smartphone ph2 = new Smartphone("lg", "pro2", 40000, 9);  
        Smartphone ph3 = new Smartphone("MI", "3s", 10000, 6);  
        Smartphone ph4 = new Smartphone("Letv", "le2", 12000, 7);  
  
        phoneList.add(ph1);   
        phoneList.add(ph2);  
        phoneList.add(ph3);  
        phoneList.add(ph4);  
        System.out.println("Actual List");  
        System.out.println(phoneList);  
        System.out.println("Sorting the list as comparator");  
        Collections.sort(phoneList, new Ratingcomparator());  
  
        System.out.println(phoneList);  
        System.out.println("Reversing the Comparator sorting");  
        Comparator<Smartphone> cmp = Collections.reverseOrder(new Ratingcomparator());  
  
        Collections.sort(phoneList, cmp);  
        System.out.println("Printing the reverse list");  
        System.out.println(phoneList);  
    }  
  
}  