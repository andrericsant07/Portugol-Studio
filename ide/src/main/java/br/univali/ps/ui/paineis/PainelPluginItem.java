/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.ps.ui.paineis;

import br.univali.ps.ui.swing.ColorController;
import br.univali.ps.ui.swing.Themeable;
import br.univali.ps.ui.swing.weblaf.WeblafUtils;
import br.univali.ps.ui.utils.IconFactory;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Adson Esteves
 */
public class PainelPluginItem extends javax.swing.JPanel implements Themeable{

    /**
     * Creates new form PainelPluginItem
     */
       
    File pastaDeInstalacao;
    String linkDownload;
    String descricao;
    
    public PainelPluginItem() {
        initComponents();
        configurarCores();
    }

    @Override
    public void configurarCores() 
    {        
        if(WeblafUtils.weblafEstaInstalado())
        {
            WeblafUtils.configuraWebLaf(seletorPlugin);
        }
        setBackground(ColorController.FUNDO_CLARO);
        labelPluginInstalado.setBackground(ColorController.PROGRESS_BAR);
        labelPluginInstalado.setForeground(ColorController.COR_LETRA);
        seletorPlugin.setSelectedIcon(IconFactory.createIcon(IconFactory.CAMINHO_ICONES_PEQUENOS, "selected.png"));
        seletorPlugin.setIcon(IconFactory.createIcon(IconFactory.CAMINHO_ICONES_PEQUENOS, "unselected.png"));
    }

    public JLabel getLabelPluginInstalado() {
        return labelPluginInstalado;
    }

    public void setLabelPluginInstalado(JLabel labelPluginInstalado) {
        this.labelPluginInstalado = labelPluginInstalado;
    }

    public JCheckBox getSeletorPlugin() {
        return seletorPlugin;
    }

    public void setSeletorPlugin(JCheckBox seletorPlugin) {
        this.seletorPlugin = seletorPlugin;
    }

    public File getPastaDeInstalacao() {
        return pastaDeInstalacao;
    }

    public void setPastaDeInstalacao(File pastaDeInstalacao) {
        this.pastaDeInstalacao = pastaDeInstalacao;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setAction(MouseListener action)
    {
        labelPluginInstalado.addMouseListener(action);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletorPlugin = new javax.swing.JCheckBox();
        labelPluginInstalado = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new java.awt.BorderLayout());

        seletorPlugin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        seletorPlugin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(seletorPlugin, java.awt.BorderLayout.WEST);

        labelPluginInstalado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPluginInstalado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/ps/ui/icones/Dark/pequeno/plugin.png"))); // NOI18N
        labelPluginInstalado.setText("plugin instalado");
        add(labelPluginInstalado, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPluginInstalado;
    private javax.swing.JCheckBox seletorPlugin;
    // End of variables declaration//GEN-END:variables
}
