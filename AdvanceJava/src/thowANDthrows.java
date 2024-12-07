public class thowANDthrows {
    public static void main(String[] args) {
        try {
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.createArrayWithNegativeSize();
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}

class ArrayHandler {
    public void createArrayWithNegativeSize() throws NegativeArraySizeException {
        int size = -5; // Invalid size
        if (size < 0) {
            throw new NegativeArraySizeException("Array size cannot be negative: " + size);
        }
        int[] numbers = new int[size];
    }
}
