/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.centralenantes.tp3_medev;

/**
 *
 * @author chloe
 */
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.util.*;
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
            
            // 写入图像数据
            for (int i = 0; i < im.getHeight(); i++) {
                for (int j = 0; j < im.getWidth(); j++) {
                    writer.write(im.getValue()[i][j] + " ");
                }
                writer.newLine();
            }
            
            writer.close();
            System.out.println(  "add a new file at : "+filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readImage(String filePath,ImagePGM im) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String format = reader.readLine(); 
            String comment = reader.readLine(); 
            im.setComment(comment);
            String[] dimensions = reader.readLine().split(" "); 
            im.setWidth(Integer.parseInt(dimensions[0]));
            im.setHeight( Integer.parseInt(dimensions[1]));
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

    
    
}

