package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("id �Է� :");
		id = sc.next();
		System.out.println("password �Է� :");
		password = sc.nextInt();
		
		if(!id.equals("tis")) { //���ڿ� �� �� equals()�� ���� // == , != 
			//����ó��
			//���̵� ����ġ �մϴ�.
		try {
		    throw new LoginIdException("���̵� ����ġ �մϴ�.");	
		}catch(LoginIdException e) {
			System.out.println("���̵� �ٽ� �Է��ϼ���");
			}
		}
		
		if(password != 1234) {
			//����ó��
			//����� ����ġ �մϴ�.
		try {
			throw new LoginIPwException("����� ����ġ �մϴ�.");
		}catch(LoginIPwException e) {
				System.out.println("����� �ٽ� �Է��ϼ���");
			}
		}
		if(id.equals("tis") && password == 1234) {
			System.out.println("�α��� ����");
		}

	}

}
