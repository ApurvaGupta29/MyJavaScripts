package JAVA24;

 class OverRiding {
	void add()
	{
		System.out.println("addParents");
	}
	
	void sub()
	{
		System.out.println("subParents");
	}
}


public class RunTimePolymorphism extends OverRiding{
	void add()
	{
		System.out.println("addChild");
	}
	
	void sub()
	{
		System.out.println("subChild");
	}
	public static void main(String[] args) {
		OverRiding r1 = new OverRiding();
	//	RunTimePolymorphism p1 = new RunTimePolymorphism();		
		r1.add();
		// p1.sub();
	}

}
