package lesson1;

public class Main { 
public static void main (String[] args) {
	//������� 1
int[] sa = new int[10];//������� ������ 
sa[0]= 21;
sa[1]= 25;
sa[2]= 30;
sa[3]= 28;
sa[4]= 26;
sa[5]= 29;
sa[6]= 27;
sa[7]= 26;
sa[8]= 21;
sa[9]= 22;
for(int i = 0; i < 10; i++){
	 System.out.println((i+1) + "-� ������� ������� = " +  sa[i]); // ����� ������ �� ������� �� �������
}

int result1 = 0;
for (int i = 0; i < sa.length; i++) {
	result1 = result1 + sa[i];
}
result1 = result1 / sa.length; // ����� ��������� ����� �� ����� ��������� � �������
System.out.println("������� ��������������: " + result1);


//������� 2
String totalText = "qwetyu"; // ������ ����� 
System.out.println("������� ������ "+totalText.length()+" ��������"); //����� ������ ������ 
int c = totalText.length()/2;
System.out.println(totalText.substring(0, c));
System.out.println(totalText.substring(c, totalText.length()));


//������� 3
int [] array = {1,2,3,4,5, -1, -5, 8,9,10};//������� ������ 
int max = array[0], min = array[0];
for(int i = 0; i<array.length; i++){
    if(max<array[i])
        max = array[i];//������� ������������ ��������
    if(min>array[i])
        min = array[i];//������� ����������� ��������
}
    System.out.println("min value = "+min);//����� min
    System.out.println("max value = "+max);//����� max
}
}