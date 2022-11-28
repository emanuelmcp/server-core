CREATE TABLE IF NOT EXISTS account(
    uuid VARCHAR(36) PRIMARY KEY,
    nick VARCHAR(50),
    email VARCHAR(70) UNIQUE,
    password VARCHAR(30),
    last_login DATE,
    banned BOOLEAN
);
CREATE TABLE IF NOT EXISTS account_type(
    role_id SERIAL PRIMARY KEY,
    group_name VARCHAR(50),
    description VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS permissions(
    permission_id SERIAL PRIMARY KEY,
    permission_name VARCHAR(50),
    description VARCHAR(100),
    CONSTRAINT backpack_fk FOREIGN KEY(id_backpack) REFERENCES backpack(id_backpack),
    CONSTRAINT skills_fk FOREIGN KEY(id_skill) REFERENCES skills(id_skill)
);
CREATE TABLE IF NOT EXISTS role_account(
    account_uuid VARCHAR(36) PRIMARY KEY,
    role_id INT PRIMARY KEY,

);
CREATE TABLE IF NOT EXISTS account_type_permission(
    account_uuid VARCHAR(36) PRIMARY KEY,
    permission_id INT PRIMARY KEY
);

