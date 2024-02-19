/**
 * 
 */
package com.mike.tiendaweb.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mike.tiendaentities.entity.TipoTienda;
import com.mike.tiendaservice.services.AdminGeneralService;
import com.mike.tiendaweb.utils.ControllersUtil;

/**
 * @author Michael Escobar
 *
 */
@ManagedBean
@ViewScoped
public class AdminTiposTiendasController {
	
	
	/**
	 * @return the tipoTiendas
	 */
	public List<TipoTienda> getTipoTiendas() {
		return tipoTiendas;
	}


	/**
	 * @param tipoTiendas the tipoTiendas to set
	 */
	public void setTipoTiendas(List<TipoTienda> tipoTiendas) {
		this.tipoTiendas = tipoTiendas;
	}


	/**
	 * @return the tipoTienda
	 */
	public TipoTienda getTipoTienda() {
		return tipoTienda;
	}


	/**
	 * @param tipoTienda the tipoTienda to set
	 */
	public void setTipoTienda(TipoTienda tipoTienda) {
		this.tipoTienda = tipoTienda;
	}


	private List<TipoTienda> tipoTiendas;
	
	private TipoTienda tipoTienda;
	
	
	
	private AdminGeneralService adminGeneralService = new AdminGeneralService();
	
	
	@PostConstruct
	public void init() {
		
		this.inicializarComponentes();
		this.consultar();
	}
	
	public void inicializarComponentes() {
		this.tipoTienda = new TipoTienda();
	}
	
	public void consultar() {
		try {
			this.tipoTiendas = this.adminGeneralService.consultarTiposTiendas();
		} catch (SQLException e) {
			ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_FATAL, "UPS", "Hubo un problema al solicitar información de los tipos de tiendas");
			e.printStackTrace();
		}
	}
	
	public void guardar() {
		System.out.println("Ejecutando accion para guardar");
		
		try {
			int guardado = this.adminGeneralService.guardarTipoTienda(this.tipoTienda);
			if (guardado > 0) {
				ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_INFO, "OK", "Tipo de Tienda" + this.tipoTienda.getDescripcion() + " guardado exitósamente");
				this.consultar();
				this.inicializarComponentes();
			} else {
				ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "ERROR", "El tipo de Tienda" + this.tipoTienda.getDescripcion() + " no se guardó");
			}
			
		} catch (SQLException e) {
			ControllersUtil.mostrarMensaje(FacesMessage.SEVERITY_FATAL, "UPS", "Hubo un problema al solicitar información de los tipos de tiendas");
			e.printStackTrace();
		}
	}
	
	
	
	public void cargarInformacionModal(TipoTienda tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

}
