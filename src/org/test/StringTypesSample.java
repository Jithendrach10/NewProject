package org.test;

public class StringTypesSample {
     public static void main(String[] args) {
		String s = "Krishna";
		String s2 = "Krishna";
		//literal String (refer values, duplicate value obtain same memory location, we can't change value in memory location
		System.out.println("string Literal");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
		
		//non-literal String  (new string('value') , we can change memory location , different memory location for duplicate value
		
		String s3 = new String("Krishna");
		String s4 = new String("Krishna");
		System.out.println("non-literal String");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		String s5 = "Raman";
		String s6 = s2.concat(s5);
		System.out.println(s6);          //literal String combine 2 strings "concat"
		
		
		String s7 = new String("is combines");
		String s8 = s4.concat(s7);
		 
		 System.out.println(s8);
		 
		 StringBuffer s9 = new StringBuffer("jithendra");  //non literal string "append" for StringBuffer is used
		 StringBuffer s10 = new StringBuffer("indra");
		 s9.append(s10);
		 System.out.println(s9);
	}
}
