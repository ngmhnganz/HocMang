package Lop1K.com;

import java.util.Scanner;

public class TestMang4 {

	public static void main(String[] args) {
		
	int []M;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		int n=sc.nextInt();
		M= new int[n];
		boolean kt;
		int max=0;
		System.out.println("Nhập giá trị mảng,");
		for (int i=0; i<M.length;i++) {
		do
		{
			kt=false;
			int the=sc.nextInt();
			if (the>max) {
				max = the;
				M[i]=the;
				kt=true;
			}
			else System.out.println("Nhập lại.");
		}
		while(!kt);
		}
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i]+" ");
		}
		
	}

}
