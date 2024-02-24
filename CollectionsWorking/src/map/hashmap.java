package map;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
	 
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"Roshini");
		lhm.put(7, "arun");
		lhm.put(2,"Varshini");
		lhm.put(6, "sandhiya");
		Set<Map.Entry<Integer,String>> sm=lhm.entrySet();
		for(Map.Entry<Integer,String> e: sm) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
