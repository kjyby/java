package DAO;

import java.lang.reflect.Field;

public class TextDAO implements iDAO{

	@Override
	public Object read(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(Object object, String fileName) {
		// TODO Auto-generated method stub
		Field[] fileds = object.getClass().getDeclaredFields();
	}

}
