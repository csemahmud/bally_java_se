/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class StudentGateway extends RootGateway {

	private static final String TBL_STUDENT = "tbl_student";
	private static final String NAME = "name";
	private static final String AGE = "age";
	private static final String CGPA = "cgpa";
	private static final String S_CLASS = "s_class";
	private static final String STUDENT_ID = "student_id";

	private static final String HEADING_RAW = "SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";";
	
	private static final String CREATE_TABLE_RAW = "CREATE TABLE `" + TBL_STUDENT + "` ("
			+ "`" + STUDENT_ID + "` int(10) NOT NULL,"
			+ "`" + NAME + "` varchar(100) NOT NULL,"
			+ "	`" + AGE + "` int(3) NOT NULL,"
			+ "`" + CGPA + "` double NOT NULL,"
			+ "`" + S_CLASS + "` int(2) NOT NULL"
			+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
	
	private static final String PRIMARY_KEY_RAW = "ALTER TABLE `" + TBL_STUDENT + "`"
			  + " ADD PRIMARY KEY (`" + STUDENT_ID + "`);";
	private static final String ALTER_TABLE_RAW = "ALTER TABLE `" + TBL_STUDENT + "` "
			  + "MODIFY `" + STUDENT_ID + "` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;";
	


	
	/**
	 * 
	 */
	
	public StudentGateway() {
		// TODO Auto-generated constructor stub
	}

	public int createTable(){
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
			
			PreparedStatement headStatement = conn.prepareStatement(HEADING_RAW);
			headStatement.executeUpdate();
			
			PreparedStatement statement = conn.prepareStatement(CREATE_TABLE_RAW);
			statement.executeUpdate();
			
			PreparedStatement statement2 = conn.prepareStatement(PRIMARY_KEY_RAW);
			statement2.executeUpdate();
			
			PreparedStatement statement3 = conn.prepareStatement(ALTER_TABLE_RAW);
			return statement3.executeUpdate();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return -10;
	}

	public int insertStudent(StudentDAO student) throws MySQLSyntaxErrorException{
		String sql = "INSERT INTO " 
				+ TBL_STUDENT + " (" 
				+ NAME + ", " 
				+ AGE + ", " 
				+ CGPA + ", " 
				+ S_CLASS + ") VALUES (?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, Integer.toString(student.getAge()));
			statement.setString(3, Double.toString(student.getCgpa()));
			statement.setString(4, Integer.toString(student.getS_class()));
			return statement.executeUpdate();
			
		}
		catch(MySQLSyntaxErrorException ex) {
			ex.printStackTrace();
			throw ex;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return -10;
	}
	
	public List<StudentDAO> selectAllStudents() {
		List<StudentDAO> allStudents = new ArrayList<>();
		
		String sql = "SELECT * FROM " + TBL_STUDENT;
		
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				allStudents.add(new StudentDAO(
						result.getInt(1), result.getString(NAME), 
						result.getInt(3), result.getDouble(CGPA),
						result.getInt(S_CLASS)));
				
			}
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return allStudents;
	}
	
	
	public class SelectedStudent{
		
		public StudentDAO byPropertyValue(String property, String value) {
			
			String sql = "SELECT * FROM " + TBL_STUDENT + " WHERE " + property + " = '" + value + "'";
			
			try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
				
				Statement statement = conn.createStatement();
				ResultSet result = statement.executeQuery(sql);
				if(result.next()){
					return new StudentDAO(
							result.getInt(1), result.getString(NAME), 
							result.getInt(3), result.getDouble(CGPA),
							result.getInt(S_CLASS));
					
				}
				
			} catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
			return null;
		}
		
		public StudentDAO byName(String name) {
			return byPropertyValue(NAME, name);
		}
	}
	
	public SelectedStudent selectStudent() {
		return new SelectedStudent();
	}
	
	public int updateStudentById(StudentDAO student){
		String sql = "UPDATE " + TBL_STUDENT + " SET " + NAME + "=?, " + AGE + "=?, " 
				+ CGPA + "=?, " + S_CLASS + "=? WHERE " + STUDENT_ID + "=?";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, Integer.toString(student.getAge()));
			statement.setString(3, Double.toString(student.getCgpa()));
			statement.setString(4, Integer.toString(student.getS_class()));
			statement.setString(5, Integer.toString(student.getStudent_id()));
			return statement.executeUpdate();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return -10;
	}
	
	public int deleteStudentById(int student_id){
		String sql = "DELETE FROM " + TBL_STUDENT + " WHERE " + STUDENT_ID + "=?";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)){
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, Integer.toString(student_id));
			return statement.executeUpdate();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return -10;
	}
}
