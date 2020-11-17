import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println(
        "Misses Benny: Hello new students, my names Ms.Benny and I will be your teacher for this year. I would like to get to know your names!");
    // This is just like a script of Ms. Benny introducing herself

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // This is the seat numbers
    String[] names = new String[15];
    // This represents 15 students
    Scanner scan = new Scanner(System.in);
    // This scanner is to get the students names
    for (int i = 0; i < 15; i++) {
      System.out.println("What's are your name?");
      names[i] = scan.next();
      // This is my for loop to keep printing names
    }
    System.out.println("Ms.Benny: Nice to meet you all now we shall assign new seats to everyone!");
    // this is just another print statement
    int count = 0;
    while (count <= 14) {

      System.out.println(names[count] + " You'll sit in seat " + numbers[count]);
      
      count++;
    }
    // While loop to assign kids to sit in their seats
    // This while loop also also re-prints everything
  }
}
