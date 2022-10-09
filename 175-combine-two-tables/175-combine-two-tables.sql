SELECT Person.firstName, Person.lastName, Address.city , Address.state from Person Left Join Address On Person.PersonId = Address.PersonId;
