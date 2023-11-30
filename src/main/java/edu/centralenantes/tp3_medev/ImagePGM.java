/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.tp3_medev;

/**
 *
 * @author 23031
 */
public class ImagePGM {
    private int height;
    private int width;
    private int maxValue;
    private int[][] value;

    public ImagePGM(int height, int width, int maxValue, int[][] value) {
        this.height = height;
        this.width = width;
        this.maxValue = maxValue;
        this.value = value;
    }

    public ImagePGM() {
        this.height = 10;
        this.width = 20;
        this.maxValue = 255;
        this.value = new int[width][height];
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }
    
    
    
}
