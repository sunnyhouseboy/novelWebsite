package novel.admin.controller;


import novel.admin.bean.User;
import novel.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/User")
public class UserController {
    @Autowired
    private UserService userService;

    //跳转到用户列表页面
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("users",userService.selectAll());
        return "user/list";
    }
    //跳转到添加用户页面
    @GetMapping("/add")
    public String add(){
        return "user/add";
    }

    //添加用户信息
    @PostMapping("/insert")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/list";
    }

    //跳转到修改用户信息页面
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id,Model model){
        model.addAttribute("user",userService.selectById(id));
        return "user/edit";
    }

    //修改用户信息
    @PostMapping("/update")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/list";
    }

    //删除用户信息
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteById(id);
        return "redirect:/user/list";
    }

}
















