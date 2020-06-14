package com.othiagoduarte.domain.client.model.output;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientOutput {
    public String cpf;
    public Long id;
    public String name;
}
