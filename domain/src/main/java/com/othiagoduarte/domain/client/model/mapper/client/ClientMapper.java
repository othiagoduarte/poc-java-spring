package com.othiagoduarte.domain.client.model.mapper.client;

import com.othiagoduarte.domain.client.model.entity.ClientEntity;
import com.othiagoduarte.domain.client.model.input.ClientInput;

public class ClientMapper {
    public static ClientEntity toEntity(ClientInput client) {
        return ClientEntity
                .builder()
                .cpf(client.getCpf())
                .name(client.getName())
                .build();
    }

}
