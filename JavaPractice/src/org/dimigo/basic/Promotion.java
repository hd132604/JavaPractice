package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int sal = 1700000;
		int h = 3;
		int m = 1500;
		long y = 0;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d",sal)+"원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d",h)+"명");
		System.out.println("점포 수 : " + String.format("%,d",m)+"개");
		y =(long)sal*h*m*12;
		System.out.println("연간 인건비 : " + String.format("%,d", y)+"원");

	}

}
