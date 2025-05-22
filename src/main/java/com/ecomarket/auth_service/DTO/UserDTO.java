package com.ecomarket.auth_service.DTO;

import com.ecomarket.auth_service.model.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String email;
    private String fullName;
    private User.Role role;
}
