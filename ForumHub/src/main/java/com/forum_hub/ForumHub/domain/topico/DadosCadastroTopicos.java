package com.forum_hub.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {


}
