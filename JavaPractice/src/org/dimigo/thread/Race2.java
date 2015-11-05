/**
 * 
 */
package org.dimigo.thread;

/**
 *<pre>
 *	org.dimigo.thread
 *	   |_Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread t1=new Thread(new Runner2("희룡"));
		Thread t2=new Thread(new Runner2("성민"));
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("main thread end");

	}

}
