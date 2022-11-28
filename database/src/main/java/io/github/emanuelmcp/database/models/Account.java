package io.github.emanuelmcp.database.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Builder
public class Account implements Serializable {
    private String uuid;
    private String email;
    private String password;
    private Date lastLogin;
    private Boolean banned;
    private Integer kills;
    private Integer deaths;
    private Long brokenBlocks;
    private Double balance;
    private Double health;
    private int idSkill;
    private int idBackpack;
}
