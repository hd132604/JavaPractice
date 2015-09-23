/**
 * 
 */
package org.dimigo.exception;

/**
 *<pre>
 *	org.dimigo.exception
 *	   |_AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class AgeCheckException extends Exception{
	public AgeCheckException() {}
	public AgeCheckException(Movie movie){
		super(movie.getTitle() + "은/는 "+movie.getLimitAge()+"이상 관람가 입니다.");
	}
	
}
