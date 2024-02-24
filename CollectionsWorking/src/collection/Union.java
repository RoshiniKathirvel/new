package collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Union {
 public static void main(String[] args) {
	 Set<Integer> s1=new HashSet<>();
	 Set<Integer> s2=new HashSet<>();
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 for(int i=0;i<size;i++) {
		 s1.add(sc.nextInt());
	 }
	 for(int j=0;j<size;j++) {
		 s2.add(sc.nextInt());
	 }
	 for(int sto:s1) {
		 if(s2.contains(sto)) {
			 System.out.println(s2);
		 }
	 }
 }
}
