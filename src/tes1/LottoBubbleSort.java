package tes1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LottoBubbleSort {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //int n[0],n[1],n[2],n[3],n[4],n[5];
      int []n=new int[6];
      // 게임수랑 돈 입력
      int money=0,game=0;
      Scanner sc=new Scanner(System.in);
      do {
         try {
            System.out.print("금액 입력>>");
            money=sc.nextInt();
            System.out.print("게임수 입력>>");
            game= Integer.parseInt(sc.nextLine());
         }catch(Exception e) {
            System.out.println("문자 입력 오류!!");
            sc.nextLine();//입력버퍼에 있는 문자열을 읽어서 비운다
            continue;            
         }         
         if(game<1 || money<game*1000) {
            System.out.println("입력 오류!! 게임수나 금액에 오류가 있습니다.");
            continue;
         }
         break;//금액과 게임수가 정상이면 반복문 탈출
      }while(true);
      sc.close();
      //게임수가 결정되면 
      for(int i=1;i<=game;i++) {
         n[0]=(int)(Math.random()*45)+1;   
         do {
            n[1]=(int)(Math.random()*45)+1;
         }while(n[1]==n[0]);//참일동안 반복, 거짓 탈출    // n[1]==n[0]과 같을 동안 반복
         do {
            n[2]=(int)(Math.random()*45)+1;
         }while(n[2]==n[0]||n[2]==n[1]);// n[2]==n[0] 같거나 n[1]와 같을 동안 반복
         do {
            n[3]=(int)(Math.random()*45)+1;
         }while(n[3]==n[0]||n[3]==n[1]||n[3]==n[2]);      
         do {
            n[4]=(int)(Math.random()*45)+1;
         }while(n[4]==n[0]||n[4]==n[1]||n[4]==n[2]||n[4]==n[3]);      
         do {
            n[5]=(int)(Math.random()*45)+1;
         }while(n[5]==n[0]||n[5]==n[1]||n[5]==n[2]||n[5]==n[3]||n[5]==n[4]);            
         //System.out.println("로또 번호"+i+" : "+n[0]+","+n[1]+","+n[2]+","+
         //      n[3]+","+n[4]+","+n[5]);
         //aryPrint("로또 번호"+i+" : ",bubbleSort(n));
         Arrays.sort(n);
         aryPrint("로또 번호"+i+" : ",n);
      }
      System.out.println("잔액 : "+(money-game*1000)+"원");
   }//main
   public static int[] bubbleSort(int [] ary) {
      int temp;
      boolean sw;
      for(int k=1;k<ary.length;k++) {
         sw=true;//반복문 전 초기치 부여
         for(int i=0;i<ary.length-k;i++) {
            if(ary[i] > ary[i+1]) {//교환
               temp=ary[i];ary[i]=ary[i+1];ary[i+1]=temp;
               sw=false;//바뀜 발생
            }
         }//end for i   
         if(sw)break;
      }//end for k   
      return ary;
   }//bubbleSort
   public static void aryPrint(String title,int []ary) {
      System.out.print(title);
      for(int i=0;i<ary.length;i++) {
         System.out.print(ary[i]);
         if(i<ary.length-1)
            System.out.print(",");
      }
      System.out.println();//줄바꿈
   }//aryPrint

}//class