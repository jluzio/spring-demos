package com.example.liquibase.tools.repository;

import com.example.liquibase.tools.entity.Databasechangelog;
import com.example.liquibase.tools.entity.DatabasechangelogId;
import org.springframework.data.repository.CrudRepository;

public interface DatabaseChangeLogRepository extends CrudRepository<Databasechangelog, DatabasechangelogId> {

}
