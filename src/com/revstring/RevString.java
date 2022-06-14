package com.revstring;

public class RevString {
	public static void main(String[] args) {
		String s1 = "1,2,3,4,swapnil,5,6,7";
		
		String[] s2 = s1.split(",");
		String s3 = s2[4].toString();
		//System.out.println(s3);
		StringBuffer sb = new StringBuffer(s3);
		sb.reverse();
		String ss1 = new String(sb);
		//System.out.println(ss1);
		String ss2=s1.replace(s3, ss1);
		System.out.println(ss2);
	
	}

}
