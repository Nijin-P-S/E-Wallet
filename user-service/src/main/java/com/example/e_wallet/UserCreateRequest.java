package com.example.e_wallet;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateRequest {

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    private String phone;

    @NotNull
    private String country;

    @NotNull
    private String nationalID;

    private String password;

    @CreationTimestamp
    private Date createdOn;

    public User to(){
        return User.builder()
                .name(this.name)
                .email(this.email)
                .phone(this.phone)
                .country(this.country)
                .nationalID(this.nationalID)
                .password(this.password)
                .build();
    }
}
