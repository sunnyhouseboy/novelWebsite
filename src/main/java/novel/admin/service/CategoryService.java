package novel.admin.service;

import novel.admin.bean.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Integer id);
    Category getCategoryById(Integer id);
    List<Category> getAllCategories();
}
