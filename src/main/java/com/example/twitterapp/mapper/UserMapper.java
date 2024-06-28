package com.example.twitterapp.mapper;

import com.example.twitterapp.dto.UserSaveRequest;
import com.example.twitterapp.dto.UserSaveResponse;
import com.example.twitterapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userSaveRequestToModel(UserSaveRequest userSaveRequest);

    UserSaveResponse userSaveResponseToModel(UserSaveResponse userSaveResponse);
}
