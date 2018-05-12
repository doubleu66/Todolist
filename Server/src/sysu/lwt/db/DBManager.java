package sysu.lwt.db;

import java.sql.*;   

public class DBManager {
    
    public static Connection getConnection() {
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
	    	System.out.println("Success loading Mysql Driver!");
	    } catch (Exception e) {
	    	System.out.print("Error loading Mysql Driver!");
	    	e.printStackTrace();
	    }
	    try {
	    	Connection connect = DriverManager.getConnection(
	    			"jdbc:mysql://localhost:3306/db_test","root","7758");
	        //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

	    	System.out.println("Success connect Mysql server!");
	    	return connect;
	    } catch (Exception e) {
	    	System.out.print("get data error!");
	    	e.printStackTrace();
	    	return null;
	    }
    }
    
    
}
