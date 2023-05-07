package novel.admin.service;

import novel.admin.bean.Author;

import java.util.List;
import java.util.Map;

public interface AuthorService {
    public Author getAuthorById(int id);
    public List<Author> getPendingAuthors();
    public boolean approveAuthor(int id);
    public boolean rejectAuthor(int id);

    public boolean markUserAsAuthor(int userId);
}

//markUserAsAuthor() 方法返回值的数据类型是不同的，这是因为它们承担的角色和目的不同。
//
//在 AuthorService 中，markUserAsAuthor() 方法的返回值类型是 boolean。这是因为该方法的主要目的是将一个用户标记为作者，并返回一个布尔值来表示操作是否成功。如果该用户存在并且成功标记为作者，则该方法应返回 true；否则，应返回 false。在这种情况下，我们只需要关心操作是否成功，而不需要获得任何其他信息。
//
//在 AuthorMapper 中，markUserAsAuthor() 方法的返回值类型是 int。这是因为该方法的主要目的是更新数据库表中的记录，并返回受影响的行数。具体地说，在这个流程中，该方法将会执行一条 SQL UPDATE 语句来更新 user 表中相应用户的 is_author 列的值。如果更新成功，则该方法应返回 1，否则应返回 0。
//
//因此，虽然这两个方法都用于将用户标记为作者，但它们所返回的值的类型是不同的，因为它们的用途和意义不同。
