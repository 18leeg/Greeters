import java.util.ArrayList;

public class NewGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Greeter me = new Greeter();
	System.out.println(me.toString());
		
	Greeter[] people = new Greeter[6];
	people[0] = new Greeter(18, "Alena");
	people[1] = new Greeter(17, "Mariam");
	people[2] = new Greeter(18, "Sophia");
	people[3] = new Greeter(18, "Samaaya");
	people[4] = new Greeter(16, "Kat");
	people[5] = new Greeter(17, "Reena");
	for (Greeter x : people)
	{
		System.out.println(x.toString());
	}
	
	}

}
