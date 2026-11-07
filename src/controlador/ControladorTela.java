/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import modelo.ModeloCadastro;
import view.TelaDeCadastro;
import view.TelaDeConsulta;

/**
 *
 * @author Discentes
 */
public class ControladorTela {

    private JDesktopPane jDesktop;
    private ArrayList<ModeloCadastro> listaMovimentacoes;

    public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
        listaMovimentacoes = new ArrayList<>();
    }

    public void abrirTelaDeCadastro() {
        jDesktop.removeAll();
        Dimension resolucao = jDesktop.getSize();
        TelaDeCadastro tela = new TelaDeCadastro(listaMovimentacoes);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        jDesktop.add(tela);
        tela.setVisible(true);
        jDesktop.revalidate();
        jDesktop.repaint();
    }

    public void abrirTelaDeConsulta() {
        jDesktop.removeAll();
        Dimension resolucao = jDesktop.getSize();
        TelaDeConsulta tela = new TelaDeConsulta(listaMovimentacoes);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        jDesktop.add(tela);
        tela.setVisible(true);
        jDesktop.revalidate();
        jDesktop.repaint();
    }
}
