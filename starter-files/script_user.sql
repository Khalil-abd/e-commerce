CREATE USER IF NOT EXISTS 'ecomapp'@'localhost' IDENTIFIED BY 'Ecomapp-2023' ;

ALTER USER 'ecomapp'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Ecomapp-2023'; 

GRANT ALL privileges ON ecommerce.* TO 'ecomapp'@'localhost';