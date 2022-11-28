package io.github.emanuelmcp.database.mappers;

import com.google.inject.Singleton;
import io.github.emanuelmcp.api.database.mapper.RowMapper;
import io.github.emanuelmcp.database.models.Skill;
import org.jetbrains.annotations.NotNull;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Singleton
public class SkillMapper implements RowMapper<Skill> {

    @Override
    public Skill rowReader(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public void rowWriter(@NotNull Skill model, @NotNull PreparedStatement statement) throws SQLException {

    }
}
