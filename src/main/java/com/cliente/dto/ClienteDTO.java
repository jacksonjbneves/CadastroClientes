package com.cliente.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import lombok.Data;

/**
 *
 * @author Jackson
 */
@Data
public class ClienteDTO {
    private Long codigo;
    private String nome;
    private String cpf;
    private Integer idade;
}
