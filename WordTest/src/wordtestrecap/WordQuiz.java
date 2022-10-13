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
			}while(index == answerIndex || exists(n, index)); // ����� ���� index ��ȣ�̰ų� n�迭�� �̹� ����ִ� ���̸� ���Ұ� ����
				n[i] = index;
			
		}	// for end
		
		for(int i=0; i<n.length; i++) {
			ex[i] = n[i];	// �迭�� ����
		}	// for end
		
		return (int)(Math.random() * n.length);
	}	// makeExample
	
	private boolean exists(int n[], int index) {	// ���Ⱑ �ߺ����� �ʵ��� �ϱ�
		for(int i=0; i<n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}	// exists end
	
	public void run() {		// �۵� ����
		System.out.println("\""+name+"\""+"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� "+w.size()+"���� �ܾ ��� �ֽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int answerIndex = (int)(Math.random() * w.size());	// 0 ~ 16
			String eng = w.get(answerIndex).getEnglish();
			
			int example[] = new int[5];
			
			int answerLoc = makeExample(example, answerIndex);
			example[answerLoc] = answerIndex;	// answerLoc �� -0 ~ 4
			
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
				System.out.println("���ڸ� �Է��ϼ���!");
			}	// try&catch end
		}	// while end
	}	// run end
		
	public static void main(String[] args) {
		WordQuiz wq = new WordQuiz("��ǰ����");
		wq.run();
	} // main() end

}	// WordQuiz end
