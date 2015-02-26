package MainPackage;

public class MyInteger {
	private int value;

	public MyInteger(int value){
		this.value = value;
	}
	
	public int getMyInteger(){
		return this.value;
	}
	
	public boolean isEven(){
		return true;
	}
	public boolean isOdd(){
		return true;
	}
	public boolean isPrime(){
		return true;
	}
	
	public static boolean isEven(int value){
		return true;
	}
	public static boolean isOdd(int value){
		return true;
	}
	public static boolean isPrime(int value){
		return true;
	}
	
	public static boolean isEven(MyInteger value){
		return true;
	}
	public static boolean isOdd(MyInteger value){
		return true;
	}
	public static boolean isPrime(MyInteger value){
		return true;
	}
}
