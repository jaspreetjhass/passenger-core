package org.jp.passenger.core.service.impl;

import java.util.Optional;

import org.jp.passenger.core.entity.TravelDetail;
import org.jp.passenger.core.repository.TravelDetailRepository;
import org.jp.passenger.core.service.TravelDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelDetailServiceImpl implements TravelDetailService {

	@Autowired
	private TravelDetailRepository travelDetailRepository;

	@Override
	public Optional<TravelDetail> fetchByPassengerId(final Long Id) {
		return travelDetailRepository.findById(Id);
	}

}
