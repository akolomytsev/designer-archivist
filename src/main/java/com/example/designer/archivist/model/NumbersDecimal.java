package com.example.designer.archivist.model;

public class NumbersDecimal {
    private Long id; // id детали (может и не нужен)
    private int partTypeByDivisibility; // тип детали по делимости (деталь, сборка или изделие целиком), выражается цифрами от 1 до 9 включительно
    private String manufacturer; // завод изготовитель, выражается двумя заглавными буквами (в основном ПБ)
    private int nameOfThePartByShapeMethodOfManufactureAndMaterial; // Три цифры детали по способу изготовления, материалу и форме
    private int numberDetails; // три цифры
    private String nameDetails; // Название детали согласно классификатору
    // первичное применение
    // как то вогнать в какие изделия входит
    //

    public NumbersDecimal(Long id, int partTypeByDivisibility, String manufacturer, int nameOfThePartByShapeMethodOfManufactureAndMaterial, int numberDetails, String nameDetails) {
        this.id = id;
        this.partTypeByDivisibility = partTypeByDivisibility;
        this.manufacturer = manufacturer;
        this.nameOfThePartByShapeMethodOfManufactureAndMaterial = nameOfThePartByShapeMethodOfManufactureAndMaterial;
        this.numberDetails = numberDetails;
        this.nameDetails = nameDetails;
    }

    public NumbersDecimal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPartTypeByDivisibility() {
        return partTypeByDivisibility;
    }

    public void setPartTypeByDivisibility(int partTypeByDivisibility) {
        this.partTypeByDivisibility = partTypeByDivisibility;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNameOfThePartByShapeMethodOfManufactureAndMaterial() {
        return nameOfThePartByShapeMethodOfManufactureAndMaterial;
    }

    public void setNameOfThePartByShapeMethodOfManufactureAndMaterial(int nameOfThePartByShapeMethodOfManufactureAndMaterial) {
        this.nameOfThePartByShapeMethodOfManufactureAndMaterial = nameOfThePartByShapeMethodOfManufactureAndMaterial;
    }

    public int getNumberDetails() {
        return numberDetails;
    }

    public void setNumberDetails(int numberDetails) {
        this.numberDetails = numberDetails;
    }

    public String getNameDetails() {
        return nameDetails;
    }

    public void setNameDetails(String nameDetails) {
        this.nameDetails = nameDetails;
    }
}
