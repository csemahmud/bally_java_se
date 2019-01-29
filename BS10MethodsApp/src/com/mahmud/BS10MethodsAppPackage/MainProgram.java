/**
 * 
 */
package com.mahmud.BS10MethodsAppPackage;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class MainProgram {

	/**
		 * @author MAHMUDUL HASAN KHAN CSE
		 *
		 */
	private final class MyInteger extends Number {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 4484067014500533582L;
		private int integer;

		/**
		 * @param integer
		 */
		public MyInteger(int integer) {
			this();
			this.integer = integer;
		}

		/**
		 * 
		 */
		public MyInteger() {
			// TODO Auto-generated constructor stub
			super();
		}

		/* (non-Javadoc)
		 * @see java.lang.Number#doubleValue()
		 */
		@Override
		public double doubleValue() {
			// TODO Auto-generated method stub
			return integer;
		}

		/* (non-Javadoc)
		 * @see java.lang.Number#floatValue()
		 */
		@Override
		public float floatValue() {
			// TODO Auto-generated method stub
			return integer;
		}

		/* (non-Javadoc)
		 * @see java.lang.Number#intValue()
		 */
		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return integer;
		}

		/* (non-Javadoc)
		 * @see java.lang.Number#longValue()
		 */
		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return integer;
		}

		/**
		 * @return the integer
		 */
		public int getInteger() {
			return integer;
		}

		/**
		 * @param integer the integer to set
		 */
		public void setInteger(int integer) {
			this.integer = integer;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("MyInteger [integer=").append(getInteger()).append("]");
			return builder.toString();
		}

	}

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}
	
	private static final MainProgram X = new MainProgram();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		addNumbers(3,5,13,89);
		
		int integer = 5;
		System.out.println();
		System.out.println("\tBefore callByValue(), integer = "
				+ integer);
		callByValue(integer);
		System.out.println("\tAfter callByValue(), integer = "
				+ integer);
		
		Integer anInteger = new Integer(integer);
		System.out.println();
		System.out.println("\tBefore callByInteger(), anInteger = "
				+ anInteger);
		callByInteger(anInteger);
		System.out.println("\tAfter callByInteger(), anInteger = "
				+ anInteger);
		
		MyInteger myInteger = X.new MyInteger(integer);
		System.out.println();
		System.out.println("\tBefore callByReference(), myInteger = "
				+ myInteger);
		callByReference(myInteger);
		System.out.println("\tAfter callByReference(), myInteger = "
				+ myInteger);

	}

	private static void callByReference(MyInteger myInteger) {
		// TODO Auto-generated method stub
		
		System.out.println("\tInside callByReference(), myInteger = "
				+ myInteger);
		myInteger.setInteger(10);
		System.out.println("\tAfter setting new value, myInteger = "
				+ myInteger);
		myInteger = X.new MyInteger();
		myInteger.setInteger(150);
		System.out.println("\tAfter assigning again and setting new value, myInteger = "
				+ myInteger);
		
	}

	private static void callByInteger(Integer anInteger) {
		// TODO Auto-generated method stub
		
		System.out.println("\tInside callByInteger(), anInteger = "
				+ anInteger);
		anInteger = 10;
		System.out.println("\tAfter assigning, anInteger = "
				+ anInteger);
		
	}

	private static void callByValue(int integer) {
		// TODO Auto-generated method stub
		
		System.out.println("\tInside callByValue(), integer = "
				+ integer);
		integer = 10;
		System.out.println("\tAfter assigning, integer = "
				+ integer);
		
	}

	private static void addNumbers(int... integers) {
		// TODO Auto-generated method stub
		
		System.out.print("\t");
		int sum = 0;
		int counter = 0;
		for(int integer : integers) {
			
			counter++;
			sum += integer;
			System.out.print(integer);
			if(counter < integers.length) {
				
				System.out.print(" + ");
				
			}
			
		}
		System.out.println(" = " + sum);
		
	}

}
