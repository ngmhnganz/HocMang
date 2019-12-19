package Lop1K.com;

public class testMang2 {
	public static void main(String[] args)
 {
		int []M1= {1,2,3};
		int []M2= {4,5,6};
		// một ô nhớ có 2 đối tượng tham gia quản lý là Alias
		M1=M2;
		for (int i=0;i<M1.length;i++) {
			M1[i]++;
		}
		for (int i = 0; i < M1.length; i++) {
			System.out.print(M1[i]);
		}
		for (int i = 0; i < M2.length; i++) {
			System.out.print(M2[i]);
			
		}
	}
}
