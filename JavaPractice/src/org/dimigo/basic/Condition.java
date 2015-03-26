package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int ctype=1;//1버스,2경차
		int dis=14;
		int mo=0;
		String car="";
		if(dis<0)System.out.println("잘못 했네");
		System.out.println("<<고속도로 통행료 계산>>");
		switch(ctype){
		case 1:
			mo=850;
			car="고속버스";
			break;
		case 2:
			mo=300;
			car="경차";
			break;
		default:
			mo=600;
			car="그 외";
			
		}
		if(ctype==1)mo=mo+300*(dis/10);
		else if(!(ctype==1))mo=mo+200*(dis/10);
		System.out.println("거리 : "+dis+"km");
		System.out.println("차종 : "+car);
		System.out.println("통행료 : "+mo+"원");
		

	}

}
