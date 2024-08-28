package br.com.Thiwoldrs.API_Rest_register.recordDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserRecordDto(
        UUID id,
        @NotBlank (message = "O nome não pode estar em branco") String nome,
        @NotBlank (message = "O email não pode estar em branco") String email,
        @NotNull(message = "A idade não pode estar em branco") Byte idade,
        @NotBlank (message = "O nome não pode estar em branco") String cpf,
        @NotNull (message = "O nome não pode estar em branco") boolean brasileiro_nativo
        ) {
}
