
public class Abstraction {
	
	public static void main(String[] args){
		
		//creating an instance for abstract class - which is wrong
		//issue will get as cannot instantiate the type person and we have commented
		
		//Person objPerson = new Person();
		
		Person objPerson = new Employee();
		
		objPerson.setName("Saikumar Jalda");
		
		System.out.println("Employee Name is : "+objPerson.getName());
		
	}

}




