package com.first.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ACTOR_DETAILS")
@Data
public class Actor {

	@Id
	int id;
	@Column
	String name;
}
