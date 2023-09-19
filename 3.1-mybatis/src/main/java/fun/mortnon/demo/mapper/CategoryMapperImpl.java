package fun.mortnon.demo.mapper;

import fun.mortnon.demo.Category;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author dev2007
 * @date 2023/9/18
 */
@Singleton
public class CategoryMapperImpl implements CategoryMapper {
    @Inject
    private SqlSessionFactory sqlSessionFactory;

    private CategoryMapper getMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(CategoryMapper.class);
    }

    @Override
    public Category findById(long id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return getMapper(sqlSession).findById(id);
        }
    }

    @Override
    public void save(Category category) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            getMapper(sqlSession).save(category);
            sqlSession.commit();
        }
    }

    @Override
    public void deleteById(long id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            getMapper(sqlSession).deleteById(id);
            sqlSession.commit();
        }
    }

    @Override
    public void update(long id, String name) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            getMapper(sqlSession).update(id, name);
            sqlSession.commit();
        }
    }

    @Override
    public List<Category> findAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return getMapper(sqlSession).findAll();
        }
    }
}
