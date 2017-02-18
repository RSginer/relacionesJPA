/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rubén
 */
@Entity
@Table(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "empleados.findAll", query = "SELECT e "
            + " FROM empleados e ORDER BY e.id")})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Empleado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "fkDepartamento")
    private Departamento departamento;

    @OneToOne
    @JoinColumn(name = "fkPlazaAparcamiento")
    private PlazaAparcamiento plazaAparcamiento;
    
    @ManyToMany
    private List<Proyecto> proyectos;

    public PlazaAparcamiento getPlazaAparcamiento() {
        return plazaAparcamiento;
    }

    public void setPlazaAparcamiento(PlazaAparcamiento plazaAparcamiento) {
        this.plazaAparcamiento = plazaAparcamiento;
    }

    public Empleado(long Id, Departamento departamento) {
        this.Id = Id;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
