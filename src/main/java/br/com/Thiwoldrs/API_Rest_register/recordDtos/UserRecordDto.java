package br.com.Thiwoldrs.API_Rest_register.recordDtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(
        @NotBlank (message = "O nome não pode estar em branco") String nome,
        @NotBlank (message = "O email não pode estar em branco") String email,
        @NotBlank (message = "A idade não pode estar em branco") Byte idade,
        @NotBlank (message = "O nome não pode estar em branco") String cpf
        ) {
}
