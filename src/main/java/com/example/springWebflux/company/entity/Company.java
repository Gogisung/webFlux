package com.example.springWebflux.company.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long id;

    public Company(Long id) {
        this.id = id;
    }

    private String name;

    @Embedded
    private Address address;

    @NotEmpty
    private String businessNum; // 사업자 번호
    private String totalSales; // 매출액, 투자금액

    private String employees;
    private String info;

    @Email
    private String email;

    @NotEmpty
    private String since;

    @NotEmpty
    private String phone;

    private String homepage;

    @AssertTrue
    private boolean terms;

}
