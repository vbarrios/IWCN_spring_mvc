package com.iwcn.master.services;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    LinkedList<Producto> productList;
    public UserService()
    {
    	productList=new LinkedList<Producto>();
    }
    public void addProduct(String name,int reference,int price,int stock)
    {
    	productList.addLast(new Producto(name,reference,price,stock));
    }
    public void removeProduct(String name)
    {
    	int index=0;
    	for(int i=0;i<productList.size();i++)
    	{
    		if(productList.get(i).name_.equals(name))
    		{
    			index=i;
    			break;
    		}
    	}
    	productList.remove(index);
    	
    }
    public Producto getProduct(String name)
    {
    	int index=0;
    	for(int i=0;i<productList.size();i++)
    	{
    		if(productList.get(i).name_.equals(name))
    		{
    			index=i;
    			break;
    		}
    	}
    	return getProduct(index);
    }
    public Producto getProduct(int Index)
    {
    	return productList.get(Index);
    }
    public LinkedList<Producto> getAll()
    {
    	return productList;
    }
    	
    
}


		

