package main.java.com.erenkov.aleksandr.se2.model.entity;

import java.util.Objects;
import java.util.Set;

//@Entity
public class User {

//    @id
    private Long id;

//    @Column
//    @Unique
//    @NotNull
    private String telephoneNumber;

//    @Column
//    @Unique
    private String email;

//    @Column
    private String encryptedPassword;

//    @Column
    private String firstName;

//    @Column
    private String lastName;

//    @Column
//    @ManyToMany
    private Set<Role> roles;

    public User() {
    }

    public User(Long id, String telephone, String email, String encryptedPassword, String firstName, String lastName, Set<Role> roles) {
        this.id = id;
        this.telephoneNumber = telephone;
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephoneNumber;
    }

    public void setTelephone(String telephone) {
        this.telephoneNumber = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                telephoneNumber.equals(user.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, telephoneNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roles=" + roles +
                '}';
    }
}
