package com.practico.data;

import java.io.Serializable;

public class Publicacion implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer id;
	private String type;
	private String url;



	public Publicacion() {
	}

	public Publicacion(Integer id, String type, String url) {
		this.id = id;
		this.type = type;
		this.url = url;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
