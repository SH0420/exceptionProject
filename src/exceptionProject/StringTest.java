package exceptionProject;

public class StringTest {

	public static void main(String[] args) {

		
		//charAt()
		//subString()
		//indexOf()
		//equals()
		//valueOf()
		
		
		
//		String str1 = "abc";
//		String str2 = "abc";
//		str1 = "가나다"
//		
//		str1 = str1  + str2;// "abcdef"
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
		String str3 = new String("abc");
		String str4 = new String("abc");
	
		if(str3.equals(str4)){ // "abc".equals("abc")
		   //문자열
			System.out.println("같은 문자열 이다.");
		}else {
			System.out.println("다른 문자열 이다.");
		}
		
//		int x = 10;
//		String str = String.valueOf(x); //"10"
//		System.out.println(str.charAt(0));
		
		
//		if(str3 == str4) {
//			//주소값비교 문자열은 이렇게비교하면안된다.
//			System.out.println("같은 문자열 이다.");
//		}else {
//			System.out.println("다른 문자열이다.");
//		}
	
//	    String fileName = "HelloWorld.java"; // Hello java
//	    //                 0123456789
//	
//	   int index = fileName.indexOf('.'); // 5
//	   System.out.println(fileName.substring(0,index)); // Hello
//	   System.out.println(fileName.substring(index + 1));
	   
	    
	    
	   //char c = fileName.charAt(0); // 'H'
	   //System.out.println(c);
	   
//	   for(int i=0; i<fileName.length();i++) {
//		   System.out.println(fileName.charAt(i));
//	   }
//	
//	    String str = fileName.substring(0,5);
//	    System.out.println(str);
//	    String str2 = fileName.substring(6,10);
//	    System.out.println(str2);
//	    String str3 = fileName.substring(3);
//	    System.out.println(str3);
	

		StringBuffer sb =new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
	
	
	}
	
	
	


}

