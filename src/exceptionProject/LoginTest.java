package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("id 입력 :");
		id = sc.next();
		System.out.println("password 입력 :");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { //문자열 비교 시 equals()를 쓴다 // == , != 
			//예외처리
			//아이디가 불일치 합니다.
		try {
		    throw new LoginIdException("아이디가 불일치 합니다.");	
		}catch(LoginIdException e) {
			System.out.println("아이디를 다시 입력하세요");
			}
		}
		
		if(password != 1234) {
			//예외처리
			//비번이 불일치 합니다.
		try {
			throw new LoginIPwException("비번이 불일치 합니다.");
		}catch(LoginIPwException e) {
				System.out.println("비번을 다시 입력하세요");
			}
		}
		if(id.equals("tis") && password == 1234) {
			System.out.println("로그인 성공");
		}

	}

}
