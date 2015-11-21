class array{

public static void main(String[] args)
{
System.out.println("natural array");
calc.printArray(calc.naturalArray(7));
System.out.println();

System.out.println("Random Int array");
int[] arrayInt = calc.randomIntArray(7);
calc.printArray(arrayInt);
System.out.println();

System.out.println("reverse of random Int array");
calc.printArray(calc.reverseArray(arrayInt));
System.out.println();

System.out.println("sum of random Int array");
System.out.println(calc.sumOfArray(arrayInt));
System.out.println();

System.out.println("Even Array");
calc.printArray(calc.evenArray(7,17));
System.out.println();

System.out.println("Odd array");
calc.printArray(calc.oddArray(7,17));
System.out.println();

System.out.println("prime array");
calc.printArray(calc.primeArray(7,17));
System.out.println();

System.out.println("fibonacci  array");
calc.printArray(calc.fibonacciArray(7));
System.out.println();

System.out.println("random Char array");
char[] arrayChar = calc.randomCharArray(7);
calc.printArray(arrayChar);
System.out.println();

System.out.println("reverse of random char array");
calc.printArray(calc.reverseArray(arrayChar));
System.out.println();

System.out.println("number of vowels in random char array");
System.out.println(calc.numberOfVowels(arrayChar));
System.out.println();

int[][] array1= {{1,2},{3,4},{5,6}};
int[][] array2= {{1,2,3},{4,5,6}};

System.out.println("array1");
calc.printArray(array1);

System.out.println("array2");
calc.printArray(array2);


System.out.println("multiplication of array 1 and array 2");
int[][] array3=calc.multiplyMatrices(array1,array2);

calc.printArray(array3);

}
}
