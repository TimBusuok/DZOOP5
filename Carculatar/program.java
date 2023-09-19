package DZ5.Carculatar;

// Импортируем необходимые классы
import java.util.Scanner;

// Определяем класс Main для запуска программы
public class program {
    public static void main(String[] args) {
        // Создаем экземпляры View, Model и Presenter
        CalculatorView view = new CalculatorViewImpl();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view, model);

        // Получаем входные данные от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        // Выполняем расчет с помощью Presenter
        presenter.calculate(num1, num2, operator);

        // Закрываем Scanner
        scanner.close();
    }
}

