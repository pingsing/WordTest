package wordtestrecap;

import java.util.ArrayList;

public class WordQuiz {
	
	private String name;
	private ArrayList<Word> w
	
	public WordQuiz(String name) {
		super();
		this.name = name;
		
		w = new ArrayList<Word>();
		w.add(new Word("love", "���"));
		w.add(new Word("animal", "����"));
		w.add(new Word("emotion", "����"));
		w.add(new Word("pencil", "����"));
		w.add(new Word("furniture", "����"));
		w.add(new Word("despair", "����"));
		w.add(new Word("Human", "�ΰ�"));
		w.add(new Word("baby", "�Ʊ�"));
		w.add(new Word("bear", "��"));
		w.add(new Word("fish", "�����"));
		w.add(new Word("president", "�����"));
		w.add(new Word("society", "��ȸ"));
		w.add(new Word("apple", "���"));
		w.add(new Word("volunteer", "����"));
		w.add(new Word("home", "��"));
		w.add(new Word("language", "���"));
		w.add(new Word("account", "����"));
	}	// constructor end
	
	private int makeExample(int ex[], int answerIndex) {		// ���� ��� �޼ҵ�
		int n[] = {-1, -1, -1, -1, -1};		// ���� ����� ���� index ��ȣ�� Ȱ��
		int index;
		for(int i=0; i<n.length; i++) {
			do {
				index = (int)(Math.random() * w.size());	// 0 ~ 16
			}while(index == answerIndex); // ����� ���� index ��ȣ�̰ų� n�迭�� �̹� ����ִ� ���̸� ���Ұ� ����
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
