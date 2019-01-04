/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package;

import java.util.List;

import com.mahmud.SampleJDBCApp1Package.bll.StudentManager;
import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class MainProgram {
	
	private static StudentManager aStudentManagerObj = new StudentManager();
	private static List<StudentDAO> allStudents;
	private final static String MAHMUD = "MAHMUD";
	private final static String ALIA = "Alia";
	private final static String KAREENA = "Kareena";
	private final static String NAILA = "Naila";

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n\n\t" + aStudentManagerObj.saveStudent(
				new StudentDAO(MAHMUD, 25, 3.98, 10)));
		System.out.println("\t" + aStudentManagerObj.saveStudent(
				new StudentDAO(ALIA, 20, 3.02, 8)));
		System.out.println("\t" + aStudentManagerObj.saveStudent(
				new StudentDAO(KAREENA, 22, 3.12, 9)));
		if(aStudentManagerObj.getStudentByName("Naila") == null) {
			System.out.println("\t" + aStudentManagerObj.saveStudent(
					new StudentDAO(NAILA, 20, 3.98, 10)));
		}
		
		allStudents = aStudentManagerObj.getAllStudents();
		
		printStudents();
		System.out.println();
		
		allStudents.stream().forEach(student->{
			
			switch(student.getName()){
		    
		    case MAHMUD:
		    	student.setCgpa(4.00);
			    System.out.println("\t" + aStudentManagerObj.editStudent(student));
		    	break;
		    case ALIA:
		    	student.setAge(21);
			    System.out.println("\t" + aStudentManagerObj.editStudent(student));
		    	break;
		    case KAREENA:
		    	student.setS_class(10);
			    System.out.println("\t" + aStudentManagerObj.editStudent(student));
		    	break;
		    
		    }
			
		});
		
		allStudents = aStudentManagerObj.getAllStudents();
		printStudents();
		
		allStudents.stream().forEach(student->{
			
			if(student.getName().equals(KAREENA)){
		    	System.out.println("\t" + aStudentManagerObj.removeStudent(student));
		    }
			
		});
		
		allStudents = aStudentManagerObj.getAllStudents();
		printStudents();
		
		allStudents.stream().forEach(student->{
			
			if(student.getName().equals(MAHMUD)){
		    	System.out.println("\t" + aStudentManagerObj.removeStudent(student));
		    } else if(student.getName().equals(ALIA)){
		    	System.out.println("\t" + aStudentManagerObj.removeStudent(student));
		    }
			
		});
		
		allStudents = aStudentManagerObj.getAllStudents();
		printStudents();
	}

	private static void printStudents() {
		// TODO Auto-generated method stub
		
		if((allStudents != null)&&(allStudents.size() > 0)) {
			System.out.println("\n\tToal " + allStudents.size() + " students are : ");
			StringBuilder builder = new StringBuilder();
			builder.append("\t").append("id")
					.append("\t").append("NAME").append("\t").append("AGE")
					.append("\t").append("CGPA").append("\t")
					.append("S_CLASS");
			System.out.println(builder);

			allStudents.stream().forEach(student->{
				
				System.out.println(student);
				
			});
			
		} else {
			System.out.println("\n\tNo student to Show .");
		}
		System.out.println();
	}

}
