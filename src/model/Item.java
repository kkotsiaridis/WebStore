/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Konstantinos
 */
public class Item {
    
    public int Barcode;

    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int Barcode) {
        this.Barcode = Barcode;
    }


    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String Colour;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Item(int Barcode, String Name, String Colour, String Description) {
        this.Barcode = Barcode;
        this.Name = Name;
        this.Colour = Colour;
        this.Description = Description;
    }

}
