class Generic {
// generic method printArray
public static<E extends Comparable<E>>  void printArray( E []a ) {
// Display array elements
for(E element : a) {
System.out.printf("%s ", element);
}
System.out.println();
for (int i =0;i<5;i++)
{
	for(int j=i+1;j<5;j++)
	{
		if(a[i].compareTo(a[j])>0)
		{
			E c = a[i];
			a[i] = a[j];
			a[j]= c;
		}
	}
}

System.out.println("After Sorting");
for(E element : a) {
System.out.printf("%s ", element);
}

System.out.println();
}

public static void main(String args[]) {
// Create arrays of Integer, Double and Character
Integer[] intArray = { 5, 3, 1, 2, 4 };
Double[] doubleArray = { 5.1, 2.2, 7.3, 6.4, 3.5 };
Character[] charArray = { 'D', 'B', 'A', 'E', 'C' };
String[] strArray = {"JAISANKAR","CHANDRU","KUMAR","VINCENT","CHIDAMBARAM"};
System.out.println("Array integerArray contains:");
printArray(intArray); // pass an Integer array
System.out.println("\nArray doubleArray contains:");
printArray(doubleArray); // pass a Double array
System.out.println("\nArray characterArray contains:");
printArray(charArray); // pass a Character array
System.out.println("\nArray StringArray contains:");
printArray(strArray); // pass a Character array
}
}
