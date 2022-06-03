package com.mrewards.tremendous.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipient {
    private String name;
    private String email;
    private String phone;
}
