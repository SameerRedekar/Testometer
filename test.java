package testometerstmjuly22;

public class test {
	public static void main(String[] args) {
	int x = 100, y= 200;
	System.out.println("beefore");
	System.out.println("x="+x);
	System.out.println("y="+y);
	int z = x;
	x=y;
	y= z;
	System.out.println("after");
	System.out.println("x ="+ x);
	System.out.println("y ="+y);	
	
		

}
}