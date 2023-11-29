package com.graduation.project.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "Createdate")
    Date createDate = new Date();

    @ManyToOne
    @JoinColumn(name = "username")
    Account account;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;
}

//package com.graduation.project.Model;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//@Getter
//@Setter
//@Entity
//@Table(name = "orders")
//public class Orders {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @JdbcTypeCode(SqlTypes.INTEGER)
//    private Integer id;
//
//    @Column(name = "username", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String username;
//
//    @Column(name = "address", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String address;
//
//    @Column(name = "date", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.DATE)
//    private String date;
//
//
//
//}
