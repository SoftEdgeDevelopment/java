package javaprojects.project04;

import java.util.Scanner;
//get the users input for age and declare if they are senior citizen or non-senior citizen and increase the count by 1
public class Assignment03 {

    //Declare int variables: seniorCitizens, age
    //- Create a Scanner object
    //- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
    //“Enter current count for seniorCitizens and nonSeniorCitizens:”
    //- Ask user to enter age:
    //“What is new citizen’s age?”
    //- If citizen’s age is more than or equals to 65 then print” Senior Citizen” and increment
    //seniorCitizens variable by 1.
    //- If citizen’s age is less than 65 then print “Not-Senior Citizen” and increment nonSeniorCitizens
    //variable by 1.
    //- At last, print another message:
    //“New seniorCitizens count ValueOfVariable”
    //“New nonSeniorCitizens count ValueOfVariable”
    public static void main(String[] args) {
        //new variables for age, senior citizens, and non senior citizens
        int age;
        int seniorCitizen = 0;
        int nonSeniorCitizen = 0;

        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to enter the new citizens age
        System.out.println("What is the new citizen's age");
        //get the users input for age
        age = input.nextInt();
        //if age is greater than or equal to 65, print senior citizen and increase the count by 1
        if (age >= 65){
            seniorCitizen++;
            System.out.println("Senior Citizens : " + seniorCitizen);

        }
        else{
            nonSeniorCitizen++;
            System.out.println("Non Senior Citizens : " +nonSeniorCitizen );
        }

    }
}
