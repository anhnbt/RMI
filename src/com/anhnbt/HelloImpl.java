package com.anhnbt;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	protected HelloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			Naming.rebind("rmi://localhost:5000/hello", new HelloImpl());
			System.out.println("Server da san sang");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String hello(String name) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Ten la " + name);
		return "Xin chao " + name;
	}

}
