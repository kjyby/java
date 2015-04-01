package DAO;

import entity.CGwamok;
import entity.CMember;

public interface iDAO {
	public Object read(String fileName);
	public void write(Object object, String fileName);
	
}
