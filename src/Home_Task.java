    import java.util.Scanner;
    public class Home_Task {
        public static void main (String[] args) {
            int number, user_number;
            number = (int)(Math.random() * 10) + 1;
            System.out.println("Введите число от 1 до 10:");
            Scanner input = new Scanner(System.in);
            // Проверяем, есть ли в потоке ввода целое число
            if( input.hasNextInt() ) {
                do {
                    // Читаем с потока ввода целое число
                    user_number = input.nextInt();
                    if(user_number == number) {
                        System.out.println("Поздравляем! Сопадение найдено");
                    } else {
                        // Проверяем, входит ли число в отрезок [1;10]
                        if (user_number > 0 && user_number <= 10) {
                            System.out.print("К сожалению вы не угадали ");

                        }
                    }
                } while( user_number != number );

            }
            System.out.println("До свиданья!");
        }
    }