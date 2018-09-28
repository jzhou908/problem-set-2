import java.util.Scanner;

public class ProblemSet2 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("What is your first and last name?");
		String name = in.nextLine();
		System.out.println("Hello, " + name + "!");
	}
	
	public void gradeMe() {
		System.out.println("What is your first homework grade?");
		double hw1 = in.nextDouble();
		System.out.println("What is your second homework grade?");
		double hw2 = in.nextDouble();
		System.out.println("What is your third homework grade?");
		double hw3 = in.nextDouble();
		double avgh = (hw1 + hw2 + hw3)/3;
		System.out.println(avgh);
		System.out.println("What is your first quiz grade?");
		double q1 = in.nextDouble();
		System.out.println("What is your second quiz grade?");
		double q2 = in.nextDouble();
		System.out.println("What is your third quiz grade?");
		double q3 = in.nextDouble();
		double avgq = (q1 + q2 + q3)/3;
		System.out.println(avgq);
		System.out.println("What is your first test grade?");
		double t1 = in.nextDouble();
		System.out.println("What is your second test grade?");
		double t2 = in.nextDouble();
		System.out.println("What is your third test grade?");
		double t3 = in.nextDouble();
		double avgt = (t1 + t2 + t3)/3;
		System.out.println(avgt);
		double avg = (0.15 * avgh) + (0.3 * avgq) + (0.55 * avgt);
		System.out.println("Your average is " + avg);
	}
	
	public void groupUs() {
		System.out.println("How many teachers are there?");
		int teachers = in.nextInt();
		System.out.println("How many students are there?");
		int students = in.nextInt();
		int people = teachers + students;
		int buses = people/47;
		int r = people % 47;
		if (r != 0) {
			buses++;
		}
		System.out.println("There will be " + buses + ". The last bus will have " + r);
		in.nextLine();
	}
	
	public void info() {
		System.out.println("What is your first name?");
		String first = in.nextLine();
		System.out.println("What is your last name?");
		String last = in.nextLine();
		System.out.println("What is your grade?");
		int grade = in.nextInt();
		System.out.println("What is your age?");
		int age = in.nextInt();
		System.out.println("What is your hometown?");
		String ht = in.nextLine();
		System.out.println("Name: /t/t" + first + " " + last + "/nGrade: /t/t" + grade + "/nAge: /t/t" + age + "/nHometown: /t/t" + ht);
	}
	
	public void initials() {
		System.out.println("What is your first name?");
		char a = in.next().charAt(0);
		System.out.println("What is your middle name?");
		char b = in.next().charAt(0);
		System.out.println("What is your last name?");
		char c = in.next().charAt(0);
		System.out.println("Your intials are: " + a + b + c);
		in.close();
	}
}
