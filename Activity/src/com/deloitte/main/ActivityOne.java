package com.deloitte.main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Collection;

class DBAccess{
	
	public Collection<String> getResult(){
		
		LinkedList<String> result= new LinkedList<String>();
		
		result.add("B");
		result.add("C");
		result.add("D");
		result.add("X");
		result.add("Y");
		result.addLast("Z");
		result.addFirst("A");
		
		result.add(1,"A2");
		
		System.out.println("original contents of Result:" + result);
		
		result.remove("F");
		result.remove(2);
	
		System.out.println("contents of Result after Deletion:" + result);
		
		result.removeFirst();
		result.removeLast();
		
		System.out.println("Result after deleting first and last: " + result);
		
		String val =result.get(2);
		result.set(2, val + "changed");
		
		System.out.println("contents after change:" + result);
		
		
	
		 return result;
		}
	}

public class ActivityOne {

	public static void main(String[] args) {
		
		DBAccess dba= new DBAccess();
	
		dba.getResult();
		
		
	}

}
