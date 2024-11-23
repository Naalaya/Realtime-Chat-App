DROP TABLE IF EXISTS roles;

CREATE TABLE roles (
   id BIGSERIAL PRIMARY KEY,
   name VARCHAR(255) NOT NULL,
--     media: 'url image', for licence
   media VARCHAR(255),
--    status:{ '0: inactive; 1: active'; 2: blocked}
   status SMALLINT DEFAULT 0,
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   deleted_at TIMESTAMP
);

CREATE INDEX idx_id ON roles(id);
CREATE INDEX idx_status ON roles (status);