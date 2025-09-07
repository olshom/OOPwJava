## Description
This program works as a simple calculator that can perform addition of positive number to the calculators value. Also it can reset the value to zero and return the current value.

```java
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
}
```
The class has three methods:
1. `reset()`: Resets the calculator's value to zero.
2. `add(int a)`: Adds a positive integer `a` to the current value. If `a` is negative, it throws an `IllegalArgumentException`.
3. `getValue()`: Returns the current value of the calculator. This method is useful for retrieving the current state of the calculator after performing operations.

To use this class, you can create an instance of `Calculator` and call its methods as needed.