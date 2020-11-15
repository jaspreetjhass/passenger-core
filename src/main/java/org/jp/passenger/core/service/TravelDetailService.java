package org.jp.passenger.core.service;

import java.util.Optional;

import org.jp.passenger.core.entity.TravelDetail;

public interface TravelDetailService {

	Optional<TravelDetail> fetchByPassengerId(Long Id);

}
