package MainPackage;

public class MyInteger {
	private int value;
	
    // Constructor
	public MyInteger(int value){
		this.value = value;
	}
	
	// Getter
	public int getMyInteger(){
		return this.value;
	}
	
	// Even, Odd, Prime() Methods
	public boolean isEven(){
      return (value % 2) == 0;
	}
	public boolean isOdd(){
		return (value % 2) != 0;
	}
	public boolean isPrime(){
		for(int i = 2; 2 * i < value; i++){
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	// Even, Odd, Prime(int) Methods
	public static boolean isEven(int value){
		return (value % 2) == 0;
	}
	public static boolean isOdd(int value){
		return (value % 2) != 0;
	}
	public static boolean isPrime(int value){
		for(int i = 2; 2 * i < value; i++){
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	// Even, Odd, Prime(MyInteger) Methods
	public static boolean isEven(MyInteger value){
		return MyInteger.isEven(value);
	}
	public static boolean isOdd(MyInteger value){
		return MyInteger.isOdd(value);
	}
	public static boolean isPrime(MyInteger value){
		return MyInteger.isPrime(value);
	}
	
	// equals(int), equals(MyInteger) Methods
	public boolean equals(int value){
		return this.value == value;
	}
	public boolean equals(MyInteger value){
		return equals(getMyInteger());
	}
	
	// parseInt(char[]), parseInt(String) Methods
	public static int parseInt(char[] Array){
		int number = Integer.parseInt(new String(Array));
		return number;
	}
	public static int parseInt(String aString){
		int number = Integer.parseInt(aString);
		return number;
	}
}
