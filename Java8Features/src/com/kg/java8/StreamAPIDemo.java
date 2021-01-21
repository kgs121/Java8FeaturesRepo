package com.kg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
	    for(int i=0;i<20;i++) {
	    al.add(new Integer(i));	    
	    }	    
	    System.out.println("without Stream "+al);
	    /*Stream<Integer> s = al.stream();
	    Predicate<Integer> p = i->i%2==0;
	    Stream<Integer> s1 = s.filter(p);
	    ArrayList<Integer> al2 = (ArrayList<Integer>) s1.collect(Collectors.toList());
	    System.out.println("with even filtered Stream "+al2);*/
	    //	Filtering
	    ArrayList<Integer> al2 = (ArrayList<Integer>) al.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println("with even filtered Stream "+al2);
	    
	    //	Mapping
	    ArrayList<Integer> al3 = (ArrayList<Integer>) al.stream().map(i->i*2).collect(Collectors.toList());
	    System.out.println("with Mapper Multiplied by two Stream "+al3);
	    
	    ArrayList<Integer> b1 = new ArrayList<>();
	    b1.add(10);b1.add(50);b1.add(90);b1.add(20);b1.add(70);
	    System.out.println("b1... "+b1);
	    // Natural Sorting
	    System.out.println("Natural Sorting "+b1.stream().sorted().collect(Collectors.toList()));
	    // Comparator Sorting
	    System.out.println("Comparater Sorting "+b1.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()));
	    // Max
	    System.out.println("Max  "+b1.stream().max((i1,i2)->i1.compareTo(i2)).get());
	    // Min
	    System.out.println("Min  "+b1.stream().min((i1,i2)->i1.compareTo(i2)).get());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
