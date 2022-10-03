package rlouol.example.jooqexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AccountEntity {
    @Column
    private String username;
    @Column
    private String email;
    public AccountEntity() {}

    public AccountEntity(String username, String email) {
        setUsername(username);
        setEmail(email);
    }

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
}
