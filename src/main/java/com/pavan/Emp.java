package com.pavan;


import com.datastax.driver.core.DataType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.mapping.CassandraType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.time.LocalDate;



@Table("emp")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Emp {

    @PrimaryKey
    private int empId;
    private String empName;

    @Column("dateCom")
    @CassandraType(type = DataType.Name.DATE)
    private LocalDate dateCom;


    public Emp() {
    }

    public Emp(int empId, String empName, LocalDate dateCom) {
        this.empId = empId;
        this.empName = empName;
        this.dateCom = dateCom;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getDateCom() {
        return dateCom;
    }

    public void setDateCom( LocalDate dateCom) {
        this.dateCom = dateCom;
    }
}
