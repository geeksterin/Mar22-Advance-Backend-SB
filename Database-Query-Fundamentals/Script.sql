CREATE DATABASE geekster_insurance;
CREATE DATABASE IF NOT EXISTS geekster_insurance;
SHOW DATABASES;

-- To check which DB you are connected to
SELECT DATABASE();

-- This is to use a particular DB
USE geekster_insurance;


-- CREATE TABLE insurance_policy (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	items_covered INT NOT NULL,
	sum_insured DOUBLE NOT NULL,
	insurance_type ENUM("MOBILE", "VEHICLE", "LIFE") NOT NULL
);

CREATE TABLE IF NOT EXISTS insurance_policy (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	items_covered INT NOT NULL,
	sum_insured DOUBLE NOT NULL,
	insurance_type ENUM("MOBILE", "VEHICLE", "LIFE") NOT NULL
);

SHOW TABLES;

-- To check the definitiopn of a table
SHOW CREATE TABLE insurance_policy;

CREATE TABLE insurance (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	status ENUM("ACTIVE", "INAVTIVE") NOT NULL,
	created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
	expired_on DATETIME DEFAULT NULL,
	policy_id BIGINT NOT NULL,
	CONSTRAINT fk_policy_id FOREIGN KEY (policy_id) REFERENCES insurance_policy(id),
	CONSTRAINT uk_policy_name_id UNIQUE (name, policy_id)
);

SHOW CREATE TABLE insurance;

INSERT INTO insurance_policy(items_covered, sum_insured, insurance_type) VALUE(2, 2000.00, "MOBILE"); 
SELECT * FROM insurance_policy;

INSERT INTO insurance(name, status, policy_id) VALUE("Mobile_1", "ACTIVE", 1);

INSERT INTO insurance(name, status, policy_id) VALUES("Mobile_2", "ACTIVE", 1), ("Mobile_3", "ACTIVE", 1);
SELECT * FROM insurance;

SELECT i.name, i.status FROM insurance AS i;

DROP TABLE insurance;

TRUNCATE insurance; 
