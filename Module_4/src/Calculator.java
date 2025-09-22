public class Calculator {
    private int value = 0;
    public Calculator() {
        this.value = 0;
    }
    public void reset() {
        this.value = 0;
    }
    public void add(int a) {
        if (a>0){
            this.value += a;
        } else {
            throw new IllegalArgumentException("Only non-negative integers are allowed.");
        }
    }
    //A method that returns the current value of the calculator.
    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        System.out.println("After adding 5: " + calculator.getValue()); // Should print 5

        calculator.add(10);
        System.out.println("After adding 10: " + calculator.getValue());

        calculator.reset();
        System.out.println("Reset value: " + calculator.getValue()); // Should print 0

        calculator.add(15);
        System.out.println("After adding 15: " + calculator.getValue()); // Should print 15

        int currentValue = calculator.getValue();
        System.out.println("Current value: " + currentValue); // Should print 15

        try {
            System.out.println("Attempting to add -3:");
            calculator.add(-3); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Should print the error message
        }
    }
}
