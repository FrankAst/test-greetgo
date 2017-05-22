package com.greetgo.mappers;

import com.greetgo.entities.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by frankast on 5/20/17.
 */
@Mapper
public interface DataMapper {

    @Select("SELECT* FROM word where id = #{id}")
    Word getById(@Param("id") int id);

    @Select("SELECT count(id) from word")
            int numberOfRows();
}
