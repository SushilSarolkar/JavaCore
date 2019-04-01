package com.techm.sushil;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Sagar","sushil","Suchita","shweta");
		Predicate<String>p1=s->s.length() > 5;
		Predicate<String>p2=Predicate.isEqual("sushil");
		Predicate<String>p3=Predicate.isEqual("Suchita");
		stream
		.filter(p2.or(p3))
		.forEach(s->System.out.println(s));

	}

}
