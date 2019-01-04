/**
 * 
 */
package com.mahmud.BS05BitAppPackage;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("\n\n");
		int bitmask = 0x000F;
		int value = 0x2222;
		System.out.printf("\t%04x & %04x = %04x%n", 
				value, bitmask, value & bitmask);
		System.out.printf("\t%s & %s = %s%n", 
				Integer.toBinaryString(value), 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(value & bitmask));
		System.out.printf("\t%04x | %04x = %04x%n", 
				value, bitmask, value | bitmask);
		System.out.printf("\t%s | %s = %s%n", 
				Integer.toBinaryString(value), 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(value | bitmask));
		System.out.printf("\t%04x ^ %04x = %04x%n", 
				value, bitmask, value ^ bitmask);
		System.out.printf("\t%s ^ %s = %s%n", 
				Integer.toBinaryString(value), 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(value ^ bitmask));
		System.out.printf("\t~%08x = %08x%n", 
				bitmask, ~bitmask);
		System.out.printf("\t~%s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(~bitmask));
		System.out.printf("\t%04x << %04x = %04x%n", 
				bitmask, 1, bitmask << 1);
		System.out.printf("\t%s << %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask << 1));
		System.out.printf("\t%04x >> %04x = %04x%n", 
				bitmask, 1, bitmask >> 1);
		System.out.printf("\t%s >> %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask >> 1));
		System.out.printf("\t%04x >>> %04x = %04x%n", 
				bitmask, 1, bitmask >>> 1);
		System.out.printf("\t%s >>> %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask >>> 1));
		bitmask = -bitmask;
		System.out.printf("\t%x << %x = %x%n", 
				bitmask, 1, bitmask << 1);
		System.out.printf("\t%s << %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask << 1));
		System.out.printf("\t%x >> %x = %x%n", 
				bitmask, 1, bitmask >> 1);
		System.out.printf("\t%s >> %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask >> 1));
		System.out.printf("\t%x >>> %x = %x%n", 
				bitmask, 1, bitmask >>> 1);
		System.out.printf("\t%s >>> %s = %s%n", 
				Integer.toBinaryString(bitmask), 
				Integer.toBinaryString(1), 
				Integer.toBinaryString(bitmask >>> 1));
		
	}

}
