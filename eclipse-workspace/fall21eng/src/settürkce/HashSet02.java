package settürkce;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet02 {

	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet<>
		(Arrays.asList("ali","veli","kirkdokuz","elli"));
		
		TreeSet<String> ts1=new TreeSet<>(hs1);
		
		System.out.println("HashSet düzenlendi:  "+ts1);
		
		TreeSet<String> ts2=new TreeSet<>(Arrays.asList("ali","veli","kirkdokuz","elli"));
	}

}
