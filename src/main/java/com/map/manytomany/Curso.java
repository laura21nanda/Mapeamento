package com.map.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "curso")
public class Curso {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
@ManyToMany (mappedBy = "cursos")
private List<Aluno> alunos;
}
