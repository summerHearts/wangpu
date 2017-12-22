package com.wangpu.dao;

import com.wangpu.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkuserphone(String phone);

    User selectLogin(@Param("username") String username, @Param("password")String password);

    int checkEmail(String email);

    String selectQuestionByPhone(String phone);

    int checkAnswer(@Param("phone")String phone,@Param("question")String question,@Param("answer")String answer);

    int checkPassword(@Param(value="password")String password,@Param("userId")Integer userId);

    int updatePasswordByPhone(@Param("phone")String phone,@Param("passwordNew")String passwordNew);


    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);

}