import javax.swing.*;
import java.nio.file.*;

public class DeleteFile {
    public static void deletarArquivo() {
        try {
            JFileChooser chooser = new JFileChooser();

            chooser.setDialogTitle("Selecione o arquivo que deseja apagar");
            chooser.setApproveButtonText(null);

            int returnVal = chooser.showOpenDialog(null);
            String fileFullPath = "";

            if(returnVal == JFileChooser.APPROVE_OPTION) {
                fileFullPath = chooser.getSelectedFile().getAbsolutePath();
            } else {
                System.out.println("Arquivo não selecionado.");
                System.exit(0);
            }

            Path pathOrigin = Paths.get(fileFullPath);
            Files.delete(pathOrigin);
            System.out.println("Arquivo apagado com sucesso!");
        } catch (Exception e) {
            System.err.println("Não foi possivel deletar o arquivo");
        }
    }

    public static void main(String[] args) throws Exception {
        deletarArquivo();
    }
}
