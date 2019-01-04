/**
 * 
 */
package com.mahmud.BS04InstanceOffAppPackage;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class MainProgram {

	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	public class Other {

		/**
		 * 
		 */
		public Other() {
			// TODO Auto-generated constructor stub
		}

	}
	
	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	public interface Another {

	}

	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	private interface MyInterface {

	}

	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	private class Parent {

		/**
		 * 
		 */
		public Parent() {
			// TODO Auto-generated constructor stub
		}

	}

	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	private class Child extends Parent implements MyInterface {

		/**
		 * 
		 */
		public Child() {
			// TODO Auto-generated constructor stub
		}
		
		public void printChild() {
			
			System.out.println("\tI am Child .");
			
		}

	}

	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		MainProgram x = new MainProgram();
		Parent parent = x.new Parent();
		Parent child = x.new Child();
		System.out.println("\tparent instanceof Parent : "
				+ (parent instanceof Parent));
		System.out.println("\tparent instanceof Child : "
				+ (parent instanceof Child));
		System.out.println("\tparent instanceof MyInterface : "
				+ (parent instanceof MyInterface));
		
		System.out.println();
		printValue(parent);
		
		System.out.println();
		System.out.println("\tchild instanceof Parent : "
				+ (child instanceof Parent));
		System.out.println("\tchild instanceof Child : "
				+ (child instanceof Child));
		System.out.println("\tchild instanceof MyInterface : "
				+ (child instanceof MyInterface));
		
		System.out.println();
		printValue(child);
		
//		System.out.println("\tchild instanceof Other : "
//				+ (child instanceof Other));
		// Compilation error
		// Incompatible conditional operand types
		// MainProgram.Parents and MainProgram.Others
		
		System.out.println("\tchild instanceof Another : "
				+ (child instanceof Another));
		
		System.out.println();
		
		System.out.println("\tAfter setting child = null,");
		child = null;
		System.out.println("\tchild instanceof Object : "
				+ (child instanceof Object));
		System.out.println("\tchild instanceof Parent : "
				+ (child instanceof Parent));
		
		System.out.println();
		
		int integer = 10;
		
		System.out.println("\tInteger.valueOf(integer) instanceof Integer) : " 
				+ (Integer.valueOf(integer) instanceof Integer));
		
		int[] integerArray = new int[3];
		System.out.println("\tintegerArray instanceof Object : " 
				+ (integerArray instanceof Object));
		
	}

	private static void printValue(Parent parent) {
		// TODO Auto-generated method stub
		
		if(parent instanceof Child) {
			
			((Child) parent).printChild();
			System.out.println("\tParent refers to child .");
			
		} else {
			
			System.out.println("\tParent does not refer to child .");
			
		}
		
	}

}
