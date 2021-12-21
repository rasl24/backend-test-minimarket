package com.geekbrains.backend.test.db;

import com.geekbrains.backend.test.miniMarket.model.Product;
import com.geekbrains.db.dao.CategoriesMapper;
import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Categories;
import com.geekbrains.db.model.CategoriesExample;
import com.geekbrains.db.model.Products;
import com.geekbrains.db.model.ProductsExample;

import java.util.List;

public class TestDb {

    public static void main(String[] args) {
        DbService dbService = new DbService();
        ProductsMapper productsMapper = dbService.getProductsMapper();
        // вывести 1 продукт
        Products product = productsMapper.selectByPrimaryKey(1L);
        //System.out.println(product);

        // создание продукта
//        Products forCreate = new Products();
//        forCreate.setTitle("Coca cola");
//        forCreate.setPrice(50);
//        forCreate.setCategoryId(1L);

        //productsMapper.insert(forCreate);

        //вывести все продукты
        ProductsExample filter = new ProductsExample();
        List<Products> products = productsMapper.selectByExample(filter);
        //System.out.println(products);

        filter.createCriteria()
                .andCategoryIdEqualTo(2L);
       // System.out.println(productsMapper.selectByExample(filter));

        filter.clear();
        filter.createCriteria()
                .andPriceBetween(51, 1000);
        //System.out.println(productsMapper.selectByExample(filter));

        product.setPrice(105);
        productsMapper.updateByPrimaryKey(product);
        //System.out.println(productsMapper.selectByPrimaryKey(1L));

        CategoriesMapper categoriesMapper = dbService.getCategoriesMapper();
        Categories createCategoryClothes = new Categories();
        createCategoryClothes.setTitle("Clothes");
        //categoriesMapper.insert(createCategoryClothes);

        Categories createCategorySport = new Categories();
        createCategorySport.setTitle("Sport");
        //categoriesMapper.insert(createCategorySport);

        Categories createCategoryPc = new Categories();
        createCategoryPc.setTitle("PC");
        //categoriesMapper.insert(createCategoryPc);

        Categories createCategoryAuto = new Categories();
        createCategoryAuto.setTitle("Auto");
        //categoriesMapper.insert(createCategoryAuto);

        CategoriesExample categoriesExample = new CategoriesExample();
        List<Categories> categories = categoriesMapper.selectByExample(categoriesExample);
        System.out.println(categories);

        Products createClotheOne = new Products();
        createClotheOne.setTitle("Парка Huppa Roman");
        createClotheOne.setPrice(9937);
        createClotheOne.setCategoryId(11L);
        productsMapper.insert(createClotheOne);

        Products createClotheTwo = new Products();
        createClotheTwo.setTitle("Ботинки GEOX");
        createClotheTwo.setPrice(10143);
        createClotheTwo.setCategoryId(11L);
        productsMapper.insert(createClotheTwo);

        Products createClotheTree = new Products();
        createClotheTree.setTitle("Футболка");
        createClotheTree.setPrice(1000);
        createClotheTree.setCategoryId(11L);
        productsMapper.insert(createClotheTree);

        filter.clear();
        filter.createCriteria()
                .andCategoryIdEqualTo(11L);
         System.out.println(productsMapper.selectByExample(filter));

        Products createSportOne = new Products();
        createSportOne.setTitle("Беговая дорожка AppleGate T5 Panel");
        createSportOne.setPrice(34990);
        createSportOne.setCategoryId(12L);
        productsMapper.insert(createSportOne);

        Products createSportTwo = new Products();
        createSportTwo.setTitle("Карманная удочка-ручка");
        createSportTwo.setPrice(1160);
        createSportTwo.setCategoryId(12L);
        productsMapper.insert(createSportTwo);

        Products createSportTree = new Products();
        createSportTree.setTitle("Катушка Flagman Blackfire 2500 3+1 ш.п.");
        createSportTree.setPrice(2000);
        createSportTree.setCategoryId(12L);
        productsMapper.insert(createSportTree);

        filter.clear();
        filter.createCriteria()
                .andCategoryIdEqualTo(12L);
        System.out.println(productsMapper.selectByExample(filter));

        Products createPcOne = new Products();
        createPcOne.setTitle("Моноблок Apple iMac 24");
        createPcOne.setPrice(170000);
        createPcOne.setCategoryId(13L);
        productsMapper.insert(createPcOne);

        Products createPcTwo = new Products();
        createPcTwo.setTitle("Ноутбук 14\" HP 14s-fq0023ur");
        createPcTwo.setPrice(38000);
        createPcTwo.setCategoryId(13L);
        productsMapper.insert(createPcTwo);

        Products createPcTree = new Products();
        createPcTree.setTitle("Игровая клавиатура Gembird KB-G550L");
        createPcTree.setPrice(2500);
        createPcTree.setCategoryId(13L);
        productsMapper.insert(createPcTree);

        filter.clear();
        filter.createCriteria()
                .andCategoryIdEqualTo(13L);
        System.out.println(productsMapper.selectByExample(filter));

        Products createAutoOne = new Products();
        createAutoOne.setTitle("Автошина Nokian Nordman 7");
        createAutoOne.setPrice(6500);
        createAutoOne.setCategoryId(14L);
        productsMapper.insert(createAutoOne);

        Products createAutoTwo = new Products();
        createAutoTwo.setTitle("Колесный диск Magnetto Wheels 14003");
        createAutoTwo.setPrice(1500);
        createAutoTwo.setCategoryId(14L);
        productsMapper.insert(createAutoTwo);

        Products createAutoTree = new Products();
        createAutoTree.setTitle("Автомобильный компрессор DreamCar");
        createAutoTree.setPrice(2000);
        createAutoTree.setCategoryId(14L);
        productsMapper.insert(createAutoTree);

        filter.clear();
        filter.createCriteria()
                .andCategoryIdEqualTo(14L);
        System.out.println(productsMapper.selectByExample(filter));


    }
}
