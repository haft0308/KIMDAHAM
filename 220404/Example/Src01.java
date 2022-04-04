
package Example;

public class Src01 {

	/// 정수 세 개를 매개변수로 받아 이들의 합을 반환하는 함수 작성 ///
	
	static int sum(int _a, int _b, int _c)
	{
		int result = _a + _b + _c;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int a = 1,
			b = 2,
			c = 3;
		
		
		int result = sum(a, b, c);
		System.out.println(result);

	}

}
