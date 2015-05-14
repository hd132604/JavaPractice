/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *	org.dimigo.oop
 *	   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("가장 좋아하는 가수는?");
		String answer=scanner.nextLine();
		if(answer.equals("Maroon5")){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		System.out.println();
		System.out.println("가장 좋아하는 배우는?");
		answer=scanner.nextLine();
		if(answer.equals("맷 스미스")){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		System.out.println();
		System.out.println("가장 좋아하는 과목은?");
		answer=scanner.nextLine();
		if(answer.equals("미적분")){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		
		

	}

}
