package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton bioButton = new JButton("Bio");
        JButton educationButton = new JButton("Education");
        JButton hobbiesButton = new JButton("Hobbies");

        //panel for introduction
        JPanel introPanel = new JPanel();
        introPanel.add(new JLabel("Hi I am Chandupa and this is my introduction"));


        //panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(bioButton);
        buttonPanel.add(educationButton);
        buttonPanel.add(hobbiesButton);

        //panel with card layout
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());

        //panel for the cards
        JPanel bioPanel = new JPanel();
        bioPanel.add(new JLabel("I am Chandupa " +
                "I am 22 Years old ." +
                "I am a Software Engineering student of the University of Westminster "));

        JPanel educationPanel = new JPanel();
        educationPanel.add(new JLabel("I Had my primary education at Royal International School Kegalle, " +
                "Had My Secondary Education at Kegalu Vidyalaya, " +
                "Currently I am studying at the University of Westminster"));


        JPanel hobbiesPanel = new JPanel();
        hobbiesPanel.add(new JLabel("I love to play video games, " +
                "I love to watch movies, " +
                "I love to watch football games "));

        //adding cards to the card panel
        cardPanel.add(bioPanel, "Bio");
        cardPanel.add(educationPanel, "Education");
        cardPanel.add(hobbiesPanel, "Hobbies");

        //adding the action listeners to the buttons

        bioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cardPanel.getLayout());
                cl.show(cardPanel, "Bio");
            }
        });

        educationButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CardLayout cl = (CardLayout)(cardPanel.getLayout());
                cl.show(cardPanel, "Education");
            }
        });


        hobbiesButton.addActionListener((new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CardLayout cl = (CardLayout)(cardPanel.getLayout());
                cl.show(cardPanel, "Hobbies");
            }
        }));
        panel.add(introPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(cardPanel, BorderLayout.SOUTH);


        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

    }
}