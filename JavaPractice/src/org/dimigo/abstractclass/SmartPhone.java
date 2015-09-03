/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 *	org.dimigo.inheritance
 *	   |_SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	public SmartPhone(){
	}
	public SmartPhone(String model,String company,int price){
		this.model=model;
		this.company=company;
		this.price=price;
	}
	public void turnOn(){
		if(this instanceof IPhone){
			IPhone I=(IPhone)this;
			System.out.println(model+"의 전원을 켭니다.");
		}
		else if(this instanceof Galaxy){
			Galaxy G=(Galaxy)this;
			System.out.println(model+"의 전원을 켭니다.");
		}
	}
	public void turnOff(){
		if(this instanceof IPhone){
			IPhone I=(IPhone)this;
			System.out.println(model+"의 전원을 끕니다.");
		}
		else if(this instanceof Galaxy){
			Galaxy G=(Galaxy)this;
			System.out.println(model+"의 전원을 끕니다.");
		}
	}
	
	public abstract void pay();
	public void useSpecialFunction(SmartPhone phone){
		if(this instanceof IPhone){
			IPhone I=(IPhone)this;
			I.useAirDrop();
		}
		else if(this instanceof Galaxy){
			Galaxy G=(Galaxy)this;
			G.useWirelessCharging();
		}
	}
	public String toString(){
		return "모델명: "+model+", 제조사: "+company+", 가격: "+String.format("%,d",price)+"원";
	}

}
