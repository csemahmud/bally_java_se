/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.bll;

import java.util.List;

import com.mahmud.SampleJDBCApp1Package.dal.StudentGateway;
import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class StudentManager {
	
	private StudentGateway aStudentGatewayObj = new StudentGateway();
	
	/**
	 * 
	 */
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}

	public String saveStudent(StudentDAO student){
		try {
			if(aStudentGatewayObj.insertStudent(student) > 0){
				return "Student " + student.getName()
						+ " has been SAVED successfully .";
			}
		} catch (MySQLSyntaxErrorException ex) {
			// TODO Auto-generated catch block
			
			System.out.println("\n\n\n\tCREATING TABLE ...... \n\t");
			
			aStudentGatewayObj.createTable();
			try {
				if(aStudentGatewayObj.insertStudent(student) > 0){
					return "Student " + student.getName()
							+ " has been SAVED successfully .";
				}
			} catch (MySQLSyntaxErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Could NOT save " + student.getName();
	}
	
	public List<StudentDAO> getAllStudents() {
		return aStudentGatewayObj.selectAllStudents();
	}
	
	public StudentDAO getStudentByName(String name) {
		return aStudentGatewayObj.selectStudent().byName(name);
	}

	public String editStudent(StudentDAO student){
		if(aStudentGatewayObj.updateStudentById(student) > 0){
			return "Student " + student.getName()
					+ " has been UPDATED successfully .";
		}
		return "Could NOT update " + student.getName();
	}

	public String removeStudent(StudentDAO student){
		if(aStudentGatewayObj.deleteStudentById(student.getStudent_id()) > 0){
			return "Student " + student.getName()
					+ " has been REMOVED successfully .";
		}
		return "Could NOT remove " + student.getName();
	}
}
