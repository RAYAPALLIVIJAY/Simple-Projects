package com;

public class InnerClassType1 {
	
	
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {
		InnerClassType1 obj=new InnerClassType1();
		InnerClassType1.Inner in=obj.new Inner();  
		in.hello();  

	}

}
