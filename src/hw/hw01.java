package hw;
/*
 * Topic: �г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡(type ��1 �� �ؤ�->���Atype��2�����->�ؤ�)�A
 *        ��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C(F=C*9/5+32), (C = (F-32) * (5/9)�A�Ҧp��J100 1 �h��X 37.77778; 
 *        ��J 37.77778 2 �ɫh��X 100.0
 * Date: 2016/10/31
 * Author: 105021043 �B�ͤ�
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(fun(scn.nextFloat(),scn.nextInt()));}
	public static float fun(float v1,int type){
		float FC =0;
		if(type==1){
			FC=(v1-32)*5/9;}
		else if(type==2){
			FC=v1*9/5+32;}
		return FC;}}
