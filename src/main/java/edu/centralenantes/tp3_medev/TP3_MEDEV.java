/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.centralenantes.tp3_medev;

/**
 *
 * @author chloe et jing
 */
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.util.*;
import java.io.IOException;

public class TP3_MEDEV {

    private ArrayList<ImagePGM> images;

    public void writeImage(String filePath, ImagePGM im) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("P2"); // 
            writer.newLine();
            writer.write(im.getComment());
            writer.newLine();
            writer.write(im.getWidth() + " " + im.getHeight());
            writer.newLine();
            writer.write(im.getMaxValue() + "");
            writer.newLine();

            for (int i = 0; i < im.getHeight(); i++) {
                for (int j = 0; j < im.getWidth(); j++) {
                    writer.write(im.getValue()[i][j] + " ");
                }
                writer.newLine();
            }

            writer.close();
            System.out.println("add a new file at : " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readImage(String filePath, ImagePGM im) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String format = reader.readLine();
            String comment = reader.readLine();
            im.setComment(comment);
            String[] dimensions = reader.readLine().split(" ");
            im.setWidth(Integer.parseInt(dimensions[0]));
            im.setHeight(Integer.parseInt(dimensions[1]));
            im.setMaxValue(Integer.parseInt(reader.readLine()));

            int[][] temp = new int[im.getWidth()][im.getHeight()];
            for (int i = 0; i < im.getHeight(); i++) {
                String[] pixelValues = reader.readLine().split(" ");
                for (int j = 0; j < im.getWidth(); j++) {
                    temp[i][j] = Integer.parseInt(pixelValues[j]);
                }
            }
            im.setValue(temp);

            reader.close();
            System.out.println("readPGM" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TP3_MEDEV processor = new TP3_MEDEV();
        ImagePGM image = new ImagePGM();

        String inputFilePath = "C:\\Users\\23031\\Documents\\tp-pgm-team_tp3_ccjz\\image.pgm";
        String outputFilePath = "C:\\Users\\23031\\Documents\\tp-pgm-team_tp3_ccjz\\outputImage.pgm";

        processor.readImage(inputFilePath, image);
        System.out.println("Image loaded successfully.");
        image.to_binary();
        // image.printHist(); 
        processor.writeImage(outputFilePath, image);
        System.out.println("Processed image saved successfully.");
    }
