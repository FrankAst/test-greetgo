package com.greetgo.mappers;

import org.apache.ibatis.session.SqlSession;
/**
 * Created by frankast on 5/23/17.
 */
public class DataMapperInit{

    public int getData(Integer id) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        DataMapper mapper = session.getMapper(DataMapper.class);
        int data = mapper.getIdFromDB(id);
        session.close();
        return data;
    }
}
