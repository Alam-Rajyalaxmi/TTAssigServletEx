package com.ass2.pack1;
import java.sql.*;
public class SelectBasedOnInitChar {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","userN","psw");
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from employee where name like 'Ja%' ");
			while(res.next())
			{
				System.out.println(res.getInt(1)+"    "+res.getString(2)+"   "+res.getString(3)+"\t\t"+res.getBigDecimal(4)+"\t\t"+res.getString(5));
			}
		}catch(Exception e) {
			System.out.println(e);
		}

   }
}
