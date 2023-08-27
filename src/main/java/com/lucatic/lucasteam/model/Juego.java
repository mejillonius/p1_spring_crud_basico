package com.lucatic.lucasteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="juego")
public class Juego {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="plataforma")
	private String plataforma;
	@Column(name="genero")
	private String genero;
	@Column(name="editor")
	private String editor;
	@Column(name="anio")
	private int anio;
	@Column(name="NA_Sales")
	private float NA_Sales;
	@Column(name="EU_Sales")
	private float EU_Sales;
	@Column(name="JP_Sales")
	private float JP_Sales;
	@Column(name="Other_sales")
	private float Other_sales;
	
	public Juego() {
		super();
	}

	public Juego(int id, String nombre, String plataforma, String genero, String editor, int anio, float nA_Sales,
			float eU_Sales, float jP_Sales, float other_sales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.genero = genero;
		this.editor = editor;
		this.anio = anio;
		NA_Sales = nA_Sales;
		EU_Sales = eU_Sales;
		JP_Sales = jP_Sales;
		Other_sales = other_sales;
	}

	@Override
	public String toString() {
		return "Juego [id=" + id + ", nombre=" + nombre + ", plataforma=" + plataforma + ", genero=" + genero
				+ ", editor=" + editor + ", anio=" + anio + ", NA_Sales=" + NA_Sales + ", EU_Sales=" + EU_Sales
				+ ", JP_Sales=" + JP_Sales + ", Other_sales=" + Other_sales + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public float getNA_Sales() {
		return NA_Sales;
	}

	public void setNA_Sales(float nA_Sales) {
		NA_Sales = nA_Sales;
	}

	public float getEU_Sales() {
		return EU_Sales;
	}

	public void setEU_Sales(float eU_Sales) {
		EU_Sales = eU_Sales;
	}

	public float getJP_Sales() {
		return JP_Sales;
	}

	public void setJP_Sales(float jP_Sales) {
		JP_Sales = jP_Sales;
	}

	public float getOther_sales() {
		return Other_sales;
	}

	public void setOther_sales(float other_sales) {
		Other_sales = other_sales;
	}
	
	
	
}
