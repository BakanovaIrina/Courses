public class Main {
    public static void sumInteger(String[][] array) throws MyArraySizeException {
        int k = 0;
        checkMatrix(array);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                try {
                    k += Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e){
                    System.out.println("Не удалось преобразовать элемент " + "[" + i + "] " + "[" + j + "] ");
                    return;
                }
            }
        }
        System.out.println("Сумма элементов данной матрицы " + k);
    }

    public static void checkMatrix(String[][] array) throws MyArraySizeException{
        if (array.length !=4){
            throw new MyArraySizeException();
        }
        for (String[] strings : array)
            if (strings.length != 4)
                throw new MyArraySizeException();
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            sumInteger(array);
        } catch (MyArraySizeException e){
            System.out.println("Размер данного массива должен быть 4 на 4, такое правило, уж извините!");
        }

    }
}