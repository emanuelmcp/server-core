package io.github.emanuelmcp.database.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Skill implements Serializable {
    int idSkill;
    String name;
}
