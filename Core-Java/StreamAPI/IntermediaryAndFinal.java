package com.techm.sushil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Sagar","sushil","Suchita","shweta");
		Predicate<String>p1=Predicate.isEqual("sushil");
		Predicate<String>p2=Predicate.isEqual("Suchita");
		List<String> list=new ArrayList<>();
		
		stream
		 		.peek(System.out::println)
				.filter(p1.or(p2))
				/*.peek(list::add)*/
				//only final is able to trigger the data in java code of streaming.
				//look at foreach method which is not intermediary method its final method.
				.forEach(list::add);
		System.out.println("Done");
		System.out.print("list size: "+list.size());
		

	}

}
