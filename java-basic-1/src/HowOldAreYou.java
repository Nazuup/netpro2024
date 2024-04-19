
// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader というのは、データ読み込みのクラス(型)
		// クラスの変数を作るには、new を使う。

		// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
		// Java では、 try{ XXXXXXXX } catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			while (true) {
				System.out.println("何歳ですか?");
				String line = reader.readLine();
				if(line.equals("q")||line.equals("e")){
					break;
				}
				int age = Integer.parseInt(line);
				if (0 <= age && age < 120) {
					System.out.println("あなたは" + age + "歳ですね。");
					System.out.println("あなたは2030年、" + (age + 2030 - 2024) + "歳ですね。");
					String gengou = "";
					int year = 0;
					if(age<=5){
						gengou = "令和";
						year = 6-age;
					}else if(age<=35){
						gengou = "平成";
						year = (30+6)-age;
					}else if(age<=98){
						gengou = "昭和";
						year = (63+30+6)-age;
					}else if(age<=112){
						gengou = "大正";
						year = (14+63+30+6)-age;
					}else{
						gengou = "明治";
						year = (44+14+63+30+6)-age;
					}
					System.out.println("あなたは"+gengou+year+"年生まれですね。");
				}else{
					System.out.println("入力できる数値は0から119までです。入力しなおしてください。");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}

// 課題 キーボードから数字を打ち込む
// その結果、 あなたは、???歳ですね、と画面に表示させる。
// その後、あなたは10年後、????歳ですね、と画面に表示させる。