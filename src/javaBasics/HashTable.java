package javaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable(); // in hashtable we dont have index we have is
		
		ht.put("A", "Test");
		ht.put("B", "Hello");
		ht.put("C", "World");
		
		System.out.println(ht.size());
		System.out.println(ht.get("A"));
		
		System.out.println(ht);
		}

	}


