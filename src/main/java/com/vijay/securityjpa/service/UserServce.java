package com.vijay.securityjpa.service;


import com.vijay.securityjpa.model.PageableResponse;
import com.vijay.securityjpa.model.UserDto;


import java.util.List;

public interface UserServce {


    UserDto createUser(UserDto userDto);
    PageableResponse<UserDto> getAllUsers(int pageNumber, int pageSize, String sortBy, String sortDir);

    UserDto findUserById(String userId);

    UserDto updateUser(String userId, UserDto userDto);

    void deleteUserById(String userId);

    UserDto getUserByEmail(String email);

    List<UserDto> searchUser(String keywords);
}
