package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable{

	void save(T obj) throws Exception;
	
	void persist(T obj) throws Exception;
	
	void saveOrUpdate(T obj) throws Exception;
	
	void update(T obj) throws Exception;
	
	void delete(T obj) throws Exception;
	
	T merge (T obj) throws Exception;
	
	List<T> findAll(Class<T> objs) throws Exception;
	
	Object FindById(Class<T> entidade , Long id) throws Exception;
	
	T FindByIdPorT(Class<T> entidade , Long id) throws Exception;
	
	List<T> findListByQueryDinamica(String sql) throws Exception;
	
	// Executa update com HQL
	void executeUpdateQueryDinamica(String hql) throws Exception;
	
	// Excuta update com SQL puro
	void executeUpdateSQLDinamica(String sql) throws Exception;
	
	// limpa a sessao do Hibernate
	void clearSession() throws Exception;
	
	// Retira um objeto da sessao do hibernate
	void evict (Object obj) throws Exception;
	
	Session getSession() throws Exception;
	
	List<?> getListSQLDinamica(String sql) throws Exception;
	
	// JDBC do spring 3 classes
	JdbcTemplate getJdbcTemplate();
	SimpleJdbcTemplate getSimpleJdbcTemplate();
	SimpleJdbcInsert getSimpleJdbcInsert();
	
	Long totalRegistro(String table) throws Exception;
	
	Query obterQuery(String query) throws Exception;
	
	List<Object[]> getListaSQLDinamicaArray(String sql) throws Exception;
	
	// Carregamento dinamicao com JSF e primefaces
	List<T> findListByQueryDinamica(String query, int iniciaNoRegistro, int maximoResultado) throws Exception;
}
