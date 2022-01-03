package com.anhnbt;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hello hello = (Hello) Naming.lookup("rmi://localhost:5000/hello");
			System.out.println(hello.hello("AnhNBT!"));
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
