package oop.test;

public class Inheri_SuperClass_Variables_Shares_To_Child {

	static {
		System.out.println("Main Method class executing");
	}

	public static void main(String[] args) {

		B b1 = new B();
		C c1= new C();
		System.out.println("==================Static========================");
		System.out.println("b1.a--"+b1.a);
		System.out.println("c1.a--"+c1.a);
		System.out.println("==================Non-Static========================");
		System.out.println("b1.x--"+b1.x);
		System.out.println("c1.x--"+c1.x);
		
		System.out.println("==================Changing Static values========================");
		b1.a = 30;
		System.out.println("b1.a--"+b1.a);
		System.out.println("c1.a--"+c1.a);
		System.out.println("==================Changing Non-Static values========================");
		b1.x = 40;
		System.out.println("b1.x--"+b1.x);
		System.out.println("c1.x--"+c1.x);
	}

}
