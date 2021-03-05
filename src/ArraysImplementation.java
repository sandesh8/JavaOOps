class Student
{
	String name;
	int[] marks;
	public Student(String name, int[] marks)
	{
		this.name = name;
		this.marks = marks;
	}
	
	public void NumberofMarks()
	{
		System.out.println(marks.length);
	}
	
	public void TotalSumofMarks()
	{
		int sum = 0;
		for(int summing:marks)
		{
			sum = sum + summing;
		}
		System.out.println(sum);
	}
	
	public void MaximumMarks()
	{
		int max=0;
		 
		for(int mark:marks)
		{
			if(max < mark) {
				max = mark;
			
			}
		}
		System.out.println(max);
	}
	
	public void MinimumMarks()
	{
		int min=Integer.MAX_VALUE;
		 
		for(int markk:marks)
		{
			if(min > markk) {
				min = markk;
			
			}
		}
		System.out.println(min);
	}
	
	public void Average()
	{
		int sum = 0;
		for(int summing:marks)
		{
			sum = sum + summing;
			int avg = sum/(marks.length);
			System.out.println(avg);
		}
	}
}
public class ArraysImplementation {

	public static void main(String[] args) {
		
		int[] marks = {45, 89, 23, 68, 12};
		
		Student student = new Student("Ravi", marks);
		student.NumberofMarks();
		student.TotalSumofMarks();
		student.MinimumMarks();
		student.MaximumMarks();
		student.Average();
		
		// TODO Auto-generated method stub
      
	}

}
