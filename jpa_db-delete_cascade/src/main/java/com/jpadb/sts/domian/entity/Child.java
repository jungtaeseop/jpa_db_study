package com.jpadb.sts.domian.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Child {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	@ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private Person person;
}
