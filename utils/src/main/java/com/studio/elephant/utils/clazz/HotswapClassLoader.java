package com.studio.elephant.utils.clazz;

import java.net.URL;
import java.net.URLClassLoader;

public class HotswapClassLoader extends URLClassLoader {

	private URL[] urls;
	private ClassLoader parent;
	
	public HotswapClassLoader(URL[] urls) {
		this(urls,null);
	}

	public HotswapClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
		this.urls = urls;
		this.parent = parent==null?Thread.currentThread().getContextClassLoader():parent;
	}


	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return super.findClass(name);
	}

}
