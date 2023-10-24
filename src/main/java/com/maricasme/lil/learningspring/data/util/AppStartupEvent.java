package com.maricasme.lil.learningspring.data.util;

import java.util.Date;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.maricasme.lil.learningspring.business.ReservationService;
import com.maricasme.lil.learningspring.business.RoomReservation;
/*import com.maricasme.lil.learningspring.entity.Guest;
import com.maricasme.lil.learningspring.entity.Reservation;
import com.maricasme.lil.learningspring.entity.Room;
import com.maricasme.lil.learningspring.repository.GuestRepository;
import com.maricasme.lil.learningspring.repository.ReservationRepository;
import com.maricasme.lil.learningspring.repository.RoomRepository;
*/
@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

	private final ReservationService reservationService;
    private final DateUtils dateUtils;
    
    public AppStartupEvent(ReservationService reservationService, DateUtils dateUtils) {
		super();
		this.reservationService = reservationService;
		this.dateUtils = dateUtils;
	}




	@Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date = (Date) this.dateUtils.createDateFromDateString("2022-01-01");
        List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(date);
        reservations.forEach(System.out::println);
    }




}
