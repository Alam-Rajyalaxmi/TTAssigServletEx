package com.ass2.pack1;
import java.sql.*;

public class JDBCSelectByOrder {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/emp";
		String user="userN"; //userName of your database(mysql,oracle..etc) 
		String psw="password"; //password of your database(mysql,oracle..etc) 
		try {
			Connection con=DriverManager.getConnection(url,user,psw);
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from employee order by salary");
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t\t"+res.getString(3)+"\t\t"+res.getBigDecimal(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
