package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu
{
    private JPanel Menu;
    private JButton Exit;
    private JPanel PlayPanel;
    private JButton Play;
    private JComboBox Mode;
    private JSeparator Separador1;
    private JSeparator Separador2;
    private JLabel Título;

    public Menu()
    {
        Play.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane.showMessageDialog(null, "Tu puta madre");
            }
        });

        Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane.showMessageDialog(null, "Conchudo");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Menu"); // Crea un JFrame que se enlaza con este archivo/clase

        frame.setContentPane(new Menu().Menu); // Enlaza el JPanel creado con la GUI (JFrame)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Determina la acción de cerrar la ventana al pulsar la "x"
        frame.pack(); // Ordena adecuadamente las cosas
        frame.setVisible(true); // Lo hace visible
    }
}
