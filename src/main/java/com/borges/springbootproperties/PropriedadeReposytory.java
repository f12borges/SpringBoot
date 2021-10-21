package com.borges.springbootproperties;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PropriedadeReposytory extends PagingAndSortingRepository<Propriedade, String>{
	
	@Query("select c from Propriedade c where c.nome like %:filtro% order by categoria,subcategoria,nome")
	
	public List<Propriedade> findbyFiltro(@Param("filtro")String filtro);

}
