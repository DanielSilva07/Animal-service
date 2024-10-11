package com.danielsilva.Animal_Service.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeProvisorio;

    private String raca;

    @Column
    private String porte;

    @Column(nullable = false)
    private String idadeEstimada;

    @Column(nullable = false)
    private String dataEntrada;

    private String dataAdocao;

    private String condicoesEntrada;

    private String dataObto;

    private String funcionarioRecebedor;







}


