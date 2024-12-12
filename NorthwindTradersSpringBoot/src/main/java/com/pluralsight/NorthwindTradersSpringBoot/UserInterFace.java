package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component // Saying that the user interface is a bean
public class UserInterFace {
   ProductDao productDao;

   @Autowired
    public UserInterFace(ProductDao productDao){
        this.productDao = productDao;

    }
    public void display(){
        Scanner s = new Scanner(System.in);

        boolean looping = true;

        while (looping){
            System.out.println("""
                    Welcome
                    1. List employees
                    2. Add employee
                    0. Exit
                    
                    """);
            String uInput  = s.nextLine();
            switch (uInput){
                case "1" -> {
                    listEmployees();
                }
                case "2" -> {
                    addEmployee();
                }
                case "0" -> {
                }
                default -> {
                    System.out.println("Please the number 1 or 2 ");
                }
            }
        }

    }

    private void addEmployee() {
    }

    private void listEmployees() {
    }
}
