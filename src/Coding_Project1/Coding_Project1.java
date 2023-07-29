package Coding_Project1;

import java.time.LocalDate;
 

public class Coding_Project1 {

	public static void main(String[] args) {
//1)		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int additionSum = 0;

		additionSum = ages[ages.length - 1] - ages[0];

		System.out.println(additionSum);

//b)		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 67};
		
		int additionSum2 = 0;
		
		additionSum2 = ages2[ages2.length - 1] - ages2[0];
		
		System.out.println(additionSum2);
		
//c)
		double sum = 0.0;
		
		for (double age : ages) {
			sum += age;
		}
		
		double average = sum / ages.length;
		System.out.println("The average of this array is " + average);
		
//2)
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		sum = 0;
		for (int i = 0; i < names.length; i++) {
		sum += names[i].length();
			
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average );
		
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
//3)	using [arrayName.length-1] - using this property allows you to access the last element of an array regardless of the size.
		
//4)	using arrayName[0] will always access the first element of an array as arrays are 0 based. (i.e. ages[0] = 3)
		
//5)
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
			System.out.println(nameLengths[i]);
		}
//6)
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println(sum);
//7)
		System.out.println(duplicateWord("Hello", 6));
//		private static String duplicateWord(String word, int n) {
//			String duplicatedWord = "";
//			for (int i = 0; i < n; i++) {
//				duplicatedWord += word;
//			}
//			return duplicatedWord;
	
//8)
		System.out.println(getFullName("Mason", "Curtis"));
		
//		private static String getFullName(String firstN, String lastN) {
//			return firstN + " " + lastN;
//		}
	
//9)
		System.out.println(checkIfSumGreaterThan100(ages));
		
//		private static boolean checkIfSumGreaterThan100(int[] arr) {
//			int sum = 0;
//			for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			}
//			
//			return sum > 100;
		
		
//10)	
		double[] doubleArray = {0.32, 4.65, 6.45, 3.82};
		System.out.println("The average of doubleArray " + getAverageOfDoubleArray(doubleArray));
//		private static double getAverageOfDoubleArray(double[] doubleArray) {
//			double sum = 0.0;
//			
//			for (int i = 0; i < doubleArray.length; i++) {
//			sum += doubleArray[i];	
//			}
// 			return sum / doubleArray.length;
		
//11)  
		double[] secondDoubleArray = {.45, 8.32, 6.12, 1.91, 3.2};
		System.out.println("If averageFirstArr() is greater return true: " + averageFirstArr(secondDoubleArray, doubleArray));
//		private static boolean averageFirstArr(double[] averageFirstArr, double[] averageSecondArr) {
//			
//			
//			return getAverageOfDoubleArray(averageFirstArr) > getAverageOfDoubleArray(averageSecondArr);
//		}
		
		
//12)
		System.out.println("If true, I get a drink, if false I don't: " + willBuyDrink(false, 10.98));
//		
//		private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//			return isHotOutside && moneyInPocket > 10.50;
//		}
		
//13)	
		System.out.println("What is today's Date?");
		System.out.println(todaysDate());
		
//		private static LocalDate todaysDate() {
//			return java.time.LocalDate.now();
//			}
	}
//	private static LocalDate todaysDate() {
//		
//		return java.time.LocalDate.now();
//		}

	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return duplicatedWord;
	}
	
	private static String getFullName(String firstN, String lastN) {
		return firstN + " " + lastN;
	}
	
	private static boolean checkIfSumGreaterThan100(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
		}
		
		return sum > 100;
	}
	
	private static double getAverageOfDoubleArray(double[] doubleArray) {
		double sum = 0.0;
		
		for (int i = 0; i < doubleArray.length; i++) {
		sum += doubleArray[i];	
		}
		
		return sum / doubleArray.length;
	}
	
	private static boolean averageFirstArr(double[] averageFirstArr, double[] averageSecondArr) {
		
		
		return getAverageOfDoubleArray(averageFirstArr) > getAverageOfDoubleArray(averageSecondArr);
	}
	
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	private static LocalDate todaysDate() {
		return java.time.LocalDate.now();
		}
	}  
	
	



