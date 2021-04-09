
public class MethodMemo1 {
	
	public static void numbering() {
		int i = 0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		
		numbering(); // 메소드 = 재활용, 코드량 감소, 유지보수 유리
//		numbering();
//		numbering();
//		numbering();
//		numbering();

	}

}