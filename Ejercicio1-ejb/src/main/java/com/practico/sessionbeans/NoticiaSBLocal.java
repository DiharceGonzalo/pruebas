package com.practico.sessionbeans;

import java.util.List;

import javax.ejb.Local;

import com.practico.data.Noticia;

@Local
public interface NoticiaSBLocal {

	public void AltaNoticia(String titulo, String descripcion);
	public Noticia BuscarNoticiaID(Integer id);
	public void AddPublicacionNoticia(String type, String url, Integer id);
	public List <Noticia> GetAllNoticias ();

}
