package com.graduation.project.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer id;

    @Column(name = "username", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String username;

    @Column(name = "address", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.NVARCHAR)
    private String address;

    @Column(name = "date", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.DATE)
    private String date;



}