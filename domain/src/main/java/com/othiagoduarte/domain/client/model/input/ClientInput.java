package com.othiagoduarte.domain.client.model.input;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientInput {
    public String cpf;
    public Long id;
    public String name;
}
