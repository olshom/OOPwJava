SELECT * FROM currencyRates;
SELECT * 
FROM currencies
WHERE abbreviation = 'USD';
SELECT COUNT(*) AS currency_count
FROM currencies;
SELECT * 
FROM currencies
ORDER BY exchangeRateToEUR DESC
LIMIT 1;


