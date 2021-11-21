package com.example.bills.repository;

import com.example.bills.model.Bills;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BillsRepository extends MongoRepository<Bills,Long> {



   Bills findByNumber(String bill_number);

   List<Bills> findByDue(String due);


}
