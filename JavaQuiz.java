import java.util.Scanner;
public class JavaQuiz{
  public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);
   int score=0,input;
    System.out.println("Welcome to Quiz");

  System.out.println(" What is the default value of a boolean variable in Java ?");
  System.out.println("1.true   2.false   3.null");
   input = obj.nextInt();
  if( input==2)
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }
System.out.println(" Which of the following primitive data types is used to store a single ?");
  System.out.println("1. int   2. char  3. byte");
   input = obj.nextInt();
  if( input==2)
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }

System.out.println("What is the speed of light?");
  System.out.println("1.(3*10^5 m/s)   2.(3*10^8 m/s)   3.(3*10^10 m/s) ?");
   input = obj.nextInt();
  if( input==2)
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }
System.out.println("Which of the following is NOT a valid data type in Java?");
  System.out.println("1.integer   2.long  3.boolean");
   input = obj.nextInt();
  if( input==1)
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }
System.out.println("What is the size of a double in Java?");
  System.out.println("1.32   2.64  3.16");
   input = obj.nextInt();
  if( input==2)
    { 
      System.out.println("Correct");
      score+=5;
     }
    else
       { 
         System.out.println("Incorrect");
          score-=1;
        }


   System.out.println("\nQuiz Over!");
        System.out.println("Your final score is: " + score + " out of 25");




//sc.close();
}
}
