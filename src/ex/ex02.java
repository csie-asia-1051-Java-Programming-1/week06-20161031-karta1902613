package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int m =scn.nextInt();
	     int n =scn.nextInt();
	     int x=0;
	       fun1(m,n);
	 System.out.println(fun1(m,n));}

	public static int fun1(int m, int n){
				int summ =1;	
				int sumn =1;
				int summn=1;
				int mn=m-n;
				  for(int i=m;m>0;m--){
					summ*=m;}
				  for(int i=n;n>0;n--){
					sumn*=n;}
				  for(int i=mn;mn>0;mn--){
					summn*=mn;}
				int ans=summ/(sumn*summn);
				  return ans;}}

