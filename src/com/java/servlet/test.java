package com.java.servlet;

import java.util.regex.Pattern;

public class test {
	 public static boolean regularID(String id) { //공백제거 String id1 =
			/*
			 * Pattern.compile("\\s").matcher(id).replaceAll(""); String id2 =
			 * id1.replaceAll(" ", "");
			 */
			if (Pattern.matches("^[a-zA-z0-9]{6,15}$", id)) {
				return true;

			} else {
				return false;
			}
		}
	 public static boolean regularPhone(String phone) {
			if (Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone)) {
				return true;

			} else {
				return false;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String pattern = "^[가-힣]{2,4}$"; //한글
		//String pattern = "^[a-zA-z0-9]{6,15}$";//아이디
		//String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,15}$"; 비밀번호
		//String pattern = "^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$";
		String id = "01088149999";
		if(true ==test.regularPhone(id)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		 
		
		
		
		//boolean regex = Pattern.matches(pattern, val);
		//System.out.println(regex);

	}

}
