package static_nonstatic;

public class StaticNonStatic {

	//constructor block
	public StaticNonStatic(){
		System.out.println("hello from constructor");
	}
	
	//non static block: when ever we create object it will be called.
	{
		System.out.println("hello from  non static block");
	}
	{
		System.out.println("hello from  non static block 2");
	}
	
	//static-prerequistics
		/*block- small set of instructions.JDK give frist prefrence to block 
		 because it is small*/
	static {
		System.out.println("hello from static block");
	}
	static {
		System.out.println("hello from static block 2" );
	}
	
	//method-set of instructions
	//with out main method above static block will not work.
	public static void main(String[]args) {
	
		System.out.println("hello from main(static)method");
		
		//when obj is create non static block will called
		StaticNonStatic obj1=new StaticNonStatic();
		StaticNonStatic obj2=new StaticNonStatic();
		//call test method usins class name
		StaticNonStatic.test();
	}
	
	public static void test() {
		System.out.println("hello from test");
	}

}
