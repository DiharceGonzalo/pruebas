package com.practico.sessionbeans;

import java.util.List;

import javax.ejb.Local;

import com.practico.data.Publicacion;

@Local
public interface PublicacionSBLocal {

	public void AltaPublicacion(String tipo, String url, Integer idNoticia);

	public List<Publicacion> getAllPublicaciones();
	public List<Publicacion> getPublicacionesNoticia(int id);

}
