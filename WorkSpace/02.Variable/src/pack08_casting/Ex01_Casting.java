package pack08_casting;

public class Ex01_Casting {
     public static void main(String[] args) {
        // �ڵ�����ȯ�� �߻��� ���� Ÿ��(int) => ū Ÿ�� (double)
 		// ������ ����ȯ , Upcasting
    	 
    	int iNum= 10; // ������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum; //�� ū Ÿ�Կ� ���� Ÿ���� ������ �ڵ� ��ȯ�� �Ͼ (�ڵ� ����ȯ)
    	System.out.println(iNum);
		System.out.println(dNum);
	
		
		//int iNum2; = dNum2; ū Ÿ�� > ���� ������ Ÿ��
   	    //������ ����ȯ, 
		double dNum2 =30.5;
		int iNum2 =(int)dNum2;	
	    System.out.println(dNum2);
	    System.out.println(iNum2);
    //DownCasting�� ������ �߻���. ǥ���Ҽ����� �����͸� ��������.
	// �������� �ŷڼ�, ���ռ��� ������ ���ɼ��� ũ�⶧���� ����
	// long > int, int > float
	// ���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������.
	
	
	int num1 = 40;
	byte num2 =(byte)num1;
	
	System.out.println(num1);
	System.out.println(num2);
	
     }
     
     
     
}