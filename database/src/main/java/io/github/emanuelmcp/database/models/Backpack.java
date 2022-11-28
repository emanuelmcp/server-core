package io.github.emanuelmcp.database.models;

import java.util.HashSet;
import java.util.Set;

public class Backpack {
    Integer idBackpack;
    String backpackName;
    Set<BackpackItems> backpackItems = new HashSet<>();
}
