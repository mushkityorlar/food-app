package uz.pdp.pdpfoodapp.dto.user;

import lombok.*;
import uz.pdp.pdpfoodapp.dto.GenericDto;
import uz.pdp.pdpfoodapp.entity.audit.Department;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto extends GenericDto {
    private String username;

    private String fullName;

    private String phoneNumber;

    private String language;

    private Department department;

    private boolean active;

    private boolean blocked;
}
