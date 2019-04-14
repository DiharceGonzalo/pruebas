package com.practico.sessionbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.practico.data.DAOSingletonLocal;
import com.practico.data.Publicacion;


@Stateless
@LocalBean
public class PublicacionSB implements PublicacionSBRemote, PublicacionSBLocal {

	@EJB
	private DAOSingletonLocal dao;
	    
	public PublicacionSB(){}
    
	public void AltaPublicacion(String tipo, String url, Integer idNoticia) {
		dao.agregarPublicacionNoticia(idNoticia, tipo, url);
	}
	
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	
	//Obtener Publicaciones
		@Override		
		public List<Publicacion> getAllPublicaciones(){
					
			return dao.getPublicaciones();
		
		}
		
		//Obtener Publicaciones de una Noticia
		
		@Override
		public List<Publicacion> getPublicacionesNoticia(int id) {
			/*
			//Obtengo la noticia
			Noticia noticia = (Noticia) dao.BuscarNoticiaID(id);
			
			List <Publicacion> publicacionesNoticia;
			
			publicacionesNoticia=noticia.getPublicacions();//ver si esto esta bien, retorno la lista por parametro
			
			return publicacionesNoticia;*/
			return dao.getPublicacionesNoticia(id);
		}
}
