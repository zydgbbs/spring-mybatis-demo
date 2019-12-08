package com.zydgbbs.mapper;

import com.zydgbbs.domain.User;
import org.mybatis.spring.SqlSessionTemplate;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User getUserById(Integer id) {
        return sqlSession.getMapper(UserMapper.class).getUserById(id);
    }
}
