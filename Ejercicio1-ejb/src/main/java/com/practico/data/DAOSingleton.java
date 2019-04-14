package com.practico.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class DAOSingleton
 */
@Singleton
@Startup
@LocalBean
public class DAOSingleton implements DAOSingletonLocal {

    /**
     * Default constructor. 
     */
	
	private List<Noticia> noticias;
	private List<Publicacion> publicaciones;
	private Integer cantNoticias;
	private Integer cantPublicaciones;
	
    public DAOSingleton() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    public void initialize() {
     
        noticias = new ArrayList<Noticia>();
        publicaciones = new ArrayList<Publicacion>();
        Noticia noticia = new Noticia(0, "prueba", "pruebaTitulo");
        noticias.add(noticia);
        Noticia noticia2 = new Noticia(1, "prueba2", "pruebaTitulo2");
        noticias.add(noticia2);
        Noticia noticia3 = new Noticia(2, "prueba3", "pruebaTitulo3");
        noticias.add(noticia3);
        cantNoticias = 3;
        cantPublicaciones = 0;
    }
    
    public void crearNoticia(String descripcion, String title) {
    	Noticia noticia = new Noticia(cantNoticias, descripcion, title);
    	cantNoticias++;
    	noticias.add(noticia);
    }
    
    public void agregarPublicacionNoticia(Integer idNoticia, String type, String url) {
    	int i = 0;
    	while(noticias.get(i).getId() != idNoticia && i <= noticias.size()) 
    		i++;
    	if(noticias.get(i).getPublicacions().size() < 10) {
    		Publicacion publicacion = new Publicacion(cantPublicaciones, type, url);
    		cantPublicaciones++;
        	publicaciones.add(publicacion);
        	noticias.get(i).addPublicacion(publicacion);
    	}
    }
    
    public List<Noticia> getNoticias() {
    	return noticias;
    }
    
    public List<Publicacion> getPublicaciones(){
    	return publicaciones;
    }
    public List<Publicacion> getPublicacionesNoticia(Integer idNoticia){
    	int i = 0;
    	while(noticias.get(i).getId() != idNoticia && i <= noticias.size()) 
    		i++;
    	return noticias.get(i).getPublicacions();
    }
}
