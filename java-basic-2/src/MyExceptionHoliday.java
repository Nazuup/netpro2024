import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyExceptionHoliday {

	static List<String> holiday;

	public static void main(String[] args) {

		MyExceptionHoliday myE = new MyExceptionHoliday();
		holiday = new ArrayList<String>();

		holiday.add("3");
		holiday.add("4");
		holiday.add("5");
		holiday.add("6");
		holiday.add("11");
		holiday.add("12");
		holiday.add("18");
		holiday.add("19");
		holiday.add("25");
		holiday.add("26");

		try {
			myE.test();
		} catch (NoHolidayException e) {
			e.printStackTrace();
		}

	}

	void test() throws NoHolidayException{ //throws MyExceptionが大事
		String str = "";
		Scanner scan = new Scanner(System.in);;
		while(!str.equals("q")){
			System.out.println("5月の日付を入力してください。(qを入力すると終了)");
			str = scan.next();
			if(!holiday.contains(str)){
				throw new NoHolidayException();
			}
		}
		scan.close();
	}

}
