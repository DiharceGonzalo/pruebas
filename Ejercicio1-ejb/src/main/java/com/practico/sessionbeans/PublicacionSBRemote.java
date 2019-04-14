package com.practico.sessionbeans;

import java.util.List;

import javax.ejb.Remote;

import com.practico.data.Publicacion;

@Remote
public interface PublicacionSBRemote {

	public List<Publicacion> getAllPublicaciones();
	public List<Publicacion> getPublicacionesNoticia(int id);
	
}
