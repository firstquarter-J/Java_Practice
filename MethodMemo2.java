
public class MethodMemo2 {
									// parameter - 매개변수
	public static void numbering(int limit) {
		int i = 0;
		while ( i < limit ) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
				// argument - 인자
		numbering(5);

	}

}