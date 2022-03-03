package uz.pdp.pdpfoodapp.dto.user;

import lombok.*;
import uz.pdp.pdpfoodapp.dto.GenericDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserUpdateDto extends GenericDto {
    private String username;

    private String fullName;

    private String phoneNumber;

    private String language;

    @Builder(builderMethodName = "childBuilder")
    public UserUpdateDto(Long id, String username, String fullName, String phoneNumber, String language) {
        super(id);
        this.username = username;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.language = language;
    }
}
