/**
 * 
 */
package com.bhuwan.spring.di.propertiesdi;

import java.sql.Connection;
import java.sql.DriverManager;
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

    public void createConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driverClass);
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Database product name: " + con.getMetaData().getDatabaseProductName());
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
