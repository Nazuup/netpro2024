import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calc2ScannerFile {

	public static void main(String args[]){
		try{
			File file = new File("C:\\Users\\yasuda_aimi\\Documents\\netpro2024\\java-basic-2\\src\\targetfile.txt");
			Scanner scan = new Scanner(file);
			scan.useDelimiter("¥¥r¥¥n");

            int number = 0;

			while(scan.hasNext()){
				number += Integer.parseInt(scan.next());
			}
            System.out.println(number);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}

//  課題    ファイルから読み込むキーボードから2つの数字を打ち込む
//     その足し算結果を、出力する。
