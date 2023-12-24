package core.domain.services;

import core.domain.model.User;

public interface UserRepository {

    public void save(User user);
}
