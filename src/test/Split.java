package test;
public class Split{
	public static void main(String[] args){
	
	String str = "\t\t2020.4.4";

	System.out.println("정답1");
	System.out.printf("날짜 : %s\n", str.trim().replace(".","-"));
	//2020-4-4

	System.out.println("정답2");
	String str2 = str.trim();
	
	str2 = str2.replace(".","-");
	System.out.printf("날짜: %s\n", str2);


	System.out.println("정답3");
	System.out.printf("날짜: %s-%02d-%02d\n","2020", 4, 4);

	System.out.println("정답4");
	String[] strs = str.trim().split("\\.");
	
	int year = Integer.parseInt(strs[0]);
	int month = Integer.parseInt(strs[1]);
	int day = Integer.parseInt(strs[2]);
	
	System.out.printf("날짜 : %04d-%02d-%02d\n", year, month, day);
	

	
}

}