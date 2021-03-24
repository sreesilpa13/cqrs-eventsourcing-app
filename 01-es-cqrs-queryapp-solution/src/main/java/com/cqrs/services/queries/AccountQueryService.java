package com.cqrs.services.queries;

import java.util.List;

import com.cqrs.entities.AccountQueryEntity;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
