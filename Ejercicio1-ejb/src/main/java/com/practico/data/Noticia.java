package com.practico.data;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.List;


public class Noticia implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer id;

	private String description;

	private String title;

	private List<Publicacion> publicacion;

	public Noticia() {

	}
	public Noticia(Integer id, String descripcion, String title) {
		this.id = id;
		this.description = descripcion;
		this.title = title;
		this.publicacion = new ArrayList<Publicacion>();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Publicacion> getPublicacions() {
		return this.publicacion;
	}

	public void setPublicacions(List<Publicacion> publicacions) {
		this.publicacion = publicacions;
	}

	public void addPublicacion(Publicacion publicacion) {
		this.publicacion.add(publicacion);

	}

}
