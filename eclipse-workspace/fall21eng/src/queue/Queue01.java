package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {

		Queue<String> q1=new LinkedList<>();
		q1.add("ali");
		q1.add("veli");
		q1.add("kirkdokuz");
		q1.add("elli");
		System.out.println("LinkedList herzaman giris sirasina göre koyar.."+q1);
		//[ali, veli, kirkdokuz, elli] 
		
		Queue<String> q2=new PriorityQueue<>();
		q2.add("ali");
		q2.add("veli");
		q2.add("kirkdokuz");
		q2.add("elli");
		System.out.println("PriorityQueue nin kendisine göre algoritmalari vardir ve ona göre koyar.."+q2);

		//[ali, elli, kirkdokuz, veli]
	}

}
