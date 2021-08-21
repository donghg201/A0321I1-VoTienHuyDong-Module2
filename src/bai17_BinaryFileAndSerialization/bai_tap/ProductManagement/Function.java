package bai17_BinaryFileAndSerialization.bai_tap.ProductManagement;

import CaseStudyModule2.Furama.Models.Customer;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    public static Product findbyID(String productCode) {
        for (Product product : productList) {
            if (product.getProductCode() == productCode) {
                return product;
            }
        }
        return null;
    }

    public static void addNewProduct() {
        String productCode;
        do {
            System.out.print("Enter product code: ");
            productCode = scanner.nextLine();
        } while (findbyID(productCode) != null);
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println();
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println();
        System.out.print("Enter product cost: ");
        String cost = scanner.nextLine();
        System.out.println();
        System.out.print("Enter product other description: ");
        String otherDescription = scanner.nextLine();
        System.out.println();
        Product product = new Product(productCode, productName, manufacturer, cost, otherDescription);
        write(product);
    }

    public static void showAllProduct() {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/MyText3.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> products = (List<Product>) objectInputStream.readObject();
            for (Product product : products) {
                System.out.println(product);
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void showInfo() {
        System.out.print("Enter product code: ");
        String productCode = scanner.nextLine();
        findbyID(productCode);
    }

    public static void write(Object object) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/MyText3.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

