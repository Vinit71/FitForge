// fitforge
import java.util.Scanner;
/*
*
*   Develope by Vinit
*
*/
public class Main
{
    // Variables
    String user_name;
    short user_age;
    static float user_weight;
    static float user_height;
    static double user_bmi;

    static short user_motive;
    static short user_fitlevel;

    boolean more;

    Scanner input; //input field

    /*
        [ constructor ] ----
    */

    Main()
    {
        input = new Scanner(System.in);
    }
    // 
    // [ BMI calculator ]
    //
    double bmiCal(float w, double h)
    {
        h = h*0.30; //Converting foot to meter 
        return(w/(h*h));
    }
    /*
        [ more ] : static function, it is wait function to stop console control
    */
    static void more()
    {
        System.out.println("\n\n PRESS[ enter ] more \n\n");
        more = input.nextBoolean();
    }

    /*
        User Info
    */
    void userInformation()
    {
        System.out.print("\n Enter your name = ");
        user_name = input.nextLine();

        System.out.print("\n Enter your age = ");
        user_age = input.nextShort(); 

        System.out.print("\n Enter your weight = ");
        user_weight = input.nextFloat();

        System.out.print("\n Enter your height = ");
        user_height = input.nextFloat();
    }
    /*
        [ introduction function ]
    */
    void introduction()
    {
        System.out.println("\n\n { Welcome In FitForge } === \n\n we are care you health and fitness to provide you, require fitness shudule.but for that we need to give your current health and fitness information. Correct information improve your fitness shudule.\n\n\tmore about ...\n\n");
    }
    /*
        [ fitnessMotive ] : get fitness motive of user
    */ 
    void fitnessMotive()
    {
        System.out.println("\n"+
            "\n\n require your fitness motive:"+
            "\n\n Press [3] GERNAL FITNESS"+
            "\n\n Press [2] WEIGHT GAIN"+
            "\n\n Press [1] WEIGHT LOSS"+
            "\n\n Press [0] QUIT"
            "\n\n Please select once = "
            );
        
        user_motive = input.nextShort();

        switch (user_motive)
        {
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
    /*
        []
    */
    void fitnessLevel()
    {
        System.out.println("What is your fitness level: \n1 for Begginer\n2 for Intermediate \n3 for Advance");
        
        user_fitlevel = input.nextShort();
        
        switch (user_fitlevel)
        {
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
    /*
        [ main function ]=======================================
    */ 
    public static void main(String args[])
    {
        Main main = new Main();
        
        main.introduction();

        main.userInformation();

        user_bmi = main.bmiCal(user_weight, user_height);
        // System.out.printf("Your BMI is: %.2f", user_bmi);
        
        // System.out.println("\n----Step 2----");
        main.fitnessMotive();
        // System.out.println("\n----Step 3----");
        main.fitnessLevel();
    }
}