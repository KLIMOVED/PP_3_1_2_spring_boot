package web.PP_3_1_2_spring_boot.service;



import web.PP_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    void delete(Long id);

    User findById(Long id);

    List<User> listUsers();
}
