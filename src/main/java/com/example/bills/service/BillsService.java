package com.example.bills.service;


import com.example.bills.model.Bills;
import com.example.bills.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillsService {

    @Autowired
    BillsRepository billsRepository;

    public void generateBill(Bills bills){
        billsRepository.save(bills);
    }

    public List<Bills> fetchBill(){
        List<Bills> bill = billsRepository.findAll();
        return bill;
    }

    public Bills getByNumber(String bill_number){
        Bills bill = billsRepository.findByNumber(bill_number);
        return bill;
    }

    public Bills getByDue(String date){
        Bills bill = billsRepository.findByDue(date);
        return bill;
    }






}
