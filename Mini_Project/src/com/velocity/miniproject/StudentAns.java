package com.velocity.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentAns {

	static int marks = 0;
	public void ans() throws SQLException {
		ConnectionTest connectionTest = new ConnectionTest();
		Connection con = null;
		con = connectionTest.getConnectionDetails();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Question answer");

		int ans1 = sc.nextInt();

		PreparedStatement pstmt = con.prepareStatement("select ans from questions where questions.sr_no=1");

		ResultSet rs = pstmt.executeQuery();
		
		
		
		
		while(rs.next())
		{
			int answer1=rs.getInt("ans");
			if(answer1==ans1)
			{
				marks++;
			}
			
			System.out.println(answer1);
		
		}
		System.out.println(marks);
		

	}
		
		
	}

