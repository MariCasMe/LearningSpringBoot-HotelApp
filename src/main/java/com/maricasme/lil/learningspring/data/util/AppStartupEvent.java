package com.maricasme.lil.learningspring.data.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.maricasme.lil.learningspring.entity.Guest;
import com.maricasme.lil.learningspring.entity.Reservation;
import com.maricasme.lil.learningspring.entity.Room;
import com.maricasme.lil.learningspring.repository.GuestRepository;
import com.maricasme.lil.learningspring.repository.ReservationRepository;
import com.maricasme.lil.learningspring.repository.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;
	
	
	public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository,
			ReservationRepository reservationRepository) {
		super();
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}




	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		Iterable<Room> room =this.roomRepository.findAll();
		room.forEach(System.out::println);
		
		Iterable<Guest> guest =this.guestRepository.findAll();
		guest.forEach(System.out::println);
		
		Iterable<Reservation> reservation =this.reservationRepository.findAll();
		reservation.forEach(System.out::println);
		
	}

}
