package org.jp.passenger.core.mapper;

import org.jp.passenger.core.dto.TravelDetailDTO;
import org.jp.passenger.core.entity.TravelDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TravelDetailMapper {

	TravelDetailDTO travelDetailToTravelDetailDTO(TravelDetail travelDetail);

}
