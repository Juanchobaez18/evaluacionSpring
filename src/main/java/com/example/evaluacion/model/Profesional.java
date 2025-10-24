package com.example.evaluacion.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesionales")
public class Profesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String especialidad;
	private Date horario_disponible;

	@ManyToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "profesional")
	private List<Cita> citas;

	public Profesional() {

	}

	public Profesional(Integer id, String especialidad, Date horario_disponible, Usuario usuario, List<Cita> citas) {
		super();
		this.id = id;
		this.especialidad = especialidad;
		this.horario_disponible = horario_disponible;
		this.usuario = usuario;
		this.citas = citas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Date getHorario_disponible() {
		return horario_disponible;
	}

	public void setHorario_disponible(Date horario_disponible2) {
		this.horario_disponible = horario_disponible2;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Profesional [id=" + id + ", especialidad=" + especialidad + ", horario_disponible=" + horario_disponible
				+ "]";
	}

}
