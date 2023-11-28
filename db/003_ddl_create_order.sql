CREATE TABLE orders
(
    id                  SERIAL PRIMARY KEY,
    increase_amount     REAL,
    estate_type         VARCHAR(255),
    ears_building       INT,
    area_square         REAL,
    date_start          DATE,
    date_end            DATE,
    date_calculate      DATE,
    amount_award        BIGINT,
    policyholder_id     INT REFERENCES policyholders (id),
    estate_info_id      INT REFERENCES estate_info (id),
    number_order        VARCHAR(50) unique,
    date_register_order DATE,
    comment_for_order   TEXT
);