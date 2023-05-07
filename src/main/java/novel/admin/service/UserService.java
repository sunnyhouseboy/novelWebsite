package novel.admin.service;

import novel.admin.bean.User;

import java.util.List;

public interface UserService {
    //查询所有
    public List<User> selectAll();
    //添加用户信息
    public int addUser(User user);
    //修改用户信息
    public int updateUser(User user);
    //通过id进行用户信息的删除
    public int deleteById(int userId);

    //通过id进行用户信息的查询
    public User selectById(int userId);



}
