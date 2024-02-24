package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.Map.Entry;
public class Hash {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> lhm=new HashMap<>();
//		lhm.put(1,"Roshini");
//		lhm.put(7, "arun");
//		lhm.put(2,"Varshini");
//		lhm.put(6, "sandhiya");
		for(int i=0;i<3;i++) {
			int num=sc.nextInt();
			String str=sc.nextLine();
			//nextLine();
			lhm.put(num, str);
		}
		Set<Map.Entry<Integer,String>> sm=lhm.entrySet();
		System.out.println("using the entry set");
	for(Map.Entry<Integer,String> e: sm) {
			System.out.println(e.getKey()+" "+e.getValue());
	}
		System.out.println("Using fo each loop");
		for(Map.Entry e:lhm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
		Set<Integer> s=lhm.keySet();
		System.out.println(s);
		
		Collection<String> empname=lhm.values();
		System.out.println(empname);
		
		lhm.remove(3); //if the key value is 3 then you need to remove the key value only
		System.out.println(lhm);
		
		lhm.put(2,"Arus"); //override
		System.out.println(lhm.get(2)); //replaced by Arus
		System.out.println(lhm);
		System.out.println(lhm.getOrDefault(3,"di"));
		
		Iterator<Map.Entry<Integer,String>> iter=lhm.entrySet().iterator();
		while(iter.hasNext()) {
			//System.out.println(iter.next());
			Map.Entry<Integer,String> v=iter.next();
			System.out.println(v.getKey()+" "+v.getValue());
		}
}
}
