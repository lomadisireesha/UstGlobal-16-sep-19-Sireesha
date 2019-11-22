package com.ust.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data		
@Entity
@Table(name="PencilBox")
public class PencilBox {
	@Id
	@Column
		private int pricebox ;
	@Column
		private String brand;
	@Exclude
	@OneToMany(mappedBy ="PencilBox")
	private List<Pencil> Pencil ;
}
