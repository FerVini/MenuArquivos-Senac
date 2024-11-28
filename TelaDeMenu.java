import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenu extends JFrame { 

    private final JMenu cadastroMenu;
    private final JLabel lblNomeDaTela;
    private final JMenuBar menuBar;
    private final JMenuItem abrirItem;
    private final JMenuItem copiarItem;
    private final JMenuItem moverItem;
    private final JMenuItem apagarItem;
    private final JMenuItem renomearItem;
    private final JMenuItem sobreItem;
    private final JMenuItem sairItem;
    
    public TelaDeMenu() {
        super("Tela de Menu");
        
        cadastroMenu = new JMenu("Arquivo");
        
        lblNomeDaTela = new JLabel("Tela de Menu", SwingConstants.CENTER);

        menuBar = new JMenuBar();

        abrirItem = new JMenuItem("Abrir");
        copiarItem = new JMenuItem("Copiar");
        moverItem = new JMenuItem("Mover");
        apagarItem = new JMenuItem("Apagar");
        renomearItem = new JMenuItem("Renomear");
        sobreItem = new JMenuItem("Sobre");
        sairItem = new JMenuItem("Sair");

        cadastroMenu.add(abrirItem);
        cadastroMenu.add(copiarItem);
        cadastroMenu.add(moverItem);
        cadastroMenu.add(apagarItem);
        cadastroMenu.add(renomearItem);
        cadastroMenu.add(sobreItem);
        cadastroMenu.add(sairItem);

        menuBar.add(cadastroMenu);
        setJMenuBar(menuBar);

        add(lblNomeDaTela, BorderLayout.CENTER);

        abrirItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    OpenFile.abrirArquivo();
                }
            }
        );

        copiarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    CopyFile.copiarArquivo();
                }
            }
        );
        
        moverItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    MoveFile.moverArquivo();
                }
            }
        );
        
        renomearItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    RenameFile.renomearArquivo();
                }
            }
        );

        apagarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    DeleteFile.deletarArquivo();
                }
            }
        );

    }

    public static void main(String[] args){
        TelaDeMenu appTelaDeMenu = new TelaDeMenu();
        appTelaDeMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeMenu.setSize(300, 300);
        appTelaDeMenu.setVisible(true);
    }

}