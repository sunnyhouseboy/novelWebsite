package novel.admin.service.impl;

import novel.admin.bean.Author;
import novel.admin.dao.AuthorMapper;
import novel.admin.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Author getAuthorById(int id) {
        return authorMapper.getAuthorById(id);
    }

    @Override
    public List<Author> getPendingAuthors() {
        return authorMapper.getPendingAuthors();
    }

    @Override
    public boolean approveAuthor(int id) {
        Map<String,Object> params=new HashMap<>();
        params.put("id",id);
        params.put("status","approved");
        int result=authorMapper.updateAuthorStatus(params);
        return result==1;
    }

    @Override
    public boolean rejectAuthor(int id) {
        Map<String,Object> params=new HashMap<>();
        params.put("id",id);
        params.put("status","rejected");
        int result=authorMapper.updateAuthorStatus(params);
        return result==1;
    }

    @Override
    public boolean markUserAsAuthor(int userId) {
        int result=authorMapper.markUserAsAuthor(userId);
        return result==1;
    }
}
