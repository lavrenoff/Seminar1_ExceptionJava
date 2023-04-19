// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.



import java.util.Random;

public class mainTwo {
    private final static int MIN_LENGTH = 5; // константное значение
    public static void main(String[] args) {
        int err=findIndexOf(5, new int[]{1, 3, 6, 7, 8, 9});

        if(err==-3)        
           System.out.println("null");
        if(err==-2)        
           System.out.println("искомый элемент не найден");           
        if(err==-1)        
           System.out.println("длина массива меньше заданного MIN_LENGTH");           
    }

    private static int findIndexOf(int value, int[] array){
        if(array == null){ // проверка на null
            return -3;
        }
        if(array.length < MIN_LENGTH){ // если длинна меньше заданного мин
            return -1;
        }
        for(int i = 0; i < array.length; i++){ // если искомый элемент не найден
            if(value == array[i]){
                return 1;
            }
        }
        return -2;
    }

}
