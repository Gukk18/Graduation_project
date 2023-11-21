package com.graduation.project.Model;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.type.SqlTypes;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "category")
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @JdbcTypeCode(SqlTypes.INTEGER)
//    private Integer id;
//
//    @Column(name = "name_category", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String name_category;
//
//    @Column(name = "description", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String description;
//
////    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
////    @JoinColumn(name = "category_id")
////    private Set<Product> products = new LinkedHashSet<>();
//
//
////relationship
//
//
//
//
//}

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable {

    @Id
    String id;
    String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    List<Product> products;

}