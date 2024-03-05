package com.store.auth.service;

import com.store.auth.domain.Company;
import com.store.auth.repository.CompanyRepository;
import com.store.auth.service.interfaces.CompanyServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends GenericService<Company, Long, CompanyRepository> implements CompanyServiceInterface {
    public CompanyService(CompanyRepository repository) { super(repository); }
}
