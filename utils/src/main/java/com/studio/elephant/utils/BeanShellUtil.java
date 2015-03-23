package com.studio.elephant.utils;

import bsh.EvalError;
import bsh.Interpreter;

public final class BeanShellUtil {
	/**
	 * 
	 * @param scriptStr
	 * @return 执行结果
	 * @throws EvalError
	 */
	public static Object exeBeanShell(String scriptStr) throws EvalError{
		Interpreter bsh = new Interpreter();
		return bsh.eval(scriptStr);
	}
	/**
	 * 
	 * @param scriptBuilder
	 * @return 执行结果 
	 * @throws EvalError
	 */
	public static Object exeBeanShell(StringBuilder scriptBuilder) throws EvalError{
		return exeBeanShell(scriptBuilder.toString());
	}

}
