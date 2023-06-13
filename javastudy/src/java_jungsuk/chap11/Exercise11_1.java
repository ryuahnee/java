package java_jungsuk.chap11;

import java.util.*;

public class Exercise11_1 {

	public static void main(String[] args) {
//		다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이다.
//		코드를 완성하여 실행결과와 같은 결과를 출력하시오.

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		for(int i = 0; i < list1.size(); i++) {
			if(list2.contains(list1.get(i))) {
				kyo.add(list1.get(i));
			}else {
				cha.add(list1.get(i));
			}
		}
		
		hap.addAll(list1);
		
		for(int i = 0; i < list2.size(); i++) {
				if(!hap.contains(list2.get(i))) {
					hap.add(list2.get(i));
				}
			}
				
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}
