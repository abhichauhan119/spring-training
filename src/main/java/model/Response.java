package model;

import java.util.ArrayList;

public class Response {
	private String status;
	private String code;
	private ArrayList data;
	@Override
	public String toString() {
		return "Response [status=" + status + ", code=" + code + ", data=" + data + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ArrayList getData() {
		return data;
	}
	public void setData(ArrayList data) {
		this.data = data;
	}
}