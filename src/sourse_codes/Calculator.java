package sourse_codes;

public class Calculator
{
    private double result;
    public Calculator()
    {
        result = 0;
    }
    public void makeCalculation(double num1, double num2, char operator)
    {
        Operation obj;
        switch (operator)
        {
            case '+' : obj = new Add();
                       result = obj.calculateResult(num1, num2);
                       break;
            case '-' : obj = new Subtract();
                       result = obj.calculateResult(num1, num2);
                       break;
            case '*' : obj = new Multiply();
                       result = obj.calculateResult(num1, num2);
                       break;
            case '/' : obj = new Divide();
                       result = obj.calculateResult(num1, num2);
                       break;
            case '%' : obj = new Modulo();
                       result = obj.calculateResult(num1, num2);
                       break;
            default  : System.out.println("Invalid Operator");
                       return;
        }
        System.out.print(result);
    }
}
