package uz.pdp.pdpfoodapp.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.dto.Dto;
import uz.pdp.pdpfoodapp.entity.audit.Department;

@Getter
@Setter
@NoArgsConstructor

public class UserCreateDto implements Dto {
    private String username;

    private String password;

    private String fullName;

    private String phoneNumber;

    private String language;

    private Department department;

    private String chatId;


}
