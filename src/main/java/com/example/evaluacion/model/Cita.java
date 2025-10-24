package com.example.evaluacion.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fecha_hora;
	private String estado;

	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Servicio servicio;
	@ManyToOne
	private Profesional profesional;

	public Cita() {

	}

	public Cita(Integer id, Date fecha_hora, String estado, Usuario usuario, Servicio servicio,
			Profesional profesional) {
		super();
		this.id = id;
		this.fecha_hora = fecha_hora;
		this.estado = estado;
		this.usuario = usuario;
		this.servicio = servicio;
		this.profesional = profesional;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha_hora=" + fecha_hora + ", estado=" + estado + ", usuario=" + usuario + "]";
	}

}
