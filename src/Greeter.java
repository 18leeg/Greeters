
public class Greeter {
	
	private int age;
	private String name;
	
	public Greeter(){
		age = 18;
		name = "Gene";
	}
	
	public Greeter(int a, String n){
		age = a;
		name = n;
	}
	
	public String toString(){
		return "Greeter: age="+age+", name="+name;
	}

}
