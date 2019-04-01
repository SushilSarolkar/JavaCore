package com.techm.sushil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {
		//regular 
		List<Integer>list=Arrays.asList(10,10,10);
		Integer red=
		list.stream()
			.reduce(0,Integer::sum);
		System.out.println("red= "+red);
		
		//still two input
		List<Integer>list1=Arrays.asList(10,10);
		Integer red1=
		list1.stream()
			.reduce(0,Integer::sum);
		System.out.println("red= "+red1);
		
		//provided 1 input only
		List<Integer>list2=Arrays.asList(10);
		Integer red2=
		list2.stream()
			.reduce(0,Integer::sum);
		System.out.println("red= "+red2);
		
		//
		List<Integer>list3=Arrays.asList(10);
		Integer red3=
		list3.stream()
			.reduce(100,Integer::sum);
		System.out.println("red= "+red3);
		
		//no input is return identity elemnt as here 0
		List<Integer>list4=Arrays.asList(1);
		Integer red4=
		list4.stream()
			.reduce(0,Integer::sum);
		System.out.println("red= "+red4);
		
		//As max does not return integer it return option when identity element not present
		List<Integer>list5=Arrays.asList(-10,-10);
		Optional<Integer> red5=
		list5.stream()
			.reduce(Integer::max);
		System.out.println("red= "+red5);
	}

}
