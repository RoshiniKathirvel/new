package collection;
import java.util.*;
public class LinkedOperation {

	private static final int LinkedList = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Roshini");
		ll.add("Arun");
		ll.add("Varshini");
		ll.add("Sandhiya");
		ll.add("Keerthi");
		ll.add("Dinesh");
		System.out.println("Values in the list is:"+ll);
		ll.addFirst("Varun");
		//System.out.println("Adding first "+ll);
        ll.addLast("tk");
       // System.out.println("Adding last"+ll);
        ll.add(4,"shabarivasan");
       // System.out.println(ll);
        ll.remove(0); //index based removal
        //System.out.println(ll);
        ll.remove("Roshini"); //specify value is also given to delete
       // System.out.println(ll);
        ll.clone(); //copy of the ll
       // System.out.println(ll);
        LinkedList<String> all=(LinkedList<String>) ll.clone();
        System.out.println(all);
        System.out.println("Using descending iterator");
        Iterator<String> is=all.descendingIterator();
        while(is.hasNext()) {
        	System.out.println(is.next());
        }
        System.out.println("Head of the list is returned"+all.element());
        System.out.println("display the specific index value"+all.get(2));
        System.out.println("Get first"+all.getFirst());
        System.out.println("Get last"+all.getLast());
        all.offer("Rose");
        all.offer("sabari");
        System.out.println(all);
        System.out.println(all.poll()); //it should return the first name and delete that
        System.out.println(all);
        System.out.println("List Iterator");
        Iterator<String> it=all.listIterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("peek value is"+all.peek());
	}

}
