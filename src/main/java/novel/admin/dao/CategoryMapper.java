package novel.admin.dao;

import novel.admin.bean.Category;

import java.util.List;

public interface CategoryMapper {
    //添加
    public int insert(Category category);
    //更改
    public int update(Category category);
    //删除
    public int delete(Integer id);
    //通过id进行查询
    public Category selectById(Integer id);
    //查询所有
    public List<Category> selectAll();
}
