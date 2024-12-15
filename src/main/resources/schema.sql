CREATE TABLE category (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(50) NOT NULL
);

CREATE TABLE inventory (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           stock INT NOT NULL CHECK (stock >= 0)
);

CREATE TABLE product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         category_id BIGINT NOT NULL,
                         inventory_id BIGINT NOT NULL,
                         CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES category(id),
                         CONSTRAINT fk_inventory FOREIGN KEY (inventory_id) REFERENCES inventory(id)
);
