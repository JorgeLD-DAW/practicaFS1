package model;

import validar.email;
import validar.codigo;
import validar.id;
import jakarta.validation.constraints.NotBlank;

public class empleoyee {

    @id
    int id;
    @NotBlank
    String name;
    @email
    String email;
    @codigo
    String empleoyeeCode;

    public empleoyee(int id, @NotBlank String name, String email, String empleoyeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.empleoyeeCode = empleoyeeCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getempleoyeeCode() {
        return empleoyeeCode;
    }

    public void setempleoyeeCode(String empleoyeeCode) {
        this.empleoyeeCode = empleoyeeCode;
    }
}
