package novel.admin.controller;


//没有直接使用HttpServletRequest和HttpServletResponse,使用了Model对象（该对象允许你向视图添加模型属性并返回视图名称）
import novel.admin.bean.Category;
import novel.admin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/list")
    public String list(Model model){
        List<Category> categories=categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        return "category/list";
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute(new Category());
        return "category/add";
    }
    @PostMapping("/add")
    public String add(Category category){
        categoryService.addCategory(category);
        return "redirect:list";
    }
    //使用@RequestParam注解或@PathVariable注解，可以将HTTP请求参数的值绑定到控制器方法地参数上，而无需显式的访问HttpServletRequest和HttpServletResponse
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id,Model model){
        Category category=categoryService.getCategoryById(id);
        model.addAttribute("category",category);
        return "category/edit";
    }
    @PostMapping("/edit")
    public String edit(Category category){
        categoryService.updateCategory(category);
        return "redirect:list";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        categoryService.deleteCategory(id);
        return "redirect:/category/list";
    }


    //produces属性指定相应类型
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    //@ResponseBody注解用于将响应的数据转换成json格式并返回给客户端
    @ResponseBody
    public List<Category> listCategories() {
        return categoryService.getAllCategories();
    }
}
