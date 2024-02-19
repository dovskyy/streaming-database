package com.dovskyy.streamingdatabase.dto;

import java.time.LocalDate;

public record MovieDTO(String title, String genre, LocalDate releaseDate) {
}
