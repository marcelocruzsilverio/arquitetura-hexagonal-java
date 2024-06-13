package br.com.boletojuros.adapter.datasource.database.repository;

import br.com.boletojuros.adapter.datasource.database.entity.BoletoCalculadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoCalculadoRepository extends JpaRepository<BoletoCalculadoEntity, Long> {
}
