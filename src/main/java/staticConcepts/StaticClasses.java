package staticConcepts;

import staticConcepts.MainClass.InnerClass;

public class StaticClasses {

	public static void main(String[] args) {
		
		MainClass.StaticInnerClass obj = new MainClass.StaticInnerClass();		
		System.out.println(obj.name);
		
		MainClass.InnerClass obj2 = new MainClass().new InnerClass();
		
		System.out.println(obj2.name );

	}

}
