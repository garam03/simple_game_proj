public class game_1 {
	private static int HP = 10;//���� HP
	private static int MAXHP = 10;//�ִ� HP
	private static int LEVEL = 1;//���� LEVEL
	private static int EXP = 1;//���� EXP
	private static int MAXEXP = 10;//�ִ� EXP
	private static int DAMEGE = 1;//���ݷ�
	
	private static int ENEMYlev = 1;//�� LEVEL
	private static int ENEMYhp = 10;//�� HP
	private static int ENEMYmaxhp = 10;//�� �ִ�HP
	private static int ENEMYdam = 1;//�� ���ݷ�
	
	public static int not = 0, not2 = 0, not3 = 0;//Ŭ�������� �Լ��� �����ϱ� ���� ���ڰ�
	
	public static void game_1(String name) {
		Scan sc = new Scan();
		LevelUp lvu = new LevelUp();

		System.out.println(name);//output name
	    System.out.println("*********************************************************");//output *line
	    System.out.println("1. ����  2. �޽�  3. ����  4. ���ӳ�����");//output 1. ����  2. �޽�  3. ����
	    
	    for(int input = 0, hide = 0 ;HP > 0 ;) {//input(�Է��� ����), hide(���Ż��� Ȯ��)
	    	System.out.println("��hp : " + ENEMYhp);
	        System.out.println("hp : " + HP + "/" + MAXHP);//output hp/maxhp
	        System.out.println("level : " + LEVEL + "     " + "exp : " + EXP + "/" + MAXEXP);//output "level : " LEVEL "     exp : " EXP/MAXEXP
	        input = sc.Scan(input);//input <- input keyboard
	        
	        if(input == 3 && hide == 0) {//������ �������� ���
	            hide = 1;//hide <- 1
		        System.out.println("Ǯ���� �������ϴ�");//output Ǯ���� �������ϴ�
		        System.out.println("���� ����� �߰��� �� ���� �Ǿ����ϴ�");//output ���� ����� �߰��� �� ���� �Ǿ����ϴ�
	            System.out.println("1. ������  2. �޽�  3. ���  4. ���� ������");//output 1. ����  2. �޽�  3. ���
	            input = 0;
	            
	        }
	        else {// ������ �������� �ʾ��� ���
	           System.out.println("1. ����  2. �޽�  3. ����  4. ���ӳ�����");//output 1. ����  2. �޽�  3. ����
	        }//else end
	        
	        if(input == 1) {//������ �����������
	        	ENEMYhp -= DAMEGE;//ENEMYhp <- ENEMYhp - DAMEGE
	           System.out.println("������ " + DAMEGE + "�� ������� �������ϴ�");//output ������ ����� �����ϴ�
	           
	           if(hide != 1) {//���Ż��°� �ƴҰ��
	        	   HP -= ENEMYdam+ENEMYlev;
	        	   System.out.println("�����Լ� "+ (ENEMYdam+ENEMYlev) + "�� ������� �Ծ����ϴ�");//output �����Լ� ENEMYdam �� ������� �Ծ����ϴ�
	           }//if end
	           hide = 0;//��������
	        	   
	        }
	        
	        else if(input == 2) {//�޽��� �����������
	           
	        	HP += 1;//hp <- hp + 1
	           if(HP >= MAXHP) {//HP�� �ʹ� ���� �����
	        	   HP = MAXHP;//HP�� �ִ�HP�� �����
	        	   System.out.println("�޽����� hp�� ����á���ϴ�");//output �޽�����hp�� ����á���ϴ�
	           }//if end
	           else {//�׷��� �������
	        	   
	        	   System.out.println("�޽����� hp�� 1 �ö����ϴ�");//output �޽�����hp�� 2 �ö����ϴ�
	           }//else end
	           if(hide == 0) {//���Ż��°� �ƴҰ��
	        	   HP -= ENEMYdam+ENEMYlev;
	        	   System.out.println("�����Լ� "+ (ENEMYdam+ENEMYlev) + "�� ������� �Ծ����ϴ�");//output �����Լ� ENEMYdam �� ������� �Ծ����ϴ�
	           }//if end
	        }//else if end
	        
	        else if(hide == 1 && input == 3){//����� ���� �������
	           hide = 0;//hide <- 0(���Ż��� ����)
	           ENEMYhp -= DAMEGE*2;
	           System.out.println("������� ������" + DAMEGE*2 + "�� ������� �������ϴ�");


	        }//if end
	        if(input == 4) {//4�� �Է����� ��
	        	return;//game ����
	        }
	        
	        if(ENEMYhp <= 0) {// �� HP�� 0���� �۰ų� ������(���� �׿�����)
	        	System.out.println("����� ���� ���� �׾����ϴ�");//output ����� ���� ���� �׾����ϴ�
		        System.out.println(ENEMYlev + "exp�� ������ϴ�");//output 10exp�� ������ϴ�
		        EXP += ENEMYlev;//exp <- exp + 10(exp 10 �߰�)
		        ENEMYhp = ENEMYmaxhp;// �� hp �ʱ�ȭ

		        if(EXP >= MAXEXP) {//exp >= maxexp(exp�� ���� á�ٸ�)
		        LEVEL = lvu.LevelUp(LEVEL);//levelup�̺�Ʈ ����
		        MAXHP = lvu.LevelUp(MAXHP, not, not2);//levelup�̺�Ʈ ����2
		        MAXEXP = lvu.LevelUp(MAXEXP, LEVEL);//levelup�̺�Ʈ ���� 3
		        DAMEGE = lvu.LevelUp(DAMEGE, not, not2, not3);//levelup�̺�Ʈ ���� 4
		        }//if end(levelup�̺�Ʈ)
	        }//if end
	        
	    }//for end
	    System.out.println("�׾����ϴ� (tip.ü�°����� �ϸ� ���� �� �� �ֽ��ϴ�)");//output �׾����ϴ� (tip.ü�°����� �ϸ� ���� �� �� �ֽ��ϴ�)
	}//Main end
	
}//game_1 end
