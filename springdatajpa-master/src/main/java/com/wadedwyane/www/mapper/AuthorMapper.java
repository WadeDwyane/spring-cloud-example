package com.wadedwyane.www.mapper;


import com.wadedwyane.www.entity.Author;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Mapper
@EnableAutoConfiguration
public interface AuthorMapper {

    @Insert("insert into author(name, age, book_name) values(#{name}, #{age}, #{bookName})")
    void insert(Author author);


}


