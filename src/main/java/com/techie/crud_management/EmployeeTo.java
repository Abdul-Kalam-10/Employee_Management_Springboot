package com.techie.crud_management;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Builder
public class EmployeeTo {
    @Id
    private String id;
    private String empname;
    private String location;
    private BigDecimal salary;
}

