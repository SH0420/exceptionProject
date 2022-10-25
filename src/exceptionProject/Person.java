package exceptionProject;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name =name;
		this.age = age;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person another =(Person)obj;
			return this.name.equals(another.name);
			}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return(this.name + age).hashCode(); //"ȫ�浿10".hashcode()
	}
	
	
	
	public String toString() {
		return "Person [name=" + name+ ", age= " + age+ "]";
	}
	
}


