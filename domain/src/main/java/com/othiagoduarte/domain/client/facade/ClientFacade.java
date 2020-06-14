package com.othiagoduarte.domain.client.facade;

import com.othiagoduarte.domain.client.model.input.ClientInput;
import com.othiagoduarte.domain.client.service.ClientService;

public class ClientFacade {

    public ClientService service = new ClientService();

    public void save(ClientInput client) {
        service.save(client);
    }

}
