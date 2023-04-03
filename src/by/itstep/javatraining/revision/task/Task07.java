package by.itstep.javatraining.revision.task;

/*	Task 07. The sum of the digits of a four-digit number [сумма цифр четырёхзначного числа]
 *
 *	Дано целое четырёхзначное число (или меньше). Найдите сумму его цифр.
 *
 *	Примечание
 *	1) Число может быть как положительным, так и отрицательным.
 *	2) Если число превышает четырёхзначное, то нужно возвратить ноль (необходимо предусмотреть "защиту от дурака")
 *
 *	Формат входных данных [input]
 *	Функция принимает на вход любое целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	функция должна возвратить одно целое число - ответ на задачу или ноль - в случае неверных данных
 *
 *	[ input 1]: 1234
 *	[output 1]: 10
 *
 *	[ input 2]: -9999
 *	[output 2]: 36
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 * 	[ input 4]: 12345
 *	[output 4]: 0
 *
 * 	[ input 5]: -12345
 *	[output 5]: 0
 *
 * 	[ input 6]: -123
 *	[output 6]: 6
 *
 * 	[ input 7]: 12
 *	[output 7]: 3
 */

public class Task07 {
    public static int task07(int number) {

        int result;

        if (number < 0)
            number *= -1;
        if (number > 9999)
            result  = 0;
        else
            result = (number / 1000) + (number / 100 % 10) + (number / 10 % 10) + (number % 10);

        return result;


    }
}
