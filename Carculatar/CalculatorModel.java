package DZ5.Carculatar;

// Определяем класс Model
class CalculatorModel {
    private double result;

    public void calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Неподдерживаемая операция");
                return;
        }
    }

    public double getResult() {
        return result;
    }
}