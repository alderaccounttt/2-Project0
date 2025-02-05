import java.util.Random;

public class RecursionEx
{
	public static void main(String[] args)
	{
		int[] numbers = new int[20];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = new Random().nextInt(100) + 1;
		}

		int numberCount = numbers.length;

		System.out.println("\nThere are a total of " + numbers.length + " numbers in the array.");
		System.out.println("There are " + recursion(numbers, numberCount - 1) + " even numbers in the array.");

		for (int i = 0; i < numbers.length; i++)
		{
			if (i % 5 == 0)
			{
				System.out.print("\n");
			}

			System.out.printf("%4d", numbers[i]);
		}

		System.out.println("\n");
	}

	public static int recursion(int[] numbers, int recursiveCount)
	{
		if (recursiveCount < 0)
		{
			return 0;
		}
		else if (numbers[recursiveCount] % 2 == 0)
		{
			return 1 + recursion(numbers, recursiveCount - 1);
		}

		return recursion(numbers, recursiveCount - 1);
	}
}