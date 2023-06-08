package com.tech.rminfo.helper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {
	public static <T> ResponseEntity<T> noContent() {
		return withStatus(HttpStatus.NO_CONTENT);
	}

	public static <T> ResponseEntity<T> internalServerError() {
		return withStatus(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public static <T> ResponseEntity<T> accepted() {
		return withStatus(HttpStatus.ACCEPTED);
	}
	
	public static <T> ResponseEntity<T> success() {
		return withStatus(HttpStatus.OK);
	}

	private static <T> ResponseEntity<T> withStatus(HttpStatus status) {
		return new ResponseEntity<T>(status);
	}

//	public static ResponseEntity<User> success(ResponseEntity<User> userByEmail) {
//		return new ResponseEntity<User>(HttpStatus.OK);
//	}

}
