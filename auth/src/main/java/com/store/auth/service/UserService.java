package com.store.auth.service;

import com.store.auth.domain.User;
import com.store.auth.repository.UserRepository;
import com.store.auth.service.interfaces.UserServiceInterface;

public class UserService extends GenericService<User, Long, UserRepository> implements UserServiceInterface {
    public UserService(UserRepository repository) { super(repository); }
}
