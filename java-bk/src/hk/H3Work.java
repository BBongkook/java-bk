package hk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H3Work {
	// SearchList3
	// 나올수 있는 랜덤 숫자는 0-9
	// 맞춰야하는 숫자는 4개
	// 2019-02-25
	
	public static void main(String[] args) {
	
		List<Integer> numsList = new ArrayList<>();
		
		int num;
		int sCnt=0,bCnt=0;
		for(int i=0; i<4; i++) {
			num=(int)(Math.random()*9)+1;
			if(numsList.indexOf(num)!=-1) {
				i--;
			} else {
				numsList.add(num);
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println(numsList);
		System.out.println(", 기준으로 숫자 4개를 입력하세요");

		
		while(sCnt!=4) {
		String strs= scan.nextLine();
		String[] strsArray = strs.split(",");
		
		List<Integer> strsList = new ArrayList<>();
		
		for(int i=0; i<numsList.size(); i++) {
			strsList.add(Integer.parseInt(strsArray[i]));
		}
		
		sCnt=0;
		bCnt=0;
		
		for(int i=0; i<numsList.size(); i++) {
			if(numsList.indexOf(strsList.get(i))!=-1){
				if(numsList.get(i)==strsList.get(i)) {
					sCnt++;
				} else {
					bCnt++;
				}
			}
		}
		System.out.println(sCnt+"S"+bCnt+"B");
		}
	}
	
}