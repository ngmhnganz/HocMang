package Lop1K.com;

import java.util.Scanner;

public class HocMang {

	public static void main(String[] args) {
		int[]M;
		M= new int[5];
		int dl = Integer.BYTES*5;
		System.out.println("M chiếm : "+dl+" byte(s)");
		System.out.println("Nhập: ");
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<M.length;i++) {
			M[i]=scanner.nextInt();
		}
		for (int j = 0; j < M.length; j++) {
			System.out.print(M[j]+" ");
		}
		
	}
}
