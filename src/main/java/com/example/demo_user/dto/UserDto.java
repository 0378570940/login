package com.example.demo_user.dto;

import com.example.demo_user.entities.UserNameEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDto {
    long id;
    @NotBlank(message = "Không được phép rỗng")
    @Size(message = "nhập ít nhất 6 ký tự", min =6)
    String username;
    @NotBlank(message = "Không được phép rỗng")
    @Size(message = "nhập ít nhất 6 ký tự", min =6)
    String password;
    String email;
    public UserNameEntity mapperEntity(){
        UserNameEntity userNameEntity =new UserNameEntity();
        userNameEntity.setId(id);
        userNameEntity.getUsename(username);
        userNameEntity.getPassword(password);
        userNameEntity.getEmail(email);
        return userNameEntity;
    }
}
