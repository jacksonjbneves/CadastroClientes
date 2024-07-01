/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.entity.Cliente;

/**
 *
 * @author Jackson
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    
}

