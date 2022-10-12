package wordtestrecap;

import java.util.ArrayList;

public class WordQuiz {
	
	private String name;
	private ArrayList<Word> w
	
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
			}while(index == answerIndex); // 정답과 같은 index 번호이거나 n배열이 이미 들어있는 값이면 사용불가 판정
				n[i] = index;
			
		}
	}
	
	private boolean exists() {
		
	}
	
	public void run() {
		
	}

	public static void main(String[] args) {
		
	}

}	// main() end
