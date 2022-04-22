package com.company;

import helper.JDBC;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JDBC.openConnection();
        // code goes in hger good idea to do what you need from database and then close

        JDBC.closeConnection();
    }
}
