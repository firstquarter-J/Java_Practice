
public class MethodMemo6 {
									// parameter - �Ű�����
	public static String numbering(int init, int limit) {
		int i = init;
		// ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
		String output = "";
		while ( i < limit ) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output �� ��Ҵ�.
			output += i;
			// += -> output = output+i;
			i++;
		}
		// output �� ����ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return
		return output;
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� ������ ���� ���� result�� ����.
		String result = numbering(1, 5);
		// ���� result�� ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);

	}

}