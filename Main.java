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

    static String goal_choice;
    static String level_choice;

    Scanner input; //input field

//=============Constructor=================
    Main(){
        input = new Scanner(System.in);
    }


// ==========Method #1 User Info ============
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

//=============BMI calculator===============
    double bmiCal(float w, double h){
        h = h*0.30; //Converting foot to meter 
        return(w/(h*h));
    }

// =========Method #2 Fitness Goal==========
    void fitnessGoal(){
       System.out.println("Enter your fitness Goal: \n 1 for Weight loss \n 2 for Weight gain  \n 3 for General fitness");
        user_goal = input.nextShort();

        switch (user_goal) {
            case 1:
                // System.out.println("Weight Loss");
                goal_choice = "Weight loss";
                break;
            case 2:
                // System.out.println("Weight Gain");
                goal_choice = "Weight gain";
                break;
            case 3:
                // System.out.println("General Fitness");
                goal_choice = "General fitness";
                break;

            default:
                System.out.println("Select in respective goal assigned numbers: 1, 2, 3");
                break;
        }
    }

//===============Method #3 Fitness Level==================
    void fitnessLevel(){
        System.out.println("What is your fitness level: \n1 for Begginer\n2 for Intermediate \n3 for Advance");
        user_fitlevel = input.nextShort();
        switch (user_fitlevel) {
            case 1:
                // System.out.println("Begginer");
                level_choice = "Begginer";
                break;
            
            case 2:
                // System.out.println("Intermediate");
                level_choice = "Intermediate";
                break;
            
                case 3:
                // System.out.println("Advance");
                level_choice = "Advance";
                break;
                
                default:
                System.out.println("Select a valid option from 1,2,3");
                break;
        }
    }

//=================Method #4 Workout days======================
void final_plan(){

    /* ========Weight Loss Conditions=========== */
    if(goal_choice =="Weight loss"){
        /* QICK DIETRY INFORMATION REGARDING WEIGHT LOSS */
        if(level_choice == "Begginer"){
            System.out.print("Just walk out of your room");
        }
        else if(level_choice == "Intermediate"){
            System.out.println("Run 5km daily");
        }
        else if(level_choice == "Advance"){
            System.out.println("Run 5km and follow PPL split");
        }
        }

    /* ===========Weight Gain Condition============== */
    else if(goal_choice =="Weight gain"){
        /* QICK DIETRY INFORMATION REGARDING WEIGHT GAIN */
         if(level_choice == "Begginer"){
            System.out.print("Weight training for 1hr alternative days");
        }
        else if(level_choice == "Intermediate"){
            System.out.println("Weight trainig for 1hr daily");
        }
        else if(level_choice == "Advance"){
            System.out.println("High Intensity 1.5hr Weight trainig daily");
        }
    }
    
    /* ===========General Fitness Condition============== */
    else if(goal_choice =="General fitness"){
        /* QICK DIETRY INFORMATION REGARDING GENERAL FITNESS */
         if(level_choice == "Begginer"){
            System.out.print("5k steps daily and light weight training");
        }
        else if(level_choice == "Intermediate"){
            System.out.println("10k steps daily and volume weight training");
        }
        else if(level_choice == "Advance"){
            System.out.println("15k steps daily and moderate intensity weight training");
        }
    }
}
public static void main(String st[]){
    Main main = new Main(); //Decalring object

        main.userinfo(); // METHOD #1
            user_bmi = main.bmiCal(user_weight, user_height); // BMI CALCULATOR
                System.out.printf("Your BMI is: %.2f", user_bmi);

    System.out.println("\n----Step 2----\n");
        main.fitnessGoal(); // METHOD #2

    System.out.println("\n----Step 3----\n");
        main.fitnessLevel(); // METHOD #3

    System.out.println("\nYour personlize Workout Plan: \n");
        main.final_plan(); // METHOD #4
}

}