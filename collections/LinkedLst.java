package collections;

import java.util.LinkedList;

public class LinkedLst {

	public static void main(String[] args) {
		
		LinkedList<String> jobs = new LinkedList<String>();
		
		jobs.add("Engineer");
		jobs.add("Medicine");
		jobs.add("Dietitian");
		jobs.add("Programmer");
		
		for(String job: jobs) {
			System.out.println(job);
		}
		
		System.out.println(jobs);
	}	
}
