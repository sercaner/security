package com.sercan.security.dto;

import com.sercan.security.model.Role;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateUserRequest(
    String name,
    String username,
    String password,
    Set<Role> authorities
) {
}
