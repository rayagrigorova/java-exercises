<h1 align="center">Задачи</h1>

## 15. Задачи

Задължителна е само една от задачите. Която си харесате. Другите са по желание.
1. Създайте клас на име Time. Класът съдържа:
- Полетата с данни час, минута и секунда, които представляват време.
- Конструктор no-arg, който създава обект Time за текущото време. (Стойностите на полетата с данни ще представляват текущото време.)
- Конструктор, който конструира обект Time с определено изминало време
от полунощ, 1 януари 1970 г., в милисекунди.
- Конструктор, който създава обект Time с посочени час, минути,
и секунди.
- Три метода за получаване на полетата с данни час, минута и секунда.
- Метод с име setTime (long elapseTime), който задава ново време за
обект, използващ изминалото време от полунощ, 1 януари 1970 г., в милисекунди. Например, ако изминалото време е 555550000 милисекунди, часът е 10, минутата е 19, а секундите е 10.

  Начертайте UML диаграмата за класа, след което имплементирайте класа. Напишете тестова програма, която създава три обекта Time (използвайки new Time (), new Time (555550000) и new Time (5, 23, 55)) и показва техния час,
  минута и секунда във формат час: минута: секунда.
  (Съвет: Първите два конструктора ще извлекат час, минута и секунда
  от изминалото време. За конструктора no-arg текущото време може да бъде
  получено с помощта на System.currentTimeMillis ())

2. Design a class named MyInteger . The class contains:
- An int data field named value that stores the int value represented by
this object.
- A constructor that creates a MyInteger object for the specified int value.
- A getter method that returns the int value.
- The methods isEven() , isOdd() , and isPrime() that return true if the
- value in this object is even, odd, or prime, respectively.
- The static methods isEven(int) , isOdd(int) , and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
- The static methods isEven(MyInteger) , isOdd(MyInteger) , and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
- The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
- A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
- A static method parseInt(String) that converts a string into an int value.

  Draw the UML diagram for the class then implement the class. Write a client
  program that tests all methods in the class.

3. Design a class named MyPoint to represent a point with x - and y -coordinates. The class contains:
- The data fields x and y that represent the coordinates with getter methods.
- A no-arg constructor that creates a point ( 0 , 0 ).
- A constructor that constructs a point with specified coordinates.
- A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
- A method named distance that returns the distance from this point to
another point with specified x - and y -coordinates.
- A static method named distance that returns the distance from two MyPoint
objects.

  Draw the UML diagram for the class then implement the class. Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.

## 16. Упражнение

1. class АТМ  
Използвайте класа Account, създаден в 14. Упражнение за симулиране на банкомат. Създайте 10 акаунта в масив с id-та  0,1,. . . , 9
и първоначално салдо от $ 100. Системата подканва потребителя да въведе id номер. Ако id-то е въведено неправилно, помолете потребител
да въведе правилно id. При правилно id главното меню се показва, както е показано в примернa. Може да се избере опция 1 за преглед на текущото салдо,
2 за теглене на пари, 3 за депозиране на пари и 4 за излизане от главното меню. След като излезете, системата ще поиска отново id. По този начин,
след като системата е пусната веднъж, тя няма да спре никога.

Пример: 

```
Enter an id: 4
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 100.0
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 2
Enter an amount to withdraw: 3
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 97.0
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 3
Enter an amount to deposit: 10
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 107.0
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 4
Enter an id:
```

2. Създайте и тествайте класа Course, следвайки диаграмата. Един курс може да се посещава от максимум стотима ученици.

![SRRzqpQtgL-W4LJ02JKdz4gjwgiaCCvuXQQ33tl2wUhW-GutIQPkAsxlrlJg8GQN3blPj9fc9n5sPYUSu3GCR10XTiXWlEqRf3oUQks948WXXLVxAj_ZVj5Ca5vSns7fl4LqghvbVp7yn6pqkjIX4w](https://github.com/rayagrigorova/java-exercises/assets/72023155/fffbbfef-f8d6-4b83-9c03-2f27f6034345)

Съвет: За да махнете ученик, преместете всички ученици след него с една позиция на ляво, а последният елемент задайте като null.
Примерен тест:

```java
public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");
    course1.addStudent("Peter Jones");
    course1.addStudent("Kim Smith");
    course1.addStudent("Anne Kennedy");
    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");
    System.out.println("Number of students in course1: " +
      course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
    System.out.println();
    System.out.print("Number of students in course2: " +
      course2.getNumberOfStudents());
  }
}
```

## 17. Упражнение

Създайте проект, подобен на примерния, в който има асоциация, агрегация и композиция като отношения между обекти от различни класове.
Диаграма на примерния проект: 

![image](https://github.com/rayagrigorova/java-exercises/assets/72023155/565c837f-5327-46e7-a194-c24ca88774f6)



