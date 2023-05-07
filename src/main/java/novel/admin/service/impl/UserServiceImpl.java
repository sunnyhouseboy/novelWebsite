package novel.admin.service.impl;

import novel.admin.bean.User;
import novel.admin.dao.UserMapper;
import novel.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private UserApplicationMapper userApplicationMapper;
//
//    @Override
//    public void applyAuthor(int userId) {
//        User user = userMapper.selectByPrimaryKey(userId);
//        if (user == null) {
//            throw new RuntimeException("用户不存在");
//        }
//        if (user.isAuthor() || user.isApplyAuthor()) {
//            throw new RuntimeException("用户已经是作者或已提交过成为作者申请");
//        }
//        UserApplication userApplication = new UserApplication();
//        userApplication.setUserId(userId);
//        userApplication.setApplyTime(new Date());
//        userApplicationMapper.insert(userApplication);
//
//        // 更新用户表中isApplyAuthor字段的值为true
//        User updateUser = new User();
//        updateUser.setId(userId);
//        updateUser.setIsApplyAuthor(true);
//        userMapper.updateByPrimaryKeySelective(updateUser);
//    }
//}

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User selectById(int userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public int deleteById(int userId) {
        return userMapper.deleteById(userId);
    }

}
