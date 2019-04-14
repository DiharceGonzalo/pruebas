package com.practico.data;

import java.util.List;

import javax.ejb.Local;

@Local
public interface DAOSingletonLocal {
  public void crearNoticia(String descripcion, String title);
  public void agregarPublicacionNoticia(Integer idNoticia, String type, String url);
  public List<Noticia> getNoticias();
  public List<Publicacion> getPublicaciones();
  public List<Publicacion> getPublicacionesNoticia(Integer idNoticia);
}
