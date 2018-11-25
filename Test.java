package collectionwithfrequency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		List <String> list = new ArrayList<>();
int c = 0;
for(String str : "hello I akhjf sjdhj sss".split(" "))
{
	list.add(str);
	c++;
}
Set<String> unique = new HashSet<String>(list);
for (String string : unique) {
	System.out.println(string + " "+ Collections.frequency(list, string ));
}
System.out.println(c);
	}*/

Map<String, Integer> m = new  HashMap<String, Integer>();
int c = 0;
for(String str : "hello I I akhjf sjdhj sss".split(" "))
{
   if(m.get(str) == null)
   {
	   m.put(str, 1);
	  c++; 
   }else 
   {
	  c++;
	  m.put(str, m.get(str)+1);
	  
	  
   }
}
System.out.println(c);
System.out.println(m);
 
	}
	}
