package collection;
import java.util.*;
public class ArrayLength {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("roshini");
		ll.add("dinesh");
		ll.add("sabar");
		ll.add("varsh");
		ll.add("tk");
		System.out.println(ll);
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			String ele=it.next();
			if(ele.length()!=5) {
				it.remove();
				
			}
		}
		System.out.println("After removing it"+ll);
	}

}
