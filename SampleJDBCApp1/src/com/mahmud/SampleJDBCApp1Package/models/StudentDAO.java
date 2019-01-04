/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.models;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class StudentDAO {
	
	private int student_id;
	private String name;
	private int age;
	private double cgpa;
	private int s_class;

	/**
	 * @param student_id
	 * @param name
	 * @param age
	 * @param cgpa
	 * @param s_class
	 */
	public StudentDAO(int student_id, String name, int age, double cgpa,
			int s_class) {
		this(name, age, cgpa, s_class);
		this.student_id = student_id;
	}

	/**
	 * @param name
	 * @param age
	 * @param cgpa
	 * @param s_class
	 */
	public StudentDAO(String name, int age, double cgpa, int s_class) {
		this();
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
		this.s_class = s_class;
	}

	/**
	 * 
	 */
	public StudentDAO() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	/**
	 * @return the s_class
	 */
	public int getS_class() {
		return s_class;
	}

	/**
	 * @param s_class the s_class to set
	 */
	public void setS_class(int s_class) {
		this.s_class = s_class;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\t").append(student_id)
				.append("\t").append(name).append("\t").append(age)
				.append("\t").append(cgpa).append("\t")
				.append(s_class);
		return builder.toString();
	}

}
