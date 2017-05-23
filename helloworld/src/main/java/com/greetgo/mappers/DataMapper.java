package com.greetgo.mappers;


import com.greetgo.entities.Word;
import org.apache.ibatis.annotations.*;

/**
 * Created by frankast on 5/20/17.
 */
@Mapper
public interface DataMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "text", column = "text"),

    })

    @Select("SELECT id FROM word WHERE id = #{id}")
            public int getIdFromDB(@Param("id") int id);

    @Select("SELECT text FROM word WHERE id = #{id}")
           public String getTextFromDB(@Param("id") int id);

    @Select("SELECT count(id) from word")
            public int numberOfRowsInTable();
}
