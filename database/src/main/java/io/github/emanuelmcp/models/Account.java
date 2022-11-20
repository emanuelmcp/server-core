package io.github.emanuelmcp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name= "account")
@Singleton
public class Account implements Serializable {

    @Id
    @Column(name = "uuid")//TODO qutiar autoincr y poner uuid
    private int uuid;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "is_banned")
    private Boolean banned;

    @Column(name = "kills")
    private Integer kills;

    @Column(name = "deaths")
    private Integer deaths;

    @Column(name = "broken_blogs")
    private Long brokenBlocks;

    @Column(name = "balance")
    private Double balance;

    @Column(name = "health")
    private Double health;

    @Column(name = "id_skill")
    private Integer idSkill;

    @Column(name = "id_backpack")
    private Integer idBackpack;
}
