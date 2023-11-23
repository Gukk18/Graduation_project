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
//@Table(name = "product")
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @JdbcTypeCode(SqlTypes.INTEGER)
//    private Long id;
//
//    @Column(name = "name", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.NVARCHAR)
//    private String name;
//
//    @Column(name = "images")
////    @JdbcTypeCode(SqlTypes.VARCHAR)
//    private String images;
//
//    @Column(name = "price", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.FLOAT)
//    private Float price;
//
//    @Column(name = "quality", nullable = false, unique = true)
//    @JdbcTypeCode(SqlTypes.FLOAT)
//    private Float quality;
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "product_id")
//    private Set<Order_detail> order_details = new LinkedHashSet<>();
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "category_id")
//    private Category category;
//
//}



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;



@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String image;
    Double price;
    @Temporal(TemporalType.DATE)
    @Column(name = "Createdate")
    Date createDate = new Date();
    Boolean available;

    @ManyToOne
    @JoinColumn(name = "Categoryid")
    Category category;


}