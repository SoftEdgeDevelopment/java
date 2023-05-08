public class JavaCodeNotes {
//    useful notes for java -
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//  --- VOCABULARY / TERMS / HELPFUL THINGS ---
//        Abstraction - storing unwanted details while giving out the most essential details, supported using interface and abstract class
//        Encapsulation - storing data (variables) and code (methods) into a single unit, supported using access modifiers (public, private, protected, default)
//        Public - can be accessed from anywhere
//        Private - can only be accessed within the same class
//        Protected - can only be accessed within the package or sub packages
//        Default - can only be accessed within the package or sub packages
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//  --- START MAIN METHOD LIKE THIS ---
//            public class "Class name"
//            {
//                public static void main(String[] args)
//                {
//
//                }
//            }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Helpful Quick Commands ---
//            ---
//        psvm (tab) - public static void main (String[] args){}
//        sout (tab) - System.out.println("Hello World!");
//        Scanner (scanner name) = new Scanner(System.in);    --- gets user input
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Data Types ---
//            ---
//      int - whole number (72) - 2147483647 max value
//      double - number with decimal (57.82)
//      boolean - true or false
//      String - words ("John")
//      char - a letter character ('Z')
//      byte - 8bit number (-128 minimum / 127 maximum)
//      short - 16bit number (-32,768 minimum / 32,768 maximum)
//      long - 64bit very large number (3459384593892342L)
//      float - data type that can store fractional numbers (74127f)
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Arithmetic Operations ---
//     ---
//      +  Addition
//      - Subtraction
//      * Multiplication
//      / Divison always round whole number unless double
//      % Modules - remainder number
//      && And - (a && b) means (a and b)
//      || Or - (a || b) means (a or b)
//      ! Is Not - (x != y) means (x does not equal y)
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Compound Operators ---
//     ---
//      += Plus Equal
//      -= Minus Equal
//      *= Times Equal
//      /= Divide Equal
//      %= Mod Equal (remainder)
//      ++ increase by 1 and assign the value back
//      -- decrease by 1 and assign the value back
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Casting ---
//     ---
//      //this will only show as integer 2 because nothing was cast as double and whole number 5 / whole number 2 = 2
//              System.out.println(5/2);
//   -----------------------------------------
//      //this is with casting and will show as double 2.5 because 5 was cast as (double) 5.0 before being divided by 2
//                System.out.println((double)5/2);
//   -----------------------------------------
//      //this will show as integer but cast (5/2) = 2 to double because of (). answer will be 2.0 because int 5/2 = 2 and (double) = 2.0
//             System.out.println((double)(5/2));
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//     Get User Input ---
//     ---
//      //create new scanner for user input
//      Scanner input = new Scanner(System.in);
//      //create new string and get the user input
//      String programmingLanguage = input.nextLine();
//      //display the user input
//      System.out.println("Your favorite language is " + programmingLanguage);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//       Print out the sum of numbers ---
//       ---
//           //this will print out the sum of the numbers in num (7 + 8 + 9)
//           int num = 789;
//           int sum = 0;
//           sum += num % 10;
//           num /= 10;
//           sum += num % 10;
//           num /= 10;
//           sum += num % 10;
//           num /= 10;
//           System.out.println(sum);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//       String Methods ---
//       ---
//      String.length() - will give the length (amount of chars) contained in the String
//      String.indexOf(String name) - will give the index starting location of the word in the string
//      String.substring(int from #, int to #) - will give the string from index start to end location picked from user
//      String.equals(String name) - checks if the strings are the same - true or false
//      String.compareTo(String name) - compares which comes first in alphabetical order - (A is 9 characters ahead of J (-9))
//      //positive result - the initial char / String comes after the comparedTo               attached to above line   ^^^^^
//      //negative result - the initial char / String comes before the comparedTo              attached to above line   ^^^^^
//      String.charAt(int) - finds the character contained at the index location in the String
//      String.isEmpty() - checks if the String contains anything in it - true or false
//      String.toUpperCase() - converts all characters in the String to upper case
//      String.toLowerCase() - converts all characters in the String to lower case
//      String.startsWith(String) - checks if the first word/char in the String matches - true or false
//      String.endsWith(String) - checks if the last word/char in the String matches - true or false
//      String.trim() - cuts off / trims any extra spaces contained in the String
//      String.replace(String 1, String 2) - replaces the String of 2 values
//      String.replaceAll(String 1, String2) - replaces everything between the 2 Strings
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        Java Math Class Methods ---
//        ---
//      (Math.typeOfOperation()) - always write it like this
//      Math.abs(num1) - gives absolute value (positive number)
//      Math.pow(num,num) - gives the exponent value (2,3 = 2^3 = 8)
//      Math.sqrt(num) - gives square root value
//      Math.max(num1,num2,num3...) - gives the largest number between the values
//      Math.min(num1,num2,num3...) - gives the smallest number between the values
//      Math.round(num) - rounds to the nearest decimal point (3.2 = 3) (3.6 = 4)
//      Math.floor(num) - rounds down to the number (3.7 = 3)
//      Math.ceil(num) - rounds up to the number (3.2 = 4)
//      Math.PI - gives the value of pi
//      --
//      //for random numbers must add 1 to the end otherwise the index starts at 0, cast as int for whole number
//      Math.random() * 10 - gives random number from 0-9 as a decimal
//      --
//      ((int)(Math.random() * 10)) + 1) - gives random number from 1-10 as a whole number
//      --
//      //4 is the starting index location, the random numbers will be between 5 total values starting from 4 (4,5,6,7,8) 8 is the highest possible number
//      System.out.println((int) (Math.random() * 5) + 4);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//        If, Else If, Else ---
//        ---
//          public class GradeExample
//           {
//              public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 System.out.println("Enter your grade");
//                    double grade = scanner.nextDouble();
//                  if (grade > 89){
//                      System.out.println("Your grade is A");
//                   } else if (grade > 79) {
//                      System.out.println("Your grade is B");
//                  } else if (grade > 69) {
//                      System.out.println("Your grade is C");
//                  }
//                    else if (grade > 59) {
//                      System.out.println("Your grade is D");
//                  }
//                  else {
//                      System.out.println("Your grade is F");
//                  }
//             }
//         }
//        --
//        Ternary Operator - easy way to write if else statement on a single line
//        int age = 19;
//        //new string variable for message
//        String message;
//        //checks if age is greater than or equal to 18 ?   if true - runs first String, if false - runs second String
//        message = age >= 18 ? "You can join the party." : "You are not allowed";
//        System.out.println(message);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         For / While Loops ---
//         ---
//    --------------------- for loop and while Loop to print the sum of the numbers ---------------------
//      public static void main(String[] args) {
//        //example of for loop to make a countdown from 10
//        //starting from 10, until 0, countdown by 1
//        for (int i = 10; i >=0 ; i--) {
//            //display counting down and the number
//            System.out.println("counting down " + i);
//        }
//    --------------------- while Loop to print the sum of the numbers ---------------------
//     public static void main(String[] args) {
//        //new scanner for user input
//        Scanner input = new Scanner(System.in);
//        //prompt user to enter a number
//        System.out.println("Enter a number");
//        //new variable to get users input as a number
//        int userInput = input.nextInt();   //test with number 234
//        //new int for the total starting at 0 to get the total value of all the digits
//        int total = 0;
//        while (userInput != 0) {
//            //do math to separate all the digits from each other
//            //mod by 10 to get the 1s digit as a remainder
//            int digit = userInput % 10;   //234 - example number
//            //add the ones digit to the total
//            total += digit;   //4
//            //will show the total of each digit starting with the ones digit
//            System.out.print(total + ", ");
//            //to get the 10s digit, divide by 10 because ints will always give whole number
//            userInput = userInput / 10;   //23
//        }
//        System.out.println(": The sum of the digits in the number is " + total);
//    }
//     --------------------------- while loop -------------------------------
//        //example of while loop to make a countdown from 10
//        //new int variable for counter
//        int counter = 10;
//        //while counter is greater than or equal to zero
//        while(counter>=0){
//            //display the count
//            System.out.println("counting down " + counter);
//            //count down
//            counter--;
//        }
//    }
//      --------------------- for loop to print the sum of the numbers ---------------------
//          public static void main(String[] args) {
//          Write a for loop to find
//          the sum of the numbers between 1 and 5.
//
//        //new int variable sum starting from 0
//        int sum = 0;
//        //starting from 1 until 5, add 1
//        for (int i = 1; i <=5 ; i++) {
//            //print the sum
//            System.out.println(sum);
//            //sum = sum + i
//            //(0+1)(1+2)(3+3)(6+4)(10+5) = 15
//            sum = sum + i;
//        }
//        //display the total (15)
//        System.out.println("result: " + sum);
//    }
//      --------------------- for loop String Transversal ---------------------
//      public static void main(String[] args) {
//        String str1 = "Hello";
//
//        //starting at 0, until String str1 length, add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //display the substring at beginning index i, and end index i + 1, this will only give 1 letter at a time
//            System.out.println(str1.substring(i, i+1));
//            //display the char at index location i in String str1
//            System.out.println("with charAt(i) " + str1.charAt(i));
//        }
//        //display this at the end of the for loop
//        System.out.println("Something");
//    }
//    --------------------- String Transversal and writing a word backwards ---------------------
//     public static void main(String[] args) {
//        String str1 = "World";
//        //starting at 1, until the Strings length, add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //display the substring starting at i until i+1 (0,0+1) to get each index letter 1 at a time
//            System.out.println(str1.substring(i, i+1));
//        }
//        System.out.println("+++++Reversed Version++++++++++");
//        //starting at String legnth - 1, until 0, subtract 1
//        for (int i = str1.length() - 1; i >=0 ; i--) {
//            //display the substrings and +1 to display 1 letter at a time
//            System.out.println(str1.substring(i, i+1));
//        }
//        System.out.println("+++++charAt() Version++++++++++");
//        //same way to write as the first method with charAt instead of substring
//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
//        }
//       --------------------- check how many of the same char is contained in a string ---------------------
//     public static void main(String[] args) {
//        //create a new string for a word
//        String str1 = "Argentina";
//        //new count starting from 0
//        int count = 0;
//        //starting from 0, until the string length add 1
//        for (int i = 0; i < str1.length(); i++) {
//            //checks letter by letter using substring to see how many a's are contained in the String
//            if (str1.substring(i, i + 1).contains("a") || str1.substring(i, i + 1).contains("A")){
//                //if any a's are contained, increase the count
//                count++;
//            }
//        }
//        //display the number of a's in the String
//        System.out.println("There are " + count + " \"a\"s in the " + str1);
//
//    }
//       --------------------- checks if a String contains any vowels ---------------------
//      public static void main(String[] args) {
//        //new String sentence
//        String champ = "Morocco is the best!";
//        //counter starting at 0
//        int counter = 0;
//        //starting from 0, until the length of the string, add 1
//        for (int i = 0; i < champ.length(); i++) {
//            //string string checks letter by letter using substring
//            String check = champ.substring(i, i+1);
//            //call to the isVowel method using check to see letter by letter if it contains any of the vowels
//            if(isVowel(check)){
//                //if it contains any vowel, add 1
//                counter++;
//            }
//
//        }
//        //display the count of vowels
//        System.out.println("There are " + counter + " vowels in " + champ);
//    }
//
//    //new method true or false to see if there is a vowel or not
//    //1 parameter for check
//    public static boolean isVowel(String check){
//        //checking letter by letter, if any letter equals a vowel
//        if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u")){
//            //return true to the counter
//            return true;
//            //else return false and do not increase counter
//        } else {
//            return false;
//        }
//    }
//       --------------------- method to check if a number is prime ---------------------
//       ---
//       public static void main(String[] args) {
//        //call to the isPrime method
//        isPrime();
//    }
//
//    //new boolean method isPrime to see if a number is prime or not
//    public static boolean isPrime(){
//        //new scanner for user input
//        Scanner scan=new Scanner(System.in);
//        //prompt user to input a number
//        System.out.println("input a number: ");
//        //get user input for int variable number
//        int number= scan.nextInt();
//        //boolean to check if a number is prime or not
//        boolean isPrime;
//        int count=0;
//        //starting from, until the user input number, add 1
//        for (int i =1; i <=number; i++) {
//            //if the number after being divided by the number has no remaining
//            if(number%i==0) {
//                //increase count by 1
//                count++;
//            }
//        }
//        //if the count goes more than 2
//        if (count>2){
//            //the number is not prime
//            System.out.println("it is not prime");
//            isPrime=false;
//        }else{
//            //else the number is prime
//            System.out.println("it is prime");
//            isPrime=true;
//        }
//        return isPrime;
//
//    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Constructors --- Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things:
//         its name is the same as the class name and it has no return type.
//         Sometimes constructors are also referred to as special methods to initialize an object.
//         ---
//               public class Practice02
//      {
//          //private created for personName
//          private String personName;
//          //private created for personAge
//          private int personAge;
//          //constructor created to assign new variables
//         public Practice02(String thePersonName, int thePersonAge){
//              //new variable to be assigned
//                personName = thePersonName;
//                //new variable to be assigned
//             personAge = thePersonAge;
//         }
//         //new public created
//         //void for text
//      public void printPersonInfo(){
//             //call the personName and print info from main
//         System.out.println("The persons name is " + personName);
//         //call the personAge and print info from main
//         System.out.println("They are " + personAge + "years old");
//      }
//         public static void main(String[] args) {
//             //generate new object and assign the variables values for personName, and personAge
//                Practice02 person1 = new Practice02("Mike",87);
//               Practice02 person2 = new Practice02("James", 26);
//               //prints info of person 1 called from public void printPersonInfo
//               person1.printPersonInfo();
//              //prints info of person 2
//              person2.printPersonInfo();
//           }
//      }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Getters and Setters --- methods in java that are used to retrieve the value of a data member and update or set the value of a data member respectively.
//         Getters are also called accessors and Setters are also called mutators.
//         ---
//         //class created with getters to call from the main and setters to change the values of parameters of the object in the main, override to string and display all the information
//      public class Practice15 {
//         //new class for a person created - static to be accessed within
//            static class Person{
//            private String name;
//            private int age;
//         private double salary;
//         private boolean isMarried;
//
//            //generate constructor with parameters to assign values to private variables
//               public Person(String name, int age, double salary, boolean isMarried) {
//                   this.name = name;
//                   this.age = age;
//                    this.salary = salary;
//                    this.isMarried = isMarried;
//               }
//                //create getter methods to get the information of each
//                //create setter methods to set the values of each variable
//             //right click - generate - getter and setter
//                public String getName() {
//                    return name;
//                }
//
//               public void setName(String name) {
//                  this.name = name;
//              }
//
//              public int getAge() {
//                   return age;
//               }
//
//              public void setAge(int age) {
//                  this.age = age;
//               }
//
//              public double getSalary() {
//                   return salary;
//              }
//
//             public void setSalary(double salary) {
//                 this.salary = salary;
//             }
//
//              public boolean isMarried() {
//                   return isMarried;
//               }
//
//              public void setMarried(boolean married) {
//                   isMarried = married;
//              }
//
//              //generate to string to display information of the object
//             @Override
//             public String toString() {
//                    return "Person{" +
//                           "name='" + name + '\'' +
//                           ", age=" + age +
//                            ", salary=" + salary +
//                            ", isMarried=" + isMarried +
//                         '}';
//                }
//            }
//            Person person1 = new Person("Joe",21,150000,true);
//            //main method for setters to call to the methods to change values of parameters in an object
//           public static void main(String[] args) {
//                //create new object for a Person
//                Person person1 = new Person("James",37,150000,true);
//                //get the persons info 1 by 1 with getters methods
//              person1.getName();
//              person1.getAge();
//               person1.getSalary();
//                person1.isMarried();
//                //display all the info using override to string method
//                System.out.println(person1);
//                //change all the info with setters methods
//               person1.setName("Drake");
//               person1.setAge(21);
//              person1.setSalary(800000);
//              person1.setMarried(false);
//              //display the persons updated information
//              System.out.println(person1);
//           }
//      }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//         Switches ---
//         ---
//         public class SwitchExample
//            {
//              public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 System.out.println("Pick a selection between 1-5");
//                 System.out.println("1 - Burgers");
//                 System.out.println("2 - Pasta");
//                 System.out.println("3 - Pizza");
//                 System.out.println("4 - Appetizers");
//                 System.out.println("5 - Special");
//                 int selection = scanner.nextInt();
//                   //switch is to make a single selection
//                   //case between 1-5
//                   switch(selection){
//                       case 1:
//                          System.out.println("1. You selected Burgers Menu");
//                            break;
//                       case 2:
//                         System.out.println("2. You selected Pasta Menu");
//                          break;
//                     case 3:
//                         System.out.println("3. You selected Pizza Menu");
//                          break;
//                     case 4:
//                         System.out.println("4. You selected the Appetizers Menu");
//                          break;
//                      case 5:
//                          System.out.println("5. You selected the Daily Special");
//                          break;
//                      //if all selections fail, at the end of the switch / cases
//                      default:
//                          System.out.println("You didn't select a correct item from the menu!");
//                          break;
//                  }
//              }
//--------------------------------------------------------------------------------------------------------------------------------------------------------

}
