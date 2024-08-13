package com.product.service.entity.response;

public class Response {
public Integer code;
public String message;
public Response() {
	super();
	// TODO Auto-generated constructor stub
}
public Response(Integer code, String message) {
	super();
	this.code = code;
	this.message = message;
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
