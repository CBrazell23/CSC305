package lab8b;

import lab8b.Person.GENDER;

import java.util.stream.Stream;

import java.util.stream.Collectors;
import java.util.*;

public class StreamPerson {

	/**
	 * Prints details of all members
	 * @param streamofPerson a stream of all members
	 */
	static void printAllMembers(Stream<Person> streamOfPerson) {
		streamOfPerson.forEach(x -> x.printPerson());
	}
	
	/**
	 * Stores age of all members
	 * @param streamofPerson a stream of all members
	 * @return List of ages of all members
	 */
	static List<Integer> ageAllMembers(Stream<Person> streamOfPerson) {
		List<Integer> ages = streamOfPerson.map(x -> x.getAge()).collect(Collectors.toList());
		return ages;
	}
	
	/** 
	 * Stores the name of all members
	 * @param streamofPerson a stream of all members
	 * @return List of names of all members
	 */
	static List<String> nameAllMembers(Stream<Person> streamOfPerson) {
		List<String> names = streamOfPerson.map(x -> x.getName()).collect(Collectors.toList());
		return names;
	}
	
	/**
	 * Prints name of all members above age 35
	 * @param streamofPerson a stream of all members
	 */
	static void nameAgeAbove35(Stream<Person> streamofPerson) {
		streamofPerson.filter(x -> x.getAge() > 35).map(x -> x.getName()).forEach(System.out::println);
	}
	
	/**
	 * Calculates average age of all members
	 * @param streamofPerson a stream of all members
	 * @param count the total number of members
	 * @return the average age of all members 
	 */
	static double avgAgeAllMembers (Stream<Person> streamofPerson, long count) {	
		int sum = streamofPerson.mapToInt(x -> x.getAge()).sum();
		return sum / count;
	}
	
	/**
	 * Prints email ID of members between age of 18 and 35 
	 * @param streamofPerson a stream of all members
	 */
	static void emailSelectmembers (Stream<Person> streamofPerson) {
		streamofPerson.filter(x -> x.getAge() >= 18).filter(x -> x.getAge() <= 35).map(x -> x.getEmailAddress()).forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		Person[] arrayOfMembers = {
				new Person("Michael", 45, GENDER.MALE, "michael@dundermifflin.com"),
				new Person("Dwight", 37, GENDER.MALE, "dwight@dundermifflin.com"),
				new Person("Pam", 28, GENDER.FEMALE, "pam@dundermifflin.com"),
				new Person("Jim", 32, GENDER.MALE, "jim@dundermifflin.com"),
				new Person("Angela", 35, GENDER.FEMALE, "angela@dundermifflin.com"),
				new Person("Creed", 65, GENDER.MALE, "creed@dundermifflin.com"),
				new Person("Erin", 22, GENDER.FEMALE, "erin@dundermifflin.com")
		};
		
		/*
		 * Use the 6 methods defined above in main() to process arrayOfMembers
		 * Note that you can use streams only once
		 */
		
		Stream<Person> stream1 = Arrays.stream(arrayOfMembers);
		printAllMembers(stream1);
		
		Stream<Person> stream2 = Arrays.stream(arrayOfMembers); 
        ageAllMembers(stream2);
        
		Stream<Person> stream3 = Arrays.stream(arrayOfMembers); 
        nameAllMembers(stream3);
        
		Stream<Person> stream4 = Arrays.stream(arrayOfMembers); 
		nameAgeAbove35(stream4);
		
		Stream<Person> stream5 = Arrays.stream(arrayOfMembers); 
        avgAgeAllMembers(stream5, arrayOfMembers.length);
        
		Stream<Person> stream6 = Arrays.stream(arrayOfMembers); 
        emailSelectmembers(stream6);
		
	}
		
}
