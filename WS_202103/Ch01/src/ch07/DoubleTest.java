package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double num = 3.14;
		// 3.14라는 리터럴에 대해서 float로 핸들링해라는 의미를 위해 뒤에 f삽입
		float fnum = 3.14f;
		
		
		double dnum = 1;
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}
