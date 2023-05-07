package novel.admin.dao;

import novel.admin.bean.Author;

import java.util.List;
import java.util.Map;

public interface AuthorMapper{
    public Author getAuthorById(int id);
    public List<Author> getPendingAuthors();
    public int updateAuthorStatus(Map<String,Object> params);

    public int markUserAsAuthor(int userId);
}
