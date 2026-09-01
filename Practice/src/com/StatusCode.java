package com;

public enum StatusCode {

	NOTFOUND(404), SUCCESS(200), BAD_REQUEST(400), INTERNAL_SERVER_ERROR(500);
	
	int code;
	
	StatusCode(int code) {
		this.code = code;
	}
	
	int getCode() {
		return code;
	}
}
