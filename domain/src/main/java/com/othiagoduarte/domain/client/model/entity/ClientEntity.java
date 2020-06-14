package com.othiagoduarte.domain.client.model.entity;

import lombok.Builder;

@Builder
public class ClientEntity {
    public String cpf;
    public Long id;
    public String name;
}
