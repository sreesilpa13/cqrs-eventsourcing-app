package com.cqrs.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cqrs.entities.AccountQueryEntity;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
