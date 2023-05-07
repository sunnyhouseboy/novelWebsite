package novel.admin.service.impl;

import novel.admin.bean.Category;
import novel.admin.dao.CategoryMapper;
import novel.admin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public void addCategory(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.update(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryMapper.delete(id);
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryMapper.selectById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryMapper.selectAll();
    }
}
