CREATE TABLE estate_info
(
    id             SERIAL PRIMARY KEY,
    state          VARCHAR(255),
    index          VARCHAR(50),
    region         VARCHAR(255),
    district       VARCHAR(255),
    city           VARCHAR(255),
    street         VARCHAR(255),
    house_numb     VARCHAR(50),
    corpus         VARCHAR(50),
    building       VARCHAR(50),
    apartment_numb VARCHAR(50),
    CONSTRAINT unique_estate_info UNIQUE (house_numb, street, city, region, state)
);

