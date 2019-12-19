package Lop1K.com;

import java.util.Random;
import java.util.Scanner;

public class TestMang {

	static int timTuyenTinh(int []M, int x) 
	{
		for (int i=1; i<M.length;i++) {
			if (M[i]==x) return i;
		}
		return -1;
	}
	static void nhapMang(int []M) {
		Random rd = new Random();
		for (int i=0;i<M.length;i++) 
		{
			M[i]=rd.nextInt(100);
		}
	}
	static void xuatMang(int []M) {
		for (int i = 0; i < M.length; i++) 
		{
			System.out.print(M[i] +" ");
		}
	}
	public static void main(String[] args)
	{
		for (;;) 
		{
		System.out.print("Bạn muốn cấp bao nhiêu phần tử: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int M[];
		M= new int[n];
		nhapMang(M);
		System.out.println("Mảng ngẫu nhiên sau khi nhập.");
		xuatMang(M);
		System.out.println();
		System.out.println("Muốn tìm gì.");
		int k =sc.nextInt();
		int kq=timTuyenTinh(M,k);
		if (kq==-1) System.out.println("Không thấy k.");
		else System.out.println("Thấy k tại vị trí "+kq);
		}
	}
}