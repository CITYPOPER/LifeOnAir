package com.jhj.lifeonair.domain.user.exception;

import com.jhj.lifeonair.global.error.exception.BusinessException;
import com.jhj.lifeonair.global.error.exception.ErrorCode;

public class UserNotFoundException extends BusinessException {

	public UserNotFoundException() {
		super(ErrorCode.USER_NOT_FOUND);
	}
}
