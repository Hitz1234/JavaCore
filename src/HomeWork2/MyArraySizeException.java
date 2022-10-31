package HomeWork2;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super("Размерность массива должна быть [4 x 4]\n");
    }
}
