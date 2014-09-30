package com.jinyi.ihome.infrastructure;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("rawtypes")
public class MessageTo<T> implements Serializable {

	public final static String ABNORMAL_DATA = "数据异常";
	public final static String PARAMETER_INVALID = "参数异常";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7124170122394232970L;
	/***
	 * 标志位
	 */
	@Setter @Getter
	private boolean success;
	/***
	 * 描述信息，可以提供给用户
	 */
	@Setter @Getter
	private String message;
	
	/***
	 * 附加的数据
	 */
	@Setter @Getter
	private T data;
	
	//附加信息
	@Setter @Getter
	private Object tag;
	
	public MessageTo() {
		this(true, "");
	}
	
	public MessageTo(Boolean success, String desc) {
		this.success = success;
		this.message = desc;
	}
	
	public MessageTo success(String desc){
		this.message = desc;
		this.success = true;
		return this;
	}
	
	public MessageTo fail(String desc){
		this.message = desc;
		this.success = false;
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("成功：%s, 描述 ：%s", success, message);
	}

	
}
