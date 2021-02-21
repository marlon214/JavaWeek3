
public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 1};
		
		System.out.println(ages[ages.length-1]-ages[0]);
		
		double avg1=0;
		for (int i=0; i<ages.length; i++) {
			avg1+=ages[i];
		}
		avg1/=ages.length;
		System.out.println(avg1);
		
		
		//2	
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double avg2=0;
		for (int i=0; i<names.length; i++) {
			avg2+=names[i].length();
		}
		System.out.println(avg2/=names.length);
		
		//5
		int nameLengths[]= {0,0,0,0,0,0};
		for (int i=0; i<names.length; i++) {
			nameLengths[i]=names[i].length();
		}

		//6
		int sum=0;
		for (int i=0; i<nameLengths.length; i++) {
			sum+=nameLengths[i];
		}
		System.out.println(sum);
		
	}
	
//7
	public static String series(String word,int n) {
		String words = null;
		for (int i=0; i<n; i++) {
			words+=word;
		}
		return words;
	}
//8
	public static String fullName(String fName, String lName) {
		return fName+" "+lName;
	}
//9
	public static boolean moreThan100(int array[]) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		if(sum>=100) {
			return true;
		}
		else {
			return false;
		}
	}
//10
	public static double average(double array[]) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
//11
	public static boolean average(double array1[], double array2[]) {
		double sum1=0;
		double sum2=0;
		for (int i=0; i<array1.length; i++) {
			sum1+=array1[i];
		}
		for (int i=0; i<array2.length; i++) {
			sum2+=array2[i];
		}
		if(sum1>=sum2) {
			return true;
		}
		else
			return false;
	}
//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside==true && moneyInPocket>=10.50)
			return true;
		else
			return false;
	}
	//13, Divides the pass through number and divide it by each other
	public static double figureitout(double number1, double number2) {
		return number1/number2;
	}
}
