package com.delta.drc.fcoe.log.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

    private int status;
    private String msg;

}
