/**
 * 
 */
package com.bhuwan.spring.lifecycle.bean.declarative;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author bhuwan
 *
 */
public class Test {

    private String driverClass;
    private String url;
    private String username;
    private String password;
    private Connection con;

    // this will be executed from xml configuration
    public void init() throws Exception {
        Class.forName(driverClass);
        con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection opened : " + con.getClass());
        System.out.println(this.getClass().getName() + " init method called....");
    }

    // this will be executed from xml configuration
    public void destroy() throws Exception {
        con.close();
        System.out.println(this.getClass().getName() + " destroy method called....");
        System.out.println("Connection closed : " + con.getClass());
    }

    public void saveData(String name, String email, String address) throws SQLException {
        String sql =
                "create table if not exists user(id int(11) primary key auto_increment, name varchar(50) not null, email varchar(255) not null, address varchar(100))";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();

        sql = "insert into user(name, email, address) values(?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, address);
        ps.executeUpdate();

        System.out.println("Data inserted successfully.");
    }

    /**
     * @return the driverClass
     */
    public String getDriverClass() {
        return driverClass;
    }

    /**
     * @param driverClass
     *            the driverClass to set
     */
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
