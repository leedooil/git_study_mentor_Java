package day07;

import java.util.Scanner;

public class If_else_if {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("����:");
		age=sc.nextInt();
		
		if(age>19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		else if(age>13) {
			System.out.println("û�ҳ� �Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		else if(age>8) {
			System.out.println("��� �Դϴ�.");
			System.out.println("��� ����� ����˴ϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		System.out.println("������ ������ �ּ���.");
		
		
		
	}

}