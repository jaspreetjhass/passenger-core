package org.jp.passenger.core.repository;

import org.jp.passenger.core.entity.TravelDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelDetailRepository extends JpaRepository<TravelDetail, Long> {

}
