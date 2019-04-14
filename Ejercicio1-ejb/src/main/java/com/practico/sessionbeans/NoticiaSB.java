package com.practico.sessionbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.practico.data.DAOSingleton;
import com.practico.data.Noticia;



@Stateless
@LocalBean
public class NoticiaSB implements NoticiaSBRemote, NoticiaSBLocal {

	@EJB
	private DAOSingleton dao;

	public NoticiaSB() {
    }


	@Override
	public void AltaNoticia(String titulo, String descripcion) {

		dao.crearNoticia(descripcion, titulo);

	}

	@Override
	public Noticia BuscarNoticiaID(Integer id) {
		return null;//dao.BuscarNoticiaID(id);
	}

	@Override
	public void AddPublicacionNoticia(String type, String url, Integer id){
			dao.agregarPublicacionNoticia(id, type, url);
		}


	@Override
	public List<Noticia> GetAllNoticias() {
		return dao.getNoticias();
	}














}
