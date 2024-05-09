import java.util.Random;

public class HeikinCKadai {
	public static void main(String[] args) {
		// Randomクラス
		Random random = new Random();
		// Kamokuクラスのインスタンスとして、mathを作る

		Kamoku[] students = new Kamoku[100];
		int sum = 0;
		for(int i = 0; i<students.length; i++){
			students[i] = new Kamoku(random.nextInt(100));
			sum += students[i].getScore();
		}

		int ave = sum / students.length; // 平均点を求める
		System.out.println("平均点は" + ave );
		System.out.println("以下合格者の点数です。");
		for(int i = 0; i<students.length; i++){
			if(students[i].getScore() >= 80){
				System.out.println(students[i].getScore());
			}
		}
	}
}
