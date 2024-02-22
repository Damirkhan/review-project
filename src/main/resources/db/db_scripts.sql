CREATE TABLE review (
    id SERIAL PRIMARY KEY,
    user_id BIGINT,
    product_id BIGINT,
    text TEXT
);
