import java.util.Scanner;
class Percentage
{
	float cal(int s1, int s2, int s3, int s4, int s5, int s6)
	{
		float total_percent = (float)(s1+s2+s3+s4+s5+s6)/6;
		return total_percent;
	}
}

class Grade
{
	String generate(float result, int[] marks)
	{
		// Check if any subject mark is less than 35
        for (int mark : marks) {
            if (mark < 35) {
                return "FAIL";
            }
        }
		
		String final_grade;
		if(result >= 70 && result <=100 )
		{
			final_grade = "DISTINCTION";
		}
		else if (result >= 60 && result <= 70)
		{
			final_grade = "FIRST CLASS";
		}
		else if (result >= 50 && result <= 60)
		{
			final_grade = "SECOND CLASS";
		}
		else if (result >= 35 && result <= 50)
		{
			final_grade = "THRID CLASS";
		}
		else
		{
			final_grade = "FAIL";
		}
		
		return final_grade;
	}
}

class DemoStudent 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("====Percentage====");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Telugu Marks");
		int tel = s.nextInt();
		
		System.out.println("Enter the Hindi Marks");
		int hin = s.nextInt();
		
		System.out.println("Enter the English Marks");
		int eng = s.nextInt();
		
		System.out.println("Enter the Maths Marks");
		int math = s.nextInt();
		
		System.out.println("Enter the Science Marks");
		int sci = s.nextInt();
		
		System.out.println("Enter the Social Marks");
		int soc = s.nextInt();
		
		//Using If-Else Condition's:
		if((tel >= 0 && tel <= 100)&&(hin >= 0 && hin <= 100)&&(eng >= 0 && eng <= 100)&&
			(math >= 0 && math <= 100)&&(sci >= 0 && sci <= 100)&&(soc >= 0 && soc <= 100))
		{
			//Using Array for All subjects:
			int[] marks = {tel, hin, eng, math, sci, soc};
			
			Percentage ob = new Percentage();
			float result = ob.cal(tel, hin, eng, math, sci, soc);
			System.out.println("The percentage of Six Subjects of the Student is " + result);
			//Final Grade
			Grade ob1 = new Grade();
			String finalGrade = ob1.generate(result, marks); 
			System.out.println("The final grade is: " + finalGrade);
		}
		else
		{
			System.out.println("====INVALID====");
		}
		
		
	}
}
