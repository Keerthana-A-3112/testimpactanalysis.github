package org.data;

public class User {

	    private String username;
	    private String email;
	    private String password;

	    // Constructor
	    public  User(String username, String email, String password) {
	        this.username = username;
	        this.email = email;
	        this.password = password;
	    }

	    // Getters and Setters
	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // Validates if email format is correct
	    public boolean isValidEmail() {
	        return email != null && email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
	    }

	    // Validates password strength
	    public boolean isStrongPassword() {
	        return password != null && password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
	    }
	}


