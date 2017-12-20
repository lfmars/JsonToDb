package utils.iplm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import models.java.DocTags;
import models.java.DocTagsVersions;
import models.java.Examples;
import models.java.Topics;
import utils.JsonSenderToDb;

public class JsonSenderToDbImpl implements JsonSenderToDb{

	@Override
	public void topicsToDb(Topics topic) {
	   
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	         
	    
	        try {
	            connection = getConnection();
	            String insertTopic = "INSERT  INTO topics ( id, docTagId, title, answer, creationDate, lastEditDate,)  VALUES (?,?,?,?,?,?)";
	            preparedStatement = connection.prepareStatement(insertTopic);	        
	            preparedStatement.setLong(1,topic.getId());
	            preparedStatement.setLong(2,topic.getDocTagId());
	            preparedStatement.setString(3,topic.getTitle());
	            preparedStatement.setString(4, topic.getAnswer());
	            preparedStatement.setDate(5, (java.sql.Date) topic.getCreationDate());
	            preparedStatement.setDate(6, (java.sql.Date) topic.getLastEditDate());
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
	public void examplesToDb(Examples example) {
			Connection connection = null;
	        PreparedStatement preparedStatement = null;
	         
	    
	        try {
	            connection = getSqLiteConnection();
	            String insertExample = "INSERT  INTO examples ( id, docTopicId, title, description, creationDate, lastEditDate)  VALUES (?,?,?,?,?,?)";
	            preparedStatement = connection.prepareStatement(insertExample);
	            preparedStatement.setLong(1,example.getId());
	            preparedStatement.setLong(2,example.getDocTopicId());
	            preparedStatement.setString(3,example.getTitle());
	            preparedStatement.setString(4, example.getDescription());
	            preparedStatement.setDate(5, (java.sql.Date) example.getCreationDate());
	            preparedStatement.setDate(6, (java.sql.Date) example.getLastEditDate());     	            
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
	public void docTagsToDb(DocTags dokTag) {
		Connection connection = null;
        PreparedStatement preparedStatement = null;
         
    
        try {
            connection = getSqLiteConnection();
            String insertTopic = "INSERT  INTO docTags ( id, title, creationDate)  VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(insertTopic);
            preparedStatement.setLong(1,dokTag.getId());
            preparedStatement.setString(2,dokTag.getTitle());
            preparedStatement.setDate(5, (java.sql.Date) dokTag.getCreationDate());
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
	public void docTagsVersionsToDb(DocTagsVersions docTagVersion) {
		Connection connection = null;
        PreparedStatement preparedStatement = null;
         
    
        try {
            connection = getSqLiteConnection();
            String insertTopic = "INSERT  INTO docTagsVersions ( id, docTagId, title, creationDate, lastEditDate,)  VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(insertTopic);
            preparedStatement.setLong(1,docTagVersion.getId());
            preparedStatement.setLong(2, docTagVersion.getDoctagid());
            preparedStatement.setString(2,docTagVersion.getTitle());
            preparedStatement.setDate(5, (java.sql.Date) docTagVersion.getCreationDate());
            preparedStatement.setDate(6, (java.sql.Date) docTagVersion.getLastEditDate()); 
            
            
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
    
	public Connection getSqLiteConnection() {
		 Connection conn = null;
	        try {
	            String url = "jdbc:sqlite:C:\\Users\\MariusP\\Desktop\\sql\\SQLiteStudio\\sqliteTest.db";
	            conn = DriverManager.getConnection(url);
	            
	            System.out.println("Connection to SQLite has been established.");
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }	
	        return conn;
	}
	
	
}
