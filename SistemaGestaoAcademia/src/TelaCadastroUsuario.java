import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TelaCadastroUsuario extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField cpfField;
    private JTextField enderecoField;
    private JTextField idAlunoField;
    private JTextField dataNascimentoField;
    private JTextField nomeCompletoField;
    private JButton cadastrarButton;
    private JButton voltarButton;
    public TelaCadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));
        panel.add(new JLabel("Nome de Usuário:"));
        usernameField = new JTextField();
        panel.add(usernameField);
        panel.add(new JLabel("Senha:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);
        panel.add(new JLabel("CPF:"));
        cpfField = new JTextField();
        panel.add(cpfField);
        panel.add(new JLabel("Endereço:"));
        enderecoField = new JTextField();
        panel.add(enderecoField);
        panel.add(new JLabel("ID do Aluno:"));
        idAlunoField = new JTextField();
        panel.add(idAlunoField);
        panel.add(new JLabel("Data de Nascimento:"));
        dataNascimentoField = new JTextField();
        panel.add(dataNascimentoField);
        panel.add(new JLabel("Nome Completo:"));
        nomeCompletoField = new JTextField();
        panel.add(nomeCompletoField);
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new CadastrarButtonListener());
        panel.add(cadastrarButton);
        voltarButton = new JButton("Home");
        voltarButton.addActionListener(new VoltarButtonListener());
        panel.add(voltarButton);
        add(panel);
        setVisible(true);
    }
    private class CadastrarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailField.getText();
            String cpf = cpfField.getText();
            String endereco = enderecoField.getText();
            String idAluno = idAlunoField.getText();
            String dataNascimento = dataNascimentoField.getText();
            String nomeCompleto = nomeCompletoField.getText();
            JOptionPane.showMessageDialog(TelaCadastroUsuario.this, "Usuário cadastrado com sucesso!");
        }
    }
    private class VoltarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Fecha a tela de cadastro de usuário e volta para a TelaHome
            new TelaHome();
            dispose();
        }
    }
    public static void main(String[] args) {
        // Cria e exibe a tela de cadastro de usuário
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }
}
