package ch05.sec11;
/* 
* 날짜 : 2023/06/15
* 이름 : 정채윤
* 내용 : 교재 p.192
* 
* 
* 프로그램 실행하는 법 
* : Run-Run Configuration의 MainStringArrayArgument의 Argument탭, Program arguments 에서 10 20 입력 
* : 터미널 bin 폴더에서 java ch05.sec11.MainStringArrayArgument 10 20 입
*/
public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램 입력감이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
