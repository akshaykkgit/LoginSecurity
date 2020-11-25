package com.m2h.wsi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.m2h.wsi.entity.CodingLanguage;

public interface CodingLanguageRepository extends CrudRepository<CodingLanguage, Integer> {
	@Query("select case when count(c)> 0 then true else false end from CodingLanguage c where lower(c.codingLanguage) like lower(:codingLanguage)")
	boolean existCodingLanguage(@Param("codingLanguage") String codingLanguage);

}
