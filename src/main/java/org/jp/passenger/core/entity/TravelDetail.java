package org.jp.passenger.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Travel_Detail")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravelDetail implements Serializable {

	private static final long serialVersionUID = 8985198972681011338L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "passenger_Id")
	private Long id;
	@Column(name = "travel_date")
	private Date travelDate;
	@Column(name = "source_location")
	private String source;
	@Column(name = "destination_location")
	private String destination;

}
