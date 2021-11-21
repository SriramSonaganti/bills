package com.example.bills.controller;

import com.example.bills.model.Bills;
import com.example.bills.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping()
public class BillsController {

    @Autowired
    BillsService billsService;

    //T0 GENERATE A NEW BILL
    @PostMapping("/CreateBill")
    public ResponseEntity createBill(@RequestBody Bills bills){
        billsService.generateBill(bills);
        return  new ResponseEntity("Billed",HttpStatus.OK);
    }

    //TO FETCH ALL THE BILLS
    @GetMapping("bills")
    public  ResponseEntity getBills(){
        return  new ResponseEntity<>(billsService.fetchBill(),HttpStatus.OK);
    }

    @GetMapping("/bills/{bill_number}")
    public  ResponseEntity<Bills> getBills(@PathVariable @RequestBody String bill_number){
        return new ResponseEntity<>(billsService.getByNumber(bill_number),HttpStatus.OK);
    }

    @GetMapping("/bills/due/{date}")
    public  ResponseEntity<List<Bills>> getBillsByDue(@PathVariable @RequestBody String date){
        return new ResponseEntity<>(billsService.getByDue(date),HttpStatus.OK);
    }

    //TEST ROUTE
    @GetMapping("")
    public  ResponseEntity get(){
        return  new ResponseEntity<>("Hello",HttpStatus.OK);
    }



}
