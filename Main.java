public class Main {

   public static void main(String []args) {
      
      // BOOLEAN VARIABLES can only hold true or false
      boolean lightsOn = false;
      boolean dannyPresent = true;

      // BOOLEAN EXPRESSIONS are like questions (or comparisons)
      // where the only possible answers and true or false
      boolean exp1 = (dannyPresent == true); // is Danny here?
      boolean exp2 = (lightsOn !=  true); // are the lights NOT on? (off)

      // COmparing numerical values
      int x = 6;
      int y = 7;

      // Check for EQUALITY using the == operator
      System.out.println(x == y); // you can print boolean exp. directly
      // Check for NOT equal using the != operator
      boolean exp3 = (x != y); // store the boolean exp result in a variable
      System.out.println(exp3);

      // Compare numeric values (int, double) using RELATIONAL OPERATORS
      System.out.println(x < y); // true (6 IS LESS THAN 7)
      System.out.println(x > y); // false
      System.out.println(x <= y); // true
      System.out.println(x >= y); // false
      System.out.println(y >= x); // true (ORDER MATTERS w/rel. operators)
      System.out.println(y == y); // true

      // Can you compare ints and doubles?
      double z = 6;
      System.out.println(x == z); // true (6 and 6.0 are the same value!)

      // IF STATEMENTS: use boolean expressions to make 
      // DECISIONS about which code to execute

      // Determine what value or condition your choice rests on
      // EX: Using the elevator at BWL depends on time
      double time = 8.5; // means 8:30 AM
      time = 7.75; // mean 7:45 AM
      time = 8.25; // mean 8:15 AM

      // Put the CONDITION to test in parenthesis
      if (time < 8) {
         // if statement BODY only runs if condition was true
         System.out.println("You can take the elevator!");
      }
      // State,emy below is out of the if statement, so it'll run anyay
      System.out.println("The elevator is only avaliable before 8 am");

      // TWO-WAY SELECTION: if block + else block
      time = 8.0;
      if (time < 8) {
         System.out.println("Eligible for elevator");
      }
      else {
         // Statement in ELSE block runs when IF block is false
         System.out.println("Take the stairs...");
      }
      
      // Another example of the TWO-WAY SELECTION
      // In this case, using just a boolean VALUE (not an EXPRESSION)
      boolean heads = false; // flipping tails
      // if (true)
      if (heads) {
         System.out.println("Flipped heads! Wear white.");
      }
      else {
         System.out.println("Flipped tails! Wear black.");
      }


   }
}
