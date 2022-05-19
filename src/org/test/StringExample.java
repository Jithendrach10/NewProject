package org.test;

public class StringExample {
   public static void main(String[] args) {
	String s = "welcome to java";
	System.out.println(s);
	
	//length of the string
	int len = s.length();
	System.out.println(len);
	
	//upper case
	
	String upr = s.toUpperCase();
	System.out.println(upr);
	
	//lower case
	
	String lwr = s.toLowerCase();
	System.out.println(lwr);
	
	//index of string
	
	int ind = s.indexOf('a');
	System.out.println(ind);
	
	//last index of string
	
	int lst = s.lastIndexOf('a');
	System.out.println(lst);
	
	//startwith String
	   boolean sw = s.startsWith("lco");
	   System.out.println(sw);
	   
	//endwith string
	   boolean ew = s.endsWith("jav");
	    System.out.println(ew);
	    
	//contains squence of string
	    boolean cont = s.contains("to");
	    System.out.println(cont);
	    
	//empty string checking
	    boolean emp = s.isEmpty();
	    System.out.println(emp);
	    
	 //replace single character
	    String rep = s.replace('a','$');
	    System.out.println(rep);
	  //string
	    
	    String s2 = "Tata Software Pvt ltd";
	    String s3="Welcome to java";
	    //compare two string 
	    boolean b = s.equals(s3);
	    System.out.println(b);
	    
	 //replaceall Multi string
	    String repal = s.replaceAll("ja","12");
	    System.out.println(repal);
	    
	    String s4 = "welcome";
	    System.out.println("iterate String");
	    for(int i=0;i<s4.length();i++) {
	    	char c = s4.charAt(i);
	    	System.out.println(c);
	    	
	    }
	    String s5 = "        welcome to Tamatoo";
	    String p =s5.substring(15,25);
	    System.out.println(p);
	    
	    String p2 = s5.trim();
	    System.out.println(p2);
	    
	    String p4 = s5.substring(15);
	    System.out.println(p4);
	    }
	    
}

