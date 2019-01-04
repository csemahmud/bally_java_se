/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.dal;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class RootGateway {
	
	protected final String SERVER;
	protected final String DATABASE;
	protected final String DBURL;
	protected final String USERNAME;
	protected final String PASSWORD;

	/**
	 * 
	 */
	public RootGateway() {
		// TODO Auto-generated constructor stub
		
		SERVER = "localhost";
		DATABASE = "db_test_1113";
		DBURL = "jdbc:mysql://" + SERVER + "/" + DATABASE;
		USERNAME = "root";
		PASSWORD = "";
	}

}
