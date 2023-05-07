package novel.admin.controller;

import novel.admin.bean.CarouselImage;
import novel.admin.service.CarouselImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/carousel")
public class CarouselImageController {
    @Autowired
    private CarouselImageService carouselImageService;

    //查询所有轮播图
    @RequestMapping("/list")
    public String list(Model model){
        List<CarouselImage> carouselImages=carouselImageService.selectAll();
        model.addAttribute("carouselImages",carouselImages);
        return "carousel/list";
    }

    //跳转到添加轮播图页面
    @RequestMapping("/addPage")
    public String addPage(){
        return "carousel/add";
    }

    //添加一条轮播图
    @PostMapping("/add")
    @ResponseBody
    public String add(CarouselImage carouselImage){
        int result=carouselImageService.insert(carouselImage);
        if(result==1){
            return "success";
        }
        else {
            return "fail";
        }
    }

    //跳转到编辑轮播图页面
    @RequestMapping("/editPage/{id}")
    public String editPage(@PathVariable int id,Model model){
        CarouselImage carouselImage=carouselImageService.selectById(id);
        model.addAttribute("carouselImage",carouselImage);
        return "carousel/edit";
    }
    //更新一条轮播图
    @PostMapping("/edit")
    @ResponseBody
    public String edit(CarouselImage carouselImage){
        int result=carouselImageService.update(carouselImage);
        if(result==1){
            return "success";
        }
        else{
            return "fail";
        }
    }


    //删除一条轮播图
    @PostMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id){
        int result=carouselImageService.delete(id);
        if(result==1){
            return "success";
        }
        else{
            return "fail";
        }
    }

}



//首先，我们可以创建一个list.jsp页面，用于展示所有的轮播图记录。该页面主要包含一个表格，用于展示轮播图的各个字段，以及添加、编辑、删除等操作的按钮
//我们可以创建一个add.jsp页面，用于添加一条轮播图记录。该页面主要包含一个表单，用于输入轮播图的各个字段，并提交保存。代码如下：
//们可以创建一个edit.jsp页面，用于编辑一条轮播图记录。该页面和添加页面类似，也是包含一个表单，但需要在表单中填充当前轮播图记录的信息，并提交修改。