package com.forum_hub.ForumHub.domain.infra.exception;

public class ValidacaoException extends RuntimeException {
    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
