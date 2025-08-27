public class Hello {
	public static void main (String[] args) {
		int count = new java.util.Random().nextInt(10000);
		System.out.println("Hello! You are the " + (count + 1) + "th person!");
	}	
}
