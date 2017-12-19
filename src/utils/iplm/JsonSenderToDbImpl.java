package utils.iplm;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import models.java.Topics;
import utils.JsonSenderToDb;

public class JsonSenderToDbImpl implements JsonSenderToDb{

	@Override
	public void topicsToDb() {
	   
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        Topics topic = new Topics();
	    	long id;
	    	long docTagId;
	    	String title;
	    	String answer; // "RemarksMarkdown" in DTO
	    	Date creationDate;
	    	Date lastEditDate;
	        try {
	            connection = getConnection();
	            String insertstudents = "INSERT  INTO topics ( id, docTagId, title, answer, creationDate, lastEditDate,)  VALUES (?,?,?,?,?,?)";

	            preparedStatement = connection.prepareStatement(insertstudents);
	            preparedStatement.setLong(1, topic.getId());	
	            //TODO lol
	            preparedStatement.executeUpdate();
	         
	        } catch (SQLException ex) {
	            System.out.println("klaida " + ex);

	        } finally {
	            if (preparedStatement != null) try {
	                preparedStatement.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            if (connection != null) try {
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
	    }
		
	

	@Override
	public void examplesToDb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void docTagsToDb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void docTagsVersionsToDb() {
		// TODO Auto-generated method stub
		
	}
	
    private static Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName("org.postgresql.Driver");    // posgresql
        connection  =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",  "postgres", "student");

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return connection;
}
	
}
