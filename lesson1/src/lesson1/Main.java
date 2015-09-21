package lesson1;

public class Main { 
public static void main (String[] args) {
	//задание 1
int[] sa = new int[10];//создаем массив 
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
	 System.out.println((i+1) + "-й элемент массива = " +  sa[i]); // вывод данных из массива на консоль
}

int result1 = 0;
for (int i = 0; i < sa.length; i++) {
	result1 = result1 + sa[i];
}
result1 = result1 / sa.length; // общий результат делим на число элементов в массиве
System.out.println("Среднее арифметическое: " + result1);


//задание 2
String totalText = "qwetyu"; // вводим текст 
System.out.println("Длиннна текста  "+totalText.length()+" символов"); //вывод длинны текста 
int c = totalText.length()/2;
System.out.println(totalText.substring(0, c));
System.out.println(totalText.substring(c, totalText.length()));


//задание 3
int [] array = {1,2,3,4,5, -1, -5, 8,9,10};//создаем массив 
int max = array[0], min = array[0];
for(int i = 0; i<array.length; i++){
    if(max<array[i])
        max = array[i];//находим максимальное занчение
    if(min>array[i])
        min = array[i];//находим минимальное значение
}
    System.out.println("min value = "+min);//вывод min
    System.out.println("max value = "+max);//вывод max
}
}