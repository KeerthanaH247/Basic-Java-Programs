package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class UniqueString {

	public static void main(String[] args) {
		String[] str= {"Google","Facebook","Tesla","Yahoo","Yahoo","Google","Facebook","Tesla", "eCommerce","mCommerce"};
		List<String> lst=new LinkedList<>(Arrays.asList(str));
		System.out.println(lst);
		Set<String> set=new HashSet<>(lst);
	System.out.println(set);
	Object objs[]=set.toArray();
	wordsort(objs);
	System.out.println(Arrays.toString(objs));}
static void wordsort(Object[] arr)
{
	String temp=null;
	boolean flag=true;
	while(flag)
	{	flag=false;
		for(int i=0;i<arr.length-1;i++)
		{if(((String)arr[i]).compareTo((String)arr[i+1])>0)
			{	temp=(String)arr[i];
				arr[i]=(String)arr[i+1];
				arr[i+1]=temp;
				flag=true;}}}
			
	}

}
