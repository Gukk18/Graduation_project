package com.graduation.project.Model;

import java.io.Serializable;
import jakarta.persistence.*;


import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Authorities", uniqueConstraints = { @UniqueConstraint(columnNames = { "Username", "Roleid" }) })
public class Authorities implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Username")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "Roleid")
    private Role role;
}
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
//@Table(name = "authorities")
//public class Authorities {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    @JdbcTypeCode(SqlTypes.INTEGER)
//    private Integer id;
//
//
//
//
//
//}