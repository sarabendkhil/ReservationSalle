package com.mosa.gestion.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SalleTP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalleTP;
	@NotNull
	public String clubConcerne;
	@NotNull
	public String activite;
	public Long getIdSalleTP() {
		return idSalleTP;
	}
	public SalleTP(String clubConcerné, String activité) {
		super();
		this.clubConcerne = clubConcerné;
		this.activite = activité;
	}
	public SalleTP() {
		super();
	}
	public void setIdSalleTP(Long idSalleTP) {
		this.idSalleTP = idSalleTP;
	}
	public String getClubConcerne() {
		return clubConcerne;
	}
	public void setClubConcerne(String clubConcerné) {
		this.clubConcerne = clubConcerné;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activité) {
		this.activite = activité;
	}
	@Override
	public String toString() {
		return "SalleTP [idSalleTP=" + idSalleTP + ", clubConcerné=" + clubConcerne + ", activité=" + activite + "]";
	}
	
	
	

}
