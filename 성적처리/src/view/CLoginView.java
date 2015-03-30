package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	Scanner scan = new Scanner(System.in);
	private CMember member = new CMember();
	
	public CMember login(){
		System.out.print("ID : ");
		member.setUserID(scan.nextLine());
		System.out.print("Password : ");
		member.setPassword(scan.nextLine());
		return member;//로그인 입력받아서
	}

}
