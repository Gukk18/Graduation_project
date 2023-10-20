package com.graduation.project.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "order_detail")
public class Order_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer id;

    @Column(name = "price", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.FLOAT)
    private String price;

    @Column(name = "quantity", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.FLOAT)
    private String quantity;

}