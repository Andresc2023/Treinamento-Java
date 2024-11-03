package aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";

		System.out.println(banana.indexOf('x'));//-1 pq não existe
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf('a'));//próx index
		System.out.println(banana.lastIndexOf(ana));
		
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ceu"));
	}

}
