/**
 * 
 */
package org.dimigo.thread;

/**
 *<pre>
 *	org.dimigo.thread
 *	   |_Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class Runner extends Thread {
	private String name;
	
	public Runner(){}

	public Runner(String name) {
		this.name = name;
	}
	public void run(){
		int meter=100;
		System.out.println(name+" 출발");
		try{
			for(int i=10;i>0;i--){
				Thread.sleep(1000);
				System.out.println(name+" "+meter+"미터");
				meter-=10;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(name+"골인");
		
	}

}
