package com.duplicate;

import java.util.Arrays;

public class FindDup {

	public static String findDup(String s){
		int count=0;
		String ret="";
		//String s="geetha";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++){
			count=0;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]='@';
				}
			}
			if(ch[i]!='@')
				//System.out.println("frequency of "+ch[i]+" is "+(count+1));
				ret=ret+"frequency of "+ch[i]+" is "+(count+1);
		}
		return ret;
	}
}
