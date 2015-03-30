package DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;

public class CGangjwaDAO {

	public CGangjwa read() { return null; }
	
	public void write(CGangjwa gangjwa) {
		System.out.println("°­ÁÂID : " + gangjwa.getGwamokID());
		System.out.println("°­ÁÂ¸í : " + gangjwa.getGyosuID());
		//serialize
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	};
}
