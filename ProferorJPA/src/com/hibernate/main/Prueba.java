package com.hibernate.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.modelo.Direccion;
import com.hibernate.modelo.Profesor;
import com.hibernate.utilidades.Utilidades;

public class Prueba {

	public static void main(String[] args) {
		/*
		Direccion direccion=new Direccion();
		direccion.setCalle("Plaza del ayuntamiento");
		direccion.setPoblacion("Xativa");
		direccion.setProvincia("Valencia");
		
		Profesor p1 = new Profesor();
		p1.setNombre("Jose Luis");
		p1.setApe1("Marquez");
		p1.setApe2("Garcia");
		p1.setDireccion(direccion);
		insertarProfesor(p1);
		*/
		int id = 5;
		Profesor p1 = recuperaProfe(id);
		System.out.println(p1.toString());
	}
	
	private static void insertarProfesor(Profesor p1) {
			Session session = Utilidades.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(p1);
			session.getTransaction().commit();
			Utilidades.getSessionFactory().close();		
	}
	
	public static void leerProfes() {
        try{
        Session session = Utilidades.getSessionFactory().openSession();
        session.beginTransaction();
        List<Profesor> result = (List<Profesor>)session.createQuery("from Seguro").list();
        session.getTransaction().commit();
        System.out.println(result.toString());
        session.close();
        } catch(HibernateException ex){
            System.out.println(ex.getMessage());
        } 

	}
	
	public static Profesor recuperaProfe(int id) {
		Session session = Utilidades.getSessionFactory().openSession();
		Profesor profesor = new Profesor();
		session.beginTransaction();
		profesor = (Profesor) session.load(Profesor.class, id);
		session.getTransaction().commit();

		return 	profesor;
	}

}
