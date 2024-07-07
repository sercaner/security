package com.sercan.security.dto;

public record AuthRequest(
    String username,
    String password
) {
}
