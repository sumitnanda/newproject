package com.demo2.practice;

public class Test2 {

		public static void main(String[] args) {
//			String s1 = new String("pankaj");
//			String s2 = new String("PANKAJ");
//			String s3="PANKAJ";
//			String s4="pankaj";
//			System.out.println(s1 == s2);//false
//			System.out.println(s1.equals(s3));//false
//			System.out.println(s2.equals(s3));//True
//			System.out.println(s1.equals(s4));//true
			
			String s1 = "abc";
			String s2 = new String("abc");
			String s3=s2.intern();// as new string  created two object 1 in heap another in stack intern method provide the stringpoll memory object
		
			System.out.println(s1 ==s3);// as both are abc in stack memory
			
		}
	

}
