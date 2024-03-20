package com.sena.servicesecurity.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.servicesecurity.Entity.Country;
@Repository
public interface ICountryRepository extends IBaseRepository<Country, Long> {

}
