package arrays;

public class ArrayIn2Ds {

	public static void main(String[] args) {
		
		//Array of multiple 1D Arrays - 2D Array
		
		//Array 1
		String [] fruits = {"Apple" , "Orange","Banana"};
		
		//Array 2
		String [] veggies = {"Carrot","Cabbage", "Tomato"};
		
		//Array 3 
		String [] seaFood = {"Fish" , "prawn","crab"};
		
		//Array 4
		String [] meatProducts = {"Chicken", "Meat", "Rabbit"};
		
		// 2D Array 
		String [] [] veganProducts = {fruits, veggies};
		
		// 2D Array 
		String [] [] nonVegProducts = {seaFood, meatProducts};		
			
		
		System.out.println(veganProducts[1][1]);
		System.out.println(veganProducts[0][2]);

		//Array of multiple 2D Arrays - 3D Array
		
		// 3D Array 
		String [][][] foodProducts = {veganProducts,nonVegProducts};
		
		System.out.println(foodProducts[1][0][2]);
	}

}
