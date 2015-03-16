package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean flag = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char ch = 'A';
		System.out.println("<< 아이유 프로필>>");
		if(flag){
			System.out.print("이름 : "+name+"\n"+"성별 : 여자\n"+"나이 : "+age+"\n"+"키 : "+height+"cm"+"\n"+"몸무게 : "+weight+"kg"+"\n"+"혈액형 : "+ch+"\n");
		}else {
			System.out.print("이름 : "+name+"\n"+"성별 : 남자\n"+"나이 : "+age+"\n"+"키 : "+height+"cm"+"\n"+"몸무게 : "+weight+"kg"+"\n"+"혈액형 : "+ch+"\n");
		}
		

	}

}
