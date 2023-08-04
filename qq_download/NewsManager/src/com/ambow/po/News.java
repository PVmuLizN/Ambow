package com.ambow.po;

/**创建实体类，类名就是数据库表名*/
public class News {
	//列名就是属性名
	private int id;
	private String type;
	private String title;
	private String author;
	private String createdate;
	private String mogifydate;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getMogifydate() {
		return mogifydate;
	}
	public void setMogifydate(String mogifydate) {
		this.mogifydate = mogifydate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
