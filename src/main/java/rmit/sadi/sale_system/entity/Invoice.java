package rmit.sadi.sale_system.entity;

import java.time.LocalDate;

public class Invoice {
    int id;
    LocalDate date;
    Staff staff;
    Customer customer;
    double total;
}
