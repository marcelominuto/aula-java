package br.com.tt.dao;

import java.util.List;
public interface Dao<T> {
	void salvar(T t);
	T buscar(Long id);
	T buscar(T t);
	List<T> consultar();
	List<T> consultar(T t);
	List<T> consultar(List<T> lista);
	void deletar(Long id);
	void deletar(T t);
}
