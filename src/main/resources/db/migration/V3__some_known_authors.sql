INSERT INTO hello_flyway.author (id, first_name, last_name, date_of_birth, address) VALUES
                        (nextval('hello_flyway.s_author_id'), 'William', 'Shakespeare', '1564-04-26', 'Unknown'),
                        (nextval('hello_flyway.s_author_id'), 'Agatha', 'Christie', '1890-09-15', 'Unknown'),
                        (nextval('hello_flyway.s_author_id'), 'J. K.', 'Rowling', '1965-07-31', 'Unknown'),
                        (nextval('hello_flyway.s_author_id'), 'Stephen', 'King', '1947-09-21', 'Unknown');