package exceptionProject;

public class ObjectTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ?浿",10); 
		Person p2 = new Person("ȫ?浿",10);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if(p1.equals(p2)) { //"ȫ?浿" == "ȫ?浿" && 10 == 10
			System.out.println("???? ????");
		}else {
			System.out.println("?ٸ? ????");
		}
	}


	}


