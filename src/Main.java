public class Main {
	
	public static int input;
	public static String name;
	
	public static void main(String[]args) {
		Scan sc = new Scan();
		game_1 g1 = new game_1();
		game_2 g2 = new game_2();
		System.out.println("����� �̸��� �Է��ϼ���");
		name = sc.Scan(name);//�̸� �Է�
		
		
		for(;true;) {//���ѹݺ�
			System.out.println("�ϰ���� ������ �Է��ϼ���");
			System.out.println("1. ù��° ����, 2. ������");
			
			input = sc.Scan(input);//�����Է�
			
			if(input == 1) {//1�� �ԷµǾ�����
				g1.game_1(name);//���� 1 ����
				
			}//if end
			
			else if(input == 2) {
				g2.game_2(name);//���� 2 ����
			}//else if end
			
			System.out.println("�ٽ��ϰڽ��ϱ�?");
			System.out.println("1. ��  2. �ƴϿ�");
			
			input = sc.Scan(input);
			
			if (input == 1)
				continue;
			
			if (input == 2)
				break;
			
		}//if end
		
	}//main end
	
}//Main class end
