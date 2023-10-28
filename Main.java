import java.util.Scanner;

public class Main{
    // Variables
    String user_name;
    short user_age;
    static float user_weight;
    static float user_height;
    static double user_bmi;

    static short user_goal;
    static short user_fitlevel;

    Scanner input; //input field


    Main(){
        input = new Scanner(System.in);
    }

    //User Info
    void userinfo(){
        System.out.println("Enter your name: ");
        user_name = input.nextLine();

        System.out.println("Enter your age");
        user_age = input.nextShort(); 

        System.out.println("Enter your weight");
        user_weight = input.nextFloat();

        System.out.println("Enter your height");
        user_height = input.nextFloat();
    }

    //BMI calculator
    double bmiCal(float w, double h){
        h = h*0.30; //Converting foot to meter 
        return(w/(h*h));
    }

    void fitnessGoal(){
       System.out.println("Enter your fitness Goal: \n 1 for Weight loss \n 2 for Weight gain  \n 3 for General fitness");
        user_goal = input.nextShort();

        switch (user_goal) {
            case 1:
                System.out.println("Weight Loss");
                break;
            case 2:
                System.out.println("Weight Gain");
                break;
            case 3:
                System.out.println("General Fitness");
                break;

            default:
                System.out.println("Select in respective goal assigned numbers: 1, 2, 3");
                break;
        }
    }

    void fitnessLevel(){
        System.out.println("What is your fitness level: \n1 for Begginer\n2 for Intermediate \n3 for Advance");
        user_fitlevel = input.nextShort();
        switch (user_fitlevel) {
            case 1:
                System.out.println("Begginer");
                break;
            
            case 2:
                System.out.println("Intermediate");
                break;
            
                case 3:
                System.out.println("Advance");
                break;
                
                default:
                System.out.println("Select a valid option from 1,2,3");
                break;
        }
    }
public static void main(String st[]){
    Main main = new Main(); //Decalring object

    main.userinfo();
    user_bmi = main.bmiCal(user_weight, user_height);
        System.out.printf("Your BMI is: %.2f", user_bmi);

        System.out.println("\n----Step 2----");
    main.fitnessGoal();

        System.out.println("\n----Step 3----");
    main.fitnessLevel();
}

}