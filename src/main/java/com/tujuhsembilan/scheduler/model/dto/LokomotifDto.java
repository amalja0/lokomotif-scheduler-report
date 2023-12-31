package com.tujuhsembilan.scheduler.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LokomotifDto {
    
    private String _id;
    private String kodeLoko;
    private String namaLoko;
    private String dimensiLoko;
    private String status;
    private LocalDateTime createdDate;

}
