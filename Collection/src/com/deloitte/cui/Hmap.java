package com.deloitte.cui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Hmap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> result= new HashMap<Integer,String>();
		
		result.put(123, "ABC");
		result.put(465, "AC");
		result.put(789, "AaBC");
		result.put(1231, "ABCd");
		
		System.out.println(result.size());
		System.out.println(result.get(345));
		
		Set<Integer> keys= result.keySet();
		
		for(Integer key:keys) {
			
			System.out.println(keys+"-"+result.get(key));
			
		}
			Iterator<Integer> iterator= keys.iterator();
			Integer key;
				while(iterator.hasNext()) {
					key=iterator.next();
					System.out.println(key+"-"+result.get(key));
				}
			
			
		}

}
