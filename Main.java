import java.util.Scanner;

class Main
{
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

void finalPlan(){
    if(goal_choice == "Weight loss"){
        if(level_choice == "Begginer"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else if(level_choice == "Intermediate"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else if(level_choice == "Advance"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
    }

    else if(goal_choice == "weight gain"){
        if(level_choice == "Begginer"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else if(level_choice == "Intermediate"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else if(level_choice == "Advance"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
    }

    else if(goal_choice == "general fitness"){
        if(level_choice == "Begginer"){
        String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }        
        }
        else if(level_choice == "Intermediate"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else if(level_choice == "Advance"){
            String[] exerciseNames = {"Push-ups", "Squats", "Planks"};
        int[] sets = {3, 4, 2};
        int[] repetitions = {15, 12, 30};
        String[] days = {"Monday", "Wednesday", "Friday"};

        // Table header
        System.out.printf("%-15s%-10s%-15s%-10s\n", "Exercise", "Sets", "Repetitions", "Days");

        // Table data
        for (int i = 0; i < exerciseNames.length; i++) {
            System.out.printf("%-15s%-10d%-15d%-10s\n", exerciseNames[i], sets[i], repetitions[i], days[i]);
        }
        }
        else{
            System.out.println("nothing");
        }
    }
    else{
        System.out.println("Nothing");
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
        System.out.println("\n----Workout Plan----");
    main.finalPlan();
}

}