package com.acme.testing;

import com.acme.utils.ConversionService;

public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(50));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(7.7));

		// can you figure out why these do not compile
		ConversionService.fluidOunces((float) 1.1);
		// Cannot do a downcast, double to float, implicitly

		ConversionService.grams((int) 30L);
		// Cannot do a downcast, long to int, implicitly

		ConversionService.milliliters((int) 4.0);
		// Need an explicit cast to go from double to int

		short grams = (short) ConversionService.grams(30);
		// Cannot downcast return int to a short implicitly

		byte byteGrams = (byte) ConversionService.grams(30);
		// Cannot downcast return int to a byte implicitly

		System.out.println(grams);
		System.out.println(byteGrams);

		// why do these still work even though the types are different

		System.out.println("------------------------------------");
		double ounces = ConversionService.fluidOunces(1.1f);
		// upcast from returning float to double is implicit

		System.out.println(ounces);
		long milliliters = ConversionService.milliliters(40);
		// upcast from returning int to long is implicit

		System.out.println(milliliters);
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);

		short s = 30;
		System.out.println(ConversionService.grams(s));
		// upcast from short to int is implicit

		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		// upcast from byte to int is implicit

		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		// cast from char to int is implicit

		System.out.println(ConversionService.gallons(200));
		// cast from int to float is allowed and is implicit (but may lose precision)

		System.out.println(ConversionService.ounces(50.5f));
		// upcast from float to double is implicit

		System.out.println(ConversionService.pints(6L));
		// cast from long to float is allowed and is implicit (but may lose precision)

		System.out.println(ConversionService.pounds(7L));
		// cast from long to double is allowed and is implicit (but may lose precision)

		// compare these results. Can you tell why they are different?

		System.out.println("------------------------------------");
		float bigGallons = ConversionService.gallons(123456789123456789L);
		System.out.println(bigGallons);
		// precision is lost due to working large numbers and float type

		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);
		// precision is retained due to working with doubles and large numbers

		System.out.println("------------------------------------");
		int bigGrams = ConversionService.grams(1234567890);
		System.out.println(bigGrams);
		// precision is lost due to multiplying 2 ints

		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
		// precision is maintained using longs

	}

}
