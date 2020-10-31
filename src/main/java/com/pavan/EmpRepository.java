package com.pavan;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Emp,Integer> {

}