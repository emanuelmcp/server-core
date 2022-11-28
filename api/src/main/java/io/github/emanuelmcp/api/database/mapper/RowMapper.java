package io.github.emanuelmcp.api.database.mapper;

import org.jetbrains.annotations.NotNull;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper <T>{
    T rowReader(ResultSet rs) throws SQLException;

    void rowWriter(@NotNull T model, @NotNull PreparedStatement statement) throws SQLException;
}
