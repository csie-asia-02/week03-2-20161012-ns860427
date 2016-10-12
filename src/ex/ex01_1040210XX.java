package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

import java.util.Scanner;

public class ex01_1040210XX {

	private static Scanner scanner;

	public static void main(String[] args) {
		for (int a=1 ; a>0 ; a++){
		scanner = new Scanner(System.in); 
		System.out.print("請輸入數字:"); 
		String input = scanner.nextLine(); 
		while(!input.matches("[0-9]*")){ 
		System.out.printf("你輸入的%s不是數字，",input); 
		System.out.print("請重新輸入數字:"); 
		input = scanner.nextLine(); 
		} 
		int sum = 0; 
		char[] ch_array = input.toCharArray();
		for(int i=0;i<ch_array.length;i++){ 
		int c = ch_array[i]-'0'; 
		sum+=c;
		} 
		System.out.println(sum); 
		}
	}
	}
