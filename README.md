# Java Programming Concepts - Reviewer 📚
This reviewer covers essential topics related to Strings, Arrays, Collections, and Tuples in Java. It is designed to help you understand key concepts and methods used in Java programming.

## 📖 1. Strings and Arrays
**📌 Character Data**
```
char letter = 'A';
```
***📌 Character Class Methods***
```
char ch = '1';
if (Character.isDigit(ch)) {
    System.out.println(ch + " is a digit.");

}
```
***📌 String & String Methods***
```
String str = "Hello, World!";
System.out.println("Length: " + str.length());
System.out.println("Substring: " + str.substring(0, 5));  // Output: Hello
```
***📌 StringBuilder & StringBuffer***
```
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World!");
System.out.println(sb.toString());  // Output: Hello World!

StringBuffer sbf = new StringBuffer("Thread Safe");
sbf.append(" Buffer");
System.out.println(sbf.toString());  // Output: Thread Safe Buffer
```
## 📖 2. Array Declaration and Initialization
**📌 Variable Subscript**
```
int[] numbers = {1, 2, 3, 4};
System.out.println("First element: " + numbers[0]);  // Output: 1
```
**📌 Arrays of Strings**
```
String[] cities = {"New York", "Paris", "Tokyo"};
System.out.println("First city: " + cities[0]);  // Output: New York
```
**📌 Searching an Array**
```
int[] arr = {10, 20, 30, 40};
int index = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 30) {
        index = i;
        break;
    }
}

System.out.println("Element found at index: " + index);  // Output: 2
```
**📌 Passing Arrays and Returning Arrays from Methods**
```
public static void modifyArray(int[] arr) {
    arr[0] = 99;
}

int[] numbers = {1, 2, 3};
modifyArray(numbers);
System.out.println("First element after modification: " + numbers[0]);  // Output: 99
```
## 📖 3. Arrays
**📌 One Dimensional Arrays**
```
int[] numbers = {1, 2, 3, 4};
for (int num : numbers) {
    System.out.println(num);
}
```
**📌 Multidimensional Arrays**
```
int[][] matrix = {{1, 2}, {3, 4}};
System.out.println("Element at position [0][1]: " + matrix[0][1]);  // Output: 2
```
**📌 Jagged Array**
```
int[][] jaggedArray = new int[2][];
jaggedArray[0] = new int[3];
jaggedArray[1] = new int[2];
jaggedArray[0][0] = 1;
jaggedArray[1][1] = 5;
System.out.println("Jagged array element: " + jaggedArray[1][1]);  // Output: 5
```
## 📖 4. Using Arrays Class
```
int[] numbers = {10, 20, 30, 40};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));  // Output: [10, 20, 30, 40]
```
## 📖 5. Using ArrayList Class
```
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

for (String fruit : list) {
    System.out.println(fruit);
}
```
## 📖 6. Creating Enumerations 🧑‍🏫
```
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

Day today = Day.MONDAY;
System.out.println("Today is: " + today);  // Output: MONDAY
```
## 📖 7. Lists and Sets
** 📌 Collections in Java **
```
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println("List size: " + list.size());  // Output: 2
```
## 📖 8. Lists
** 📌 Implement Lists Interface **
```
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.remove(1);  // Removes the element at index 1
System.out.println(list);  // Output: [1, 3]
```
**📌 Iterating and Sorting Lists**
```
List<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 3, 2));
Collections.sort(list);
System.out.println("Sorted list: " + list);  // Output: [1, 2, 3, 4]
```
## 📖 9. Sets
**📌 Operations on Sets**
```
Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");
set.remove("Banana");
System.out.println(set);  // Output: [Apple, Cherry]
```
## 📖 10. Tuples 🏷️
**📌 Java Tuples Library**
```
Tuple2<String, Integer> tuple = Tuple.with("Age", 25);
System.out.println(tuple.getValue0());  // Output: Age
System.out.println(tuple.getValue1());  // Output: 25
```
## 📖 11. Creating Tuples
**📌 Using with() Method**
```
Tuple3<String, Integer, String> tuple = Tuple.with("Name", 30, "Engineer");
System.out.println("Name: " + tuple.getValue0() + ", Age: " + tuple.getValue1() + ", Occupation: " + tuple.getValue2());
```
## 📖 12. Tuple Operations
** 📌 Get Values **
```
Tuple2<String, Integer> tuple = new Tuple2<>("Height", 180);
System.out.println("Key: " + tuple.getValue0() + ", Value: " + tuple.getValue1());  // Output: Height, 180
```
** 📌 Set Values **
```
tuple.setValue0("Weight");
tuple.setValue1(75);
System.out.println("Updated Tuple: " + tuple.getValue0() + ", " + tuple.getValue1());
```
## 🚀 Conclusion
Java's powerful features, such as arrays, collections, and tuples, offer a vast array of tools for efficient data manipulation. Mastering these concepts will greatly enhance your problem-solving abilities and your understanding of Java's versatility. Happy coding! 🎉
