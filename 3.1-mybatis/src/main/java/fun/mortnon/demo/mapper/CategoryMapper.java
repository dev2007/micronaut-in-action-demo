package fun.mortnon.demo.mapper;

import fun.mortnon.demo.Category;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author dev2007
 * @date 2023/9/18
 */
public interface CategoryMapper {
    @Select("select * from category where id=#{id}")
    Category findById(long id);

    @Insert("insert into category(name) values(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void save(Category genre);

    @Delete("delete from category where id=#{id}")
    void deleteById(long id);

    @Update("update category set name=#{name} where id=#{id}")
    void update(@Param("id") long id, @Param("name") String name);

    @Select("select * from category")
    List<Category> findAll();
}
