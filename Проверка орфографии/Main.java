import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TextEditor extends JFrame {
    private JTextArea textArea; // Поле для отображения и редактирования текста
    private JMenuBar menuBar; // Панель меню
    private JMenu fileMenu; // Меню "Файл"
    private JMenuItem openMenuItem; // Пункт меню "Открыть"
    private JMenuItem saveMenuItem; // Пункт меню "Сохранить"
    
    public TextEditor() {
        setTitle("Текстовый редактор");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setLayout(new BorderLayout());
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        setJMenuBar(menuBar);
        setVisible(true);
        
        // Добавляем DocumentFilter для автозамены слов
        ((AbstractDocument) textArea.getDocument()).setDocumentFilter(new AutoReplaceDocumentFilter());
    }
    
    private void initComponents() {
        textArea = new JTextArea();
        menuBar = new JMenuBar();
        fileMenu = new JMenu("Файл");
        openMenuItem = new JMenuItem("Открыть");
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });
        saveMenuItem = new JMenuItem("Сохранить");
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
    }
    
    private void openFile() {
        // ...
    }
    
    private void saveFile() {
        // ...
    }
    
    private void showMessage(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }

    // Реализуем DocumentFilter для автозамены слов
    private class AutoReplaceDocumentFilter extends DocumentFilter {
        private final String[] incorrectWords = {"неправильное", "слово"};
        private final String[] correctWords = {"правильное", "слово"};
        
        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            super.replace(fb, offset, length, text, attrs);
            
            // Заменяем неправильные слова на правильные
            String content = fb.getDocument().getText(0, fb.getDocument().getLength());
            for (int i = 0; i < incorrectWords.length; i++) {
                content = content.replaceAll(incorrectWords[i], correctWords[i]);
            }
            textArea.setText(content);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextEditor();
            }
        });
    }
}