package com.practico.sessionbeans;



import java.util.List;

import javax.ejb.Remote;

import com.practico.data.Noticia;

@Remote
public interface NoticiaSBRemote {
	
	public Noticia BuscarNoticiaID(Integer id);
	public void AddPublicacionNoticia (String type, String url, Integer id);
	public List <Noticia> GetAllNoticias ();
	
}
