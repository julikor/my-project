import java.util.Scanner;
public class Home_Task1 {
    public static void main(String[] args){
        String input;
        System.out.println("Введите введите двузначное число:");
        Scanner reader = new Scanner(System.in);
        input = reader.nextLine();

try
{
    int firstNumber = Character.getNumericValue(input.charAt(0));
    int secondNumber = Character.getNumericValue(input.charAt(1));
    System.out.println("Сумма цифр числа "+input+" равна " + ( firstNumber + secondNumber));
}
catch (Exception e){
    System.out.println("Произошла ошибка");
}
}}