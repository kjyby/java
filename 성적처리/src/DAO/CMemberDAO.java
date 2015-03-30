package DAO;

import entity.CMember;



public class CMemberDAO {
	
	public CMember read() { return null; }
	public void write(CMember member){
		System.out.println("ID : " + member.getUserID());
		System.out.println("password : " + member.getPassword());
	}; // printout

}
