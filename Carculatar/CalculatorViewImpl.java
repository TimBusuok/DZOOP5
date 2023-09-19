package DZ5.Carculatar;


// Определяем класс View

class CalculatorViewImpl implements CalculatorView {
    @Override
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}