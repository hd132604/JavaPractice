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
public class Runner2 implements Runnable {
	private String name;
	
	public Runner2(){}

	public Runner2(String name) {
		this.name = name;
	}
	public void run(){
		System.out.println(name+" 출발");
		try{
			for(int i=10;i>=0;i--){
				Thread.sleep(1000);
				System.out.println(name+" "+(i*10)+"미터");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(name+"골인");
		
	}

}
