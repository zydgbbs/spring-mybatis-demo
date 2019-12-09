package com.zydgbbs.mapper;

import com.zydgbbs.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public User getUserById(Integer id) {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getUserById(id);
        return user;
    }
}
