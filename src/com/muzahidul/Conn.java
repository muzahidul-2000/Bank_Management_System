package com.muzahidul;

import java.sql.*;
import java.util.Properties;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        Properties p=new Properties();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem",p.getProperty("user"),System.getenv("MySQL_PASS"));
            s =c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
