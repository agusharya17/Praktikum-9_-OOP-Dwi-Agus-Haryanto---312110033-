package praktikum.pkg9;

import javax.swing.*;

public class Utama{
    public static void main(String[] args){
        JFrame myFrame;
        
        myFrame = new JFrame();
        myFrame.setSize(500,400);
        myFrame.setVisible(true);
        
        JOptionPane.showMessageDialog(myFrame, "Saya Suka Java");
        
        String name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");
        while (name.isEmpty()){
            JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput nama anda...");
            name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");
        }
        
        String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");
        while (yearStr.isEmpty()) {
            JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput nama anda...");
            yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");
        }
        int year = Integer.parseInt(yearStr);
        int age = 2022 - year;
        
        
        JOptionPane.showMessageDialog(myFrame,"Hallo " + name + ",umur anda " + age +"tahun.");
        myFrame.dispose();
    }
}