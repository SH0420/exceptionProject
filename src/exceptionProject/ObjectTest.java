package exceptionProject;

public class ObjectTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("È«±æµ¿",10); 
		Person p2 = new Person("È«±æµ¿",10);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if(p1.equals(p2)) { //"È«±æµ¿" == "È«±æµ¿" && 10 == 10
			System.out.println("°°Àº »ç¶÷");
		}else {
			System.out.println("´Ù¸¥ »ç¶÷");
		}
	}


	}


