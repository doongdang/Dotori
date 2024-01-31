package com.dotori.backend.domain.room.model.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomInitializationDto {
	private Map<String, Object> sessionProperties;
	private Map<String, Object> connectionProperties;
	private RoomDTO roomInfo;
	//	private BookDTo bookInfo;
}
