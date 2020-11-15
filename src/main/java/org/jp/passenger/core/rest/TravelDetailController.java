package org.jp.passenger.core.rest;

import java.util.Optional;

import org.jp.passenger.core.dto.TravelDetailDTO;
import org.jp.passenger.core.entity.TravelDetail;
import org.jp.passenger.core.mapper.TravelDetailMapper;
import org.jp.passenger.core.service.TravelDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("passengerCore")
public class TravelDetailController {

	@Autowired
	private TravelDetailService travelDetailService;
	@Autowired
	private TravelDetailMapper travelDetailMapper;

	@GetMapping("{passengerId}")
	public TravelDetailDTO fetchTravelDetail(@PathVariable("passengerId") final Long passengerId) {
		log.info("enter into fetchTravelDetail method with parameters : {}. ", passengerId);
		TravelDetailDTO travelDetailDTO = null;
		final Optional<TravelDetail> optTravelDetail = travelDetailService.fetchByPassengerId(passengerId);
		if (optTravelDetail.isPresent()) {
			travelDetailDTO = travelDetailMapper.travelDetailToTravelDetailDTO(optTravelDetail.get());
		}
		log.info("exit from fetchTravelDetail method with output : {}. ", travelDetailDTO);
		return travelDetailDTO;
	}

}
