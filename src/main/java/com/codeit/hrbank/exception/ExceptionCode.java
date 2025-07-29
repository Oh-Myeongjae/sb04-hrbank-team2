package com.codeit.hrbank.exception;

import lombok.Getter;

public enum ExceptionCode {
    USER_NOT_FOUND(404, "User Not Found"),
    EMAIL_OR_USERNAME_ALREADY_EXISTS(400, "User With Email Already Exists"),
    CHANNEL_OR_USER_NOT_FOUND(404, "Channel | User With ID Not Found"),
    READSTATUS_ALREADY_EXISTS(400, "ReadStatus With UserId and ChannelId Already Exists"),
    WRONG_PASSWORD(400, "Wrong Password"),
    USERSTATUS_NOT_FOUND(404, "UserStatus Not Found"),
    READSTATUS_NOT_FOUND(404, "Message ReadStatus Not Found"),
    MESSAGE_NOT_FOUND(404, "Message Not Found"),
    CHANNEL_NOT_FOUND(404, "Channel Not Found"),
    PRIVATE_CHANNEL_CANNOT_UPDATE(400, "Private Channel Cannot Be Updated"),
    BINARY_CONTENT_NOT_FOUND(404, "BinaryContent Not Found"),

    BINARY_CONTENT_EXISTS(400, "BinaryContent Exists"),
    USER_ALREADY_EXISTS_USERSTATUS(400, "User Already Exists UserStatus"),
    INVALID_PAST_TIME(400, "Time Is Earlier Than Saved Time"),
    BINARY_CONTENT_STORAGE_NOT_FOUND(404,"BinaryContent Storage Not Found");

    @Getter
    private final int status;

    @Getter
    private final String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
