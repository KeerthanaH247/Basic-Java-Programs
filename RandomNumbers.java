package Basics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.*;
public class RandomNumbers {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("To print random numbers between 1 to 5");
		for(int i=0;i<=5;i++) {
			System.out.println((int)(5*Math.random()));
		}
		System.out.println("To print random numbers between 1 to 100");
		for(int i=1;i<100;i++) {
			System.out.println((int)(100*Math.random()));
		}
		System.out.println("Non repeated Random numbers");
		Set <Integer> i=new HashSet<Integer>();
		while(i.size()!=10) {
			int val=(int)(10*Math.random());
			if(!i.contains(val)) {
				System.out.println(i);
			i.add(val);
			}
		}
		TreeSet <Integer> ts=new TreeSet<>();
		while(ts.size()!=5) {
			int num=(int)(5*Math.random());
			if(!ts.contains(num)) {
				System.out.println(num);
				ts.add(num);
			}
		Iterator its=ts.iterator();
		while(its.hasNext()) {
				System.out.println(its.next());
			}
		System.out.println("To print umbers from 65 to 74 ");
		Set<Integer> n=new HashSet<>();
		while(n.size()!=10) {
			int value=(int)(10*Math.random())+65;
			if(!n.contains(value)) {
				System.out.println(value);
				n.add(value);
			}
		}
		}
	}

}
