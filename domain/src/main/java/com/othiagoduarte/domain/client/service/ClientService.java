package com.othiagoduarte.domain.client.service;

import com.othiagoduarte.domain.client.model.input.ClientInput;
import com.othiagoduarte.domain.client.model.mapper.client.ClientMapper;
import com.othiagoduarte.domain.client.repository.ClientRepository;

public class ClientService {
    private ClientRepository repository = new ClientRepository();
    public void save(ClientInput client) {
        repository.save(ClientMapper.toEntity(client));
    }
}
