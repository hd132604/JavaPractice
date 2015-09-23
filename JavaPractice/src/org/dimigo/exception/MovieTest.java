/**
 * 
 */
package org.dimigo.exception;

/**
 *<pre>
 *	org.dimigo.exception
 *	   |_MovieTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Movie[] movies={
					new Movie("앤트맨",12),new Movie("사도",12),new Movie("베테랑",15)
			};
			int age=13;
			for(Movie movie:movies){
				buyTicket(movie,age);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	public static void buyTicket(Movie movie,int age) throws Exception{
			if(age<movie.getLimitAge()){
				throw new AgeCheckException(movie);
			}else {
				System.out.println(movie.getTitle()+"즐겁게 관람하세요.");
			}
	}

}
