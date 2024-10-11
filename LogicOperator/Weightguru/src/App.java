import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {   
        Scanner sc = new Scanner(System.in);
        float weight, height;

        System.out.println("Enter weight in KGH : ");
        weight=sc.nextFloat();

        System.out.println("Enter Height in Feet : ");
        height=0.3048f*(sc.nextFloat());

        float BMI=calcBMI(weight, height); 
        String result=AnalyseBMI(BMI);

        System.out.println("Result is -----------> "+result);
        System.out.println("BMI is -----------> "+BMI);
    }
    public static float calcBMI(float w, float h)
    {
          return w/(h*h);
    }
    public static String AnalyseBMI(float BMI)
    {
        if(BMI<18.5)
        {
            return "underweight";
        }
        else if(BMI>=18.5 && BMI < 24.9)
        {
            return "normalweight";
        }
        else if(BMI>=25.0 && BMI < 29.9)
        {
            return "overweight";
        }
        else
        {
            return "OBSE";
        }
    }
    
}
