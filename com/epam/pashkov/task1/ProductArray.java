package com.epam.pashkov.task1;

import java.util.Arrays;

/**
 * Created by Yaroslav on 22.04.2015.
 */
public class ProductArray {
    private int length = 0;
    private Product[] products;

    public void add(Product p){
        if(length == 0) {
            products = new Product[1];
            products[0] = p;
        }

        else{
            Product[] prTemp = new Product[length+1];
            System.arraycopy(products,0,prTemp,0,products.length);
            products = prTemp;
            products[length] = p;
        }
        length++;
    }

    public int count() {
        return length;
    }

    public Product get(int index){
        if(index>=0 && index<length){
            return products[index];
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void sort(){
        Arrays.sort(products, new SortByPrice());
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(Product p: products){
            sb.append(p + "\n");
        }
        return sb.toString();
    }
}
