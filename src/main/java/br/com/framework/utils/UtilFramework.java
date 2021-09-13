package br.com.framework.utils;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Classe Responsavel por fazer o log do usuario que esta excluindo,inserindo ou editando no BD(Hibernate Envers)
 * v : 10.
 * @author andre
 *
 */
@Component
public class UtilFramework implements Serializable{
	private static final long serialVersionUID = 1L;

	private static ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();
	
	/**
	 * Esse metodo aceita somente uma requisi�ao por vez. Se outra requisi��o tentar acessar
	 * esse metodo enquanto outra esta o usando, ela tera que esperar a 1� requisi�ao
	 * se encerrar.
	 * @return ThreadLocal
	 */
	public synchronized static ThreadLocal<Long> getThreadLocal() {
		return threadLocal;
	}
}
