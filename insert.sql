-- Kölcsönzök --
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Pala Béla', 'palabela@gmail.com', '36028551069');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Erős Pista', 'erospista@gmail.com', '36074101069');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Nagy Mária', 'nagymaria@gmail.com', '36591551069');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Kis János', 'kisjanos@gmail.com', '36028551069');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Fehér Bence', 'feherbence@gmail.com', '36028671169');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Törzs Béla', 'torzsbela@gmail.com', '36044910548');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Undok Evelin', 'undokevelin@gmail.com', '36028556029');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Szép Anna', 'szepanna@gmail.com', '36271551069');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Őrző Józsi', 'orzojozsi@gmail.com', '36028552020');
INSERT INTO kolcsonzok(name, email, phone, address) VALUES ('Kaktusz Zsombor', 'kaktuszzsombor@gmail.com', '36787315456');

-- Kerékpárok --
INSERT INTO kerekparok(start, back, priceday) VALUES ('1928-01-12', '1928-01-16', '580');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1950-05-25', '1950-06-01', '850');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1928-01-12', '1928-01-16', '1000');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1928-12-12', '1928-12-15', '350');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1911-08-02', '1911-08-06', '670');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1965-04-05', '1965-04-10', '820');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1970-07-25', '1970-07-27', '1500');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1998-02-20', '1998-02-25', '140');
INSERT INTO kerekparok(start, back, priceday) VALUES ('1982-03-29', '1928-04-01', '340');
INSERT INTO kerekparok(start, back, priceday) VALUES ('2002-01-12', '2002-02-16', '825');

-- Bikes --
INSERT INTO bikes(cadre) VALUES ('751');
INSERT INTO bikes(cadre) VALUES ('341');
INSERT INTO bikes(cadre) VALUES ('874');
INSERT INTO bikes(cadre) VALUES ('213');
INSERT INTO bikes(cadre) VALUES ('548');
INSERT INTO bikes(cadre) VALUES ('915');
INSERT INTO bikes(cadre) VALUES ('1100');
INSERT INTO bikes(cadre) VALUES ('671');
INSERT INTO bikes(cadre) VALUES ('5431');
INSERT INTO bikes(cadre) VALUES ('6783');

-- Types --
INSERT INTO types(type) VALUES ('Cross');
INSERT INTO types(type) VALUES ('Városi');
INSERT INTO types(type) VALUES ('Városi');
INSERT INTO types(type) VALUES ('Országúti');
INSERT INTO types(type) VALUES ('Trekking');
INSERT INTO types(type) VALUES ('Városi');
INSERT INTO types(type) VALUES ('Országúti');
INSERT INTO types(type) VALUES ('Városi');
INSERT INTO types(type) VALUES ('Trekking');
INSERT INTO types(type) VALUES ('Cross');

-- Brands --
INSERT INTO brands(type) VALUES ('Giant');
INSERT INTO brands(type) VALUES ('Mountain');
INSERT INTO brands(type) VALUES ('Cannondale');
INSERT INTO brands(type) VALUES ('Specialized');
INSERT INTO brands(type) VALUES ('Cross');
INSERT INTO brands(type) VALUES ('Specialized');
INSERT INTO brands(type) VALUES ('Mountain');
INSERT INTO brands(type) VALUES ('Cross');
INSERT INTO brands(type) VALUES ('Cannondale');
INSERT INTO brands(type) VALUES ('Mountain');

-- Sizes --
INSERT INTO sizes(size) VALUES ('190');
INSERT INTO sizes(size) VALUES ('198');
INSERT INTO sizes(size) VALUES ('170');
INSERT INTO sizes(size) VALUES ('165');
INSERT INTO sizes(size) VALUES ('180');
INSERT INTO sizes(size) VALUES ('198');
INSERT INTO sizes(size) VALUES ('178');
INSERT INTO sizes(size) VALUES ('180');
INSERT INTO sizes(size) VALUES ('190');
INSERT INTO sizes(size) VALUES ('198');

-- Breaks --
INSERT INTO breaks(breake) VALUES ('igen');
INSERT INTO breaks(breake) VALUES ('nem');
INSERT INTO breaks(breake) VALUES ('nem');
INSERT INTO breaks(breake) VALUES ('igen');
INSERT INTO breaks(breake) VALUES ('igen');
INSERT INTO breaks(breake) VALUES ('nem');
INSERT INTO breaks(breake) VALUES ('nem');
INSERT INTO breaks(breake) VALUES ('igen');
INSERT INTO breaks(breake) VALUES ('nem');
INSERT INTO breaks(breake) VALUES ('igen');