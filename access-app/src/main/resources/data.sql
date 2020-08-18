DROP TABLE IF EXISTS access CASCADE;

CREATE TABLE access
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    door_id     INT NOT NULL
);