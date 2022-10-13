package wordtestrecap;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordQuiz {
	
	private String name;
	private ArrayList<Word> w;
	
	public WordQuiz(String name) {
		
		super();
		this.name = name;
		
		w = new ArrayList<Word>();
		w.add(new Word("love", "사랑"));
		w.add(new Word("animal", "동물"));
		w.add(new Word("emotion", "감정"));
		w.add(new Word("pencil", "연필"));
		w.add(new Word("furniture", "가구"));
		w.add(new Word("despair", "절망"));
		w.add(new Word("Human", "인간"));
		w.add(new Word("baby", "아기"));
		w.add(new Word("bear", "곰"));
		w.add(new Word("fish", "물고기"));
		w.add(new Word("president", "대통령"));
		w.add(new Word("society", "사회"));
		w.add(new Word("apple", "사과"));
		w.add(new Word("volunteer", "봉사"));
		w.add(new Word("home", "집"));
		w.add(new Word("language", "언어"));
		w.add(new Word("account", "계좌"));
	}	// constructor end
	
	private int makeExample(int ex[], int answerIndex) {		// 보기 출력 메소드
		int n[] = {-1, -1, -1, -1, -1};		// 보기 출력을 위한 index 번호로 활용
		int index;
		for(int i=0; i<n.length; i++) {
			do {
				index = (int)(Math.random() * w.size());	// 0 ~ 16
			}while(index == answerIndex || exists(n, index)); // 정답과 같은 index 번호이거나 n배열이 이미 들어있는 값이면 사용불가 판정
				n[i] = index;
			
		}	// for end
		
		for(int i=0; i<n.length; i++) {
			ex[i] = n[i];	// 배열의 복사
		}	// for end
		
		return (int)(Math.random() * n.length);
	}	// makeExample
	
	private boolean exists(int n[], int index) {	// 보기가 중복되지 않도록 하기
		for(int i=0; i<n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}	// exists end
	
	public void run() {		// 작동 구문
		System.out.println("\""+name+"\""+"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 "+w.size()+"개의 단어가 들어 있습니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int answerIndex = (int)(Math.random() * w.size());	// 0 ~ 16
			String eng = w.get(answerIndex).getEnglish();
			
			int example[] = new int[5];
			
			int answerLoc = makeExample(example, answerIndex);
			example[answerLoc] = answerIndex;	// answerLoc → -0 ~ 4
			
			System.out.println(eng+"?");
			for(int i=0; i<example.length; i++) {
				System.out.print("("+(i+1)+")"+w.get(example[i]).getKorean()+" ");
			}	// for end
			
			System.out.print(":>");
			
			try {
				int in = sc.nextInt();
				if(in == -1) {
					break;
				}
				in--;
				if(in == answerLoc) {
					System.out.println("Excellent!!");
					System.out.println("==============================");
				}else {
					System.out.println("No. !!");
					System.out.println("==============================");
				}
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자를 입력하세요!");
			}	// try&catch end
		}	// while end
	}	// run end
		
	public static void main(String[] args) {
		WordQuiz wq = new WordQuiz("명품영어");
		wq.run();
	} // main() end

}	// WordQuiz end
