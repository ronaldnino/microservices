package org.corpotic.core.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Niño Ronald
 */
@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String userName;

    public User() {
    }
    
    public User(String fullName, String email, String password, String userName) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
    
    

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format(
                "User[id=%d, fullName='%s', email='%s']",
                id, fullName, email);
    }
    
    
}
