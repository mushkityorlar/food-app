package uz.pdp.pdpfoodapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Role {
    ADMIN("admin"),
    EMPLOYEE("employee"),
    DELIVERY("delivery");

    private String name;
}
