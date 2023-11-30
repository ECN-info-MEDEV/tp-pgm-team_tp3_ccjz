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
    private String comment;
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
 
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }   

    public void printHist(){
        int[] histogram = new int[256]; //init histogram of all possible grey values to all zero
        for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int p = value[i][j]; //get pixel value
                    histogram[p]++;
            }
        }
        System.out.println("The histogram of the PGM image is :");
        for (int i = 0; i < 256; i++) {
            System.out.println("Value "+i+ "has frequency "+histogram[i]);
        }
    }  

    public void to_binary(){
        int treshold = 128;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (value[i][j]<treshold) {
                    value[i][j]=0;
                } else {
                    value[i][j]=1;
                }
            }
        }       
    }

    public ImagePGM difference(ImagePGM im){
        ImagePGM diff = new ImagePGM();
        if (this.height==im.height&this.width==im.width){
            diff.height=im.height;
            diff.width=im.width;
            diff.value=new int[height][width];
            diff.maxValue=0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    diff.value[i][j]=this.value[i][j]-im.value[i][j];
                    if (diff.value[i][j]>diff.maxValue){
                        diff.maxValue=diff.value[i][j];
                    }
                }
            }
            return diff;
        } 
        else{
            throw new IllegalArgumentException("Wrong size of the input image.");
        }
    }

    public void resize(int factor){
        // Create a new array that is of the desired rescaled size
        if (factor==2){
            int[][] scaledImage = new int[height*factor][width*factor];
            // Scale the original array into the new array
            for (int i = 0; i < height; ++i) {
                for (int j = 0; j < width; ++j) {
                    scaledImage[(i*2)][(j*2)] = value[i][j];
                    scaledImage[(i*2) + 1][(j*2)] = value[i][j];
                    scaledImage[(i*2)][(j*2) + 1] = value[i][j];
                    scaledImage[(i*2) + 1][(j*2) + 1] = value[i][j];
                }
            }
        }
        else if (factor==0.5){
           int[][] scaledImage = new int[height*factor][width*factor];
            // Scale the original array into the new array
            for (int i = 0; i < height; i+=2) {
                for (int j = 0; j < width; j+=2) {
                    scaledImage[i/2][j/2] = value[i][j];
                }
            } 
        }
        else {
            throw new IllegalArgumentException("Wrong factor to resize the image : only 2 and 0.5 are possible.");
        }
    }
}
