package Test;

import java.io.*;
import java.sql.*;


public class JDBC_Ex2 {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:13306/sampledb", "hr3", "1234");
			System.out.println("DB ���� �Ϸ�");
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from student");
			printData(srs, "name", "id", "dept");
			srs = stmt.executeQuery("select name, id, dept from student where name='�̱���'");
			printData(srs, "name", "id", "dept");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");

		}

	}

	private static void printData(ResultSet srs, String col1, String col2, String col3)
			throws SQLException {
			while (srs.next()) {
			if (!col1.equals(""))
			System.out.print(srs.getString("name"));
			if (!col2.equals(""))
			System.out.print("\t|\t" + srs.getString("id"));
			if (!col3.equals(""))
			System.out.println("\t|\t" + srs.getString("dept"));
			else 
			System.out.println();
			}
			}
}