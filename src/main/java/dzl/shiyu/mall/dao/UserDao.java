package dzl.shiyu.mall.dao;

import dzl.shiyu.mall.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    int insertUser(User User);

    int updUser(User User);

    int delUser(Integer id);

}
