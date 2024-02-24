package collection;
import java.util.*;

public class DemoIterator {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("First collection: " + al);
         all.add(5);
         all.add(6);
         all.add(3);
         all.add(7);
        System.out.println("Second Collection:" + all);
        System.out.println("Displaying using the toArray method");
        Object[] arr=all.toArray();
        System.out.println(arr[0]);
        if(all.isEmpty()) {
        	System.out.println("Empty");
        }
        else {
        	System.out.println(all);
        }
         System.out.println(all.indexOf(3));
        System.out.println(all.contains(3));
        System.out.println("List is: "+all);
        Iterator <Integer> it=all.iterator();
//        while(it.hasNext()) {
//        	System.out.print(it.next());
//        }
        //String s;
       // int s;
        while(it.hasNext()) {
        	//s=it.next().toString();
        	if(it.equals(3)) {
        		System.out.println(it.next()+"string of");
        	}
        }
    }
}
