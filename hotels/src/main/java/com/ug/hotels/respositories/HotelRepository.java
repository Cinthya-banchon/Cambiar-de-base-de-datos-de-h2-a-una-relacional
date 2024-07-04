package com.ug.hotels.respositories;

import org.springframework.data.repository.CrudRepository;
import com.ug.hotels.model.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {

}
