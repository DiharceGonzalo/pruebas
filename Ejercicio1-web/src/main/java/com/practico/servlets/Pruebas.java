package com.practico.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practico.data.Noticia;
import com.practico.data.Publicacion;
import com.practico.sessionbeans.NoticiaSBLocal;
import com.practico.sessionbeans.PublicacionSBLocal;

/**
 * Servlet implementation class Pruebas
 */
public class Pruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private NoticiaSBLocal nsbl;
	@EJB
	private PublicacionSBLocal psbl;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pruebas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		nsbl.AltaNoticia("tituloPrueba", "descripcionPrueba");
		
		System.out.println("Antes de listar todas las publicaciones");
		for(Noticia aux : nsbl.GetAllNoticias()) 
			System.out.println(aux.getTitle());
		
		System.out.println(nsbl.GetAllNoticias().size());
		
		
		psbl.AltaPublicacion("tipoPrueba", "urlPrueba", 0);
		psbl.AltaPublicacion("tipoPrueba2", "urlPrueba2", 1);
		
		System.out.println("Antes de listar todas las publicaciones");
		for(Publicacion aux : psbl.getAllPublicaciones()) 
			System.out.println(aux.getType());
		
		System.out.println("Antes de listar las publicaciones de la noticia 0");
		for(Publicacion aux : psbl.getPublicacionesNoticia(0))
			System.out.println(aux.getType());
		
		
		response.getWriter().append("asdasdas ").append(request.getContextPath());
		
		
	}

}
