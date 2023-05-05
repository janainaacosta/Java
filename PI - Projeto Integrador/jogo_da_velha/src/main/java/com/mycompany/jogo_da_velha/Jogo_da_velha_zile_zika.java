package com.mycompany.jogo_da_velha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Jogo_da_velha_zile_zika extends JFrame {

    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    JPanel painelFundo; // novo JPanel para o painel de fundo

    public Jogo_da_velha_zile_zika() {
        setSize(500, 500); // define o tamanho do JFrame
        setLocationRelativeTo(null); // centraliza o JFrame na tela
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criar painel de fundo
        painelFundo = new JPanel();
        painelFundo.setBackground(Color.RED);
        painelFundo.setLayout(null);

        add(painelFundo);

        // adicionar botões ao painel de fundo
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                painelFundo.add(bt[cont]);
                bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                cont++;
            }
        }

        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }

        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(bt[0]);
                }
            }
        });

        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        });

        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        });

        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        });

        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        });

        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        });

        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        });

        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        });

        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        });

painelFundo.setBounds(0, 0, 400, 500);

pack(); // ajustar tamanho do JFrame
setSize(500, 500); // define o tamanho do JFrame
setLocationRelativeTo(null); // centraliza o JFrame na tela
setVisible(true); // torna o JFrame visível

    }

    public void mudar(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
            btn.setBackground(new Color(0, 150, 225)); // Define a cor de fundo do botão como vermelha
            btn.setForeground(xo ? Color.WHITE : Color.WHITE);

        } else {
            btn.setText("X");
            xo = true;
            btn.setBackground(new Color(225, 150, 53)); // Define a cor de fundo do botão como azul
            btn.setForeground(xo ? Color.WHITE : Color.WHITE);
        }
        ganhou();
    }

    public void ganhou() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }
        if ("X".equals(bt[0].getText()) && "X".equals(bt[1].getText()) && ((((((("X".equals(bt[2].getText()) || ("X".equals(bt[3].getText()) && bt[4].getText() == "X" && bt[5].getText() == "X")) || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")) || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")) || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")) || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[0].getText() == "X")) || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")) || ("X".equals(bt[6].getText()) && bt[4].getText() == "X" && bt[2].getText() == "X"))) {
        } else if ((!"O".equals(bt[0].getText()) || bt[1].getText() != "O") || bt[2].getText() != "O"
                && ((bt[3].getText() != "O" || bt[4].getText() != "O") || bt[5].getText() != "O")
                && ((bt[6].getText() != "O" || bt[7].getText() != "O") || bt[8].getText() != "O")
                && ((bt[0].getText() != "O" || bt[3].getText() != "O") || bt[6].getText() != "O")
                && ((bt[1].getText() != "O" || bt[4].getText() != "O") || bt[7].getText() != "O")
                && ((bt[2].getText() != "O" || bt[5].getText() != "O") || bt[0].getText() != "O")
                && ((bt[0].getText() != "O" || bt[4].getText() != "O") || bt[8].getText() != "O")
                && ((bt[6].getText() != "O" || bt[4].getText() != "O") || bt[2].getText() != "O")) if (cont == 9) {
                    JOptionPane.showMessageDialog(null, "EMPATE !!!!!!!");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "X GANHOU!!!!!!");
                    
                    
                    limpar();
                } else {
            JOptionPane.showMessageDialog(null, "O GANHOU!!!!!!");
            
            limpar();
        }
    }

    public void limpar() {
    int contador = 0;
    for (int i = 0; i < 9; i++) {
        bt[i].setText("");
        bt[contador].setBackground(xo ? Color.WHITE : Color.WHITE);
        click[i] = false;
        contador++;
    }
    }

    public static void main(String[] args) {
        new Jogo_da_velha_zile_zika();

    }
}
