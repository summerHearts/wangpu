package com.wangpu.service;

import com.wangpu.common.ServerResponse;
import com.wangpu.pojo.User;

/**
 * Created by Kenvin
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse selectQuestion(String phone);

    ServerResponse<String> checkAnswer(String phone,String question,String answer);

    ServerResponse<String> forgetResetPassword(String phone,String forgetToken,String passwordNew);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

}
