CREATE TABLE IF NOT EXISTS guest (
    uuid VARCHAR(36) PRIMARY KEY NOT NULL,
    actual_name VARCHAR(255) NOT NULL,
    name VARCHAR(255),
    phone VARCHAR(20),
    companion INTEGER,
    attending BOOLEAN
);

CREATE TABLE IF NOT EXISTS uninvited_guest (
     id SERIAL PRIMARY KEY,
     name VARCHAR(255),
     phone VARCHAR(20),
     companion INTEGER,
     attending BOOLEAN
);