DROP DATABASE IF EXISTS currencyRates;
CREATE DATABASE currencyRates;
USE currencyRates;
CREATE TABLE currencies (
    id INT NOT NULL AUTO_INCREMENT,
    abbreviation VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
    exchangeRateToEUR DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO currencies (abbreviation, name, exchangeRateToEUR)
VALUES
  ('USD', 'US Dollar', 0.86),
  ('GBP', 'British Pound', 1.16),
  ('JPY', 'Japanese Yen', 0.0059),
  ('AUD', 'Australian Dollar', 0.60),
  ('CAD', 'Canadian Dollar', 0.67),
  ('CHF', 'Swiss Franc', 0.94),
  ('CNY', 'Chinese Yuan', 0.11),
  ('SEK', 'Swedish Krona', 0.091),
  ('INR', 'Indian Rupee', 0.012),
  ('NZD', 'New Zealand Dollar', 0.55);
DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT ON currencyRates.* TO 'appuser'@'localhost';
