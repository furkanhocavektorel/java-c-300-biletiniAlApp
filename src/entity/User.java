package entity;

import enums.ERole;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Long TCKN;
    private String password;
    private LocalDateTime createdAt;
    private ERole role;

    public User() {
    }

    public User(Long id, String name, String surname, String email, String phone, Long TCKN, String password, LocalDateTime createdAt, ERole role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.TCKN = TCKN;
        this.password = password;
        this.createdAt = createdAt;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getTCKN() {
        return TCKN;
    }

    public void setTCKN(Long TCKN) {
        this.TCKN = TCKN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }
}
