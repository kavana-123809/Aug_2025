package Lab3Main;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

class Person_3_2 {

	String name;
	int age;
	
	public Person_3_2(String name, int age) throws InvalidAgeException {
		
		if(age<15) {
			throw new InvalidAgeException("Age of a person should be above 15");
		}
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: " + name + "age: " + age);
	}
	
}