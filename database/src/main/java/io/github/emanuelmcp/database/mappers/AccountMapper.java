package io.github.emanuelmcp.database.mappers;

import com.google.inject.Singleton;
import io.github.emanuelmcp.api.database.mapper.RowMapper;
import io.github.emanuelmcp.database.models.Account;
import org.jetbrains.annotations.NotNull;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Singleton
public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account rowReader(ResultSet rs) throws SQLException {
        //TODO he puesto uuid
        return Account.builder()
                .uuid(rs.getString("uuid"))
                .email(rs.getString("email"))
                .password(rs.getString("password"))
                .lastLogin(rs.getDate("last_login"))
                .banned(rs.getBoolean("banned"))
                .kills(rs.getInt("kills"))
                .deaths(rs.getInt("deaths"))
                .brokenBlocks(rs.getLong("broken_block"))
                .balance(rs.getDouble("balance"))
                .health(rs.getDouble("health"))
                .idSkill(rs.getInt("id_skill"))
                .idBackpack(rs.getInt("id_backpack"))
                .build();
    }
    @Override
    public void rowWriter(@NotNull Account model, @NotNull PreparedStatement statement) throws SQLException {
        //TODO falta uuid
        statement.setString(1, model.getEmail());
        statement.setString(2, model.getPassword());
        statement.setDate(3, new Date(model.getLastLogin().getTime()));
        statement.setBoolean(4, model.getBanned());
        statement.setInt(5, model.getKills());
        statement.setInt(6, model.getDeaths());
        statement.setLong(7, model.getBrokenBlocks());
        statement.setDouble(8, model.getBalance());
        statement.setDouble(9, model.getHealth());
        statement.setInt(10, model.getIdSkill());
        statement.setInt(11, model.getIdBackpack());
    }
}
