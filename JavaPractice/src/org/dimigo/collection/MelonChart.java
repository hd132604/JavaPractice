/**
 * 
 */
package org.dimigo.collection;

import java.util.LinkedList;
import java.util.List;

/**
 *<pre>
 *	org.dimigo.collection
 *	   |_MelonChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 *</pre>
 * 
 * @author		: 김영남
 * @version		: 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> list=new LinkedList();
		list.add(new Music("바람이나 좀 쐐","개리"));
		list.add(new Music("보통연애","박경"));
		list.add(new Music("취향저격","iKon"));
		System.out.println("-- << 멜론 차트 >> --");
        printList(list);
        System.out.println("-- << 2위 곡 추가 >> --");
        list.add(new Music("레옹", "이유갓지"));
        printList(list);
        System.out.println("-- << 3위 곡 변경 >> --");
        list.get(2).setTitle("맙소사");
        list.get(2).setSinger("황태지");
        printList(list);
        System.out.println("-- << 4위 곡 삭제 >> --");
        list.remove(3);
        printList(list);
        System.out.println("-- << 전체 리스트 삭제 >> --");
        list.clear();
        printList(list);
	}
	public static void printList(List<Music> list){
		int count=1;
        for (Music music : list)
        {
           System.out.println(""+count+++". "+music.toString());
        }
	}

}
