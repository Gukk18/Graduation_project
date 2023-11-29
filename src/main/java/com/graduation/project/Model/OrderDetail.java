package com.graduation.project.Model;

import java.io.Serializable;



import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Orderdetails")
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "Productid")
    Product product;

    @ManyToOne
    @JoinColumn(name = "Orderid")
    Order order;

}
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "order_detail")
//public class Order_detail {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @JdbcTypeCode(SqlTypes.INTEGER)
//    private Integer id;
//
//    @Column(name = "price", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.FLOAT)
//    private String price;
//
//    @Column(name = "quantity", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.FLOAT)
//    private String quantity;
//
//}



