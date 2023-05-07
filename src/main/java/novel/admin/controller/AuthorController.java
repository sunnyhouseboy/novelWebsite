package novel.admin.controller;


import novel.admin.bean.Author;
import novel.admin.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    //查询所有待审核的作者
    @RequestMapping("/pending-authors")
    public String getPendingAuthors(Model model){
        List<Author> authors=authorService.getPendingAuthors();
        model.addAttribute("authors",authors);
        return "pending-authors";
    }
    //批准作者
    @RequestMapping("/approve-author/{id}")
    public String approveAuthor(@PathVariable("id") int id,Model model){
        boolean success=authorService.approveAuthor(id);
        if(success){
            //将相应用户标记为作者
            boolean markSuccess=authorService.markUserAsAuthor(id);
            if(markSuccess){
                model.addAttribute("message","批准作者成功，用户已标记为作者");
            }else {
                model.addAttribute("message", "批准作者成功！,用户标记作者失败");
            }
        }else {
            model.addAttribute("message","批准作者失败！");
        }
        return "redirect:/pending-authors";
    }

    //拒绝作者
    @RequestMapping("reject-author/{id}")
    public String rejectAuthor(@PathVariable("id") int id,Model model){
        boolean success=authorService.rejectAuthor(id);
        if(success){
            model.addAttribute("message","拒绝作者成功！");
        }else{
            model.addAttribute("message","拒绝作者成功！");
        }
        return "redirect:/pending-authors";
    }

}














