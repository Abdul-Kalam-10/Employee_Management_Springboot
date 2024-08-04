package com.techie.crud_management.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "employee")
@Data
@Builder
public class Employee {
    private String id;
    private String empname;
    private String location;
    private BigDecimal salary;

}
