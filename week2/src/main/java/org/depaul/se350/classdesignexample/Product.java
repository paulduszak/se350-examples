package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

import java.util.Objects;

public class Product {
    public enum ProductType {
        PRINT, FOOD, HEALTH, GENERAL
    }

    private String productName;
    private double productCost;
    private ProductType productType; 
    private static final double BASE_TAX_RATE = 0.085;

    public Product(String name, double cost, ProductType type)
            throws NullParameterException, BadParameterException {
        setProductName(name);
        setProductCost(cost);
        setProductType(type);
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String pName) throws NullParameterException, BadParameterException {
        if (pName == null) {
            throw new NullParameterException("Null value passed in for setProductName");
        }
        if (pName.length() <= 0 || pName.length() > 40) {
            throw new BadParameterException("Bad value passed to setProductName: " + pName);
        }
        productName = pName;
    }

    public double getProductCost() {
        return productCost;
    }

    private void setProductCost(double pCost) throws BadParameterException {
        if (pCost < 0.0) {
            throw new BadParameterException( "Bad value passed to setProductCost: " + pCost);
        }
        productCost = pCost;
    }

    public ProductType getProductType() {
        return productType;
    }

    private void setProductType(ProductType pType)
            throws NullParameterException {
        if (pType == null) {
            throw new NullParameterException("Null value passed to setProductType");
        }
        productType = pType;
    }

    public double calculateTax() {
        double taxRate;
        if (getProductType() == ProductType.GENERAL) {
            taxRate = getProductCost() * BASE_TAX_RATE;
        } else if (getProductType() == ProductType.FOOD) {
            if (getProductCost() > 49.99) {
                taxRate = getProductCost() * BASE_TAX_RATE / 2.0;
            } else {
                taxRate = getProductCost() * BASE_TAX_RATE / 3.0;
            }
        } else if (getProductType() == ProductType.HEALTH) {
            taxRate = getProductCost() * BASE_TAX_RATE * 0.1;
        } else {
            taxRate = 0.0;
        }
        return taxRate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Product Name:", getProductName()));
        sb.append(String.format("%-20s $%.2f%n", "Product Cost:", getProductCost()));
        sb.append(String.format("%-20s %s%n", "Product Type:", getProductType()));
        sb.append(String.format("%-20s $%.2f%n", "Product Tax:", calculateTax()));
        sb.append(String.format("%-20s $%.2f%n", "Price Including Tax:",
                (getProductCost() + calculateTax())));
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Product other = (Product) obj;
        if (!getProductName().equals(other.getProductName())) {
            return false;
        }
        if (getProductCost() != other.getProductCost()) {
            return false;
        }
        if (getProductType() != other.getProductType()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(productName, productCost, productType);
    }
}
