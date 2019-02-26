package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<String,Object> cat = new HashMap<>();		// Flexible 함
		// List를 이용하여 고양이 10마리 이름은 냥이1~10 나이는 0~9
		List<HashMap<String,Object>> catList = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			cat = new HashMap<>();
			cat.put("이름","냥이"+(i+1));
			cat.put("나이",(int)(Math.random()*10)+1);
			catList.add(cat);
		}
		
		for(int i=0; i<catList.size(); i++) {
			System.out.println(catList.get(i));
		}
	}
}
