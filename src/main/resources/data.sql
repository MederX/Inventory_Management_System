-- Insert categories
INSERT INTO category (name) VALUES ('Electronics');
INSERT INTO category (name) VALUES ('Groceries');

-- Insert inventory records
INSERT INTO inventory (stock) VALUES (100);
INSERT INTO inventory (stock) VALUES (50);

-- Insert products
INSERT INTO product (name, category_id, inventory_id) VALUES ('Smartphone', 1, 1);
INSERT INTO product (name, category_id, inventory_id) VALUES ('Laptop', 1, 2);
