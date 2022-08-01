package tn.esprit.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(	name = "demission")
public class Demission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String etat;
	private String pc;
	private String portable;
	private String clés;
	@OneToOne
	@JoinColumn(name = "prestataire_id" , referencedColumnName = "id" )
	private Prestataire prestataire;
	
}
