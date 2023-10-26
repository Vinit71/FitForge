import java.util.Scanner;

public class Main{
    // Variables
    String user_name;
    short user_age;
    static float user_weight;
    static float user_height;
    static double user_bmi;

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
public static void main(String st[]){
    Main main = new Main(); //Decalring object

    main.userinfo();
    user_bmi = main.bmiCal(user_weight, user_height);
    System.out.printf("Your BMI is: %.2f", user_bmi);
}

}