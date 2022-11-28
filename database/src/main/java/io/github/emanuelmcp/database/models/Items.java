package io.github.emanuelmcp.database.models;

import java.util.ArrayList;
import java.util.List;

public class Items {
    String nameItem;
    int durability;
    List<Enchantment> enchantments = new ArrayList<>();
}
