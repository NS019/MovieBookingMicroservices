CREATE TABLE show (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    movie_id BIGINT,
    theatre_id BIGINT,
    screen_id BIGINT,
    show_date DATE,
    show_time VARCHAR(10),
    price INT
);