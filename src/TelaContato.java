import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContato extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfCelular;
	
	Dados dados = new Dados();

	// Chama a Tela
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContato frame = new TelaContato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Cria o Frame
	public TelaContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Cria os Textos e Campos
		JLabel lblCadastroDeContatos = new JLabel("Cadastro de Contatos");
		lblCadastroDeContatos.setBounds(10, 11, 142, 14);
		contentPane.add(lblCadastroDeContatos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 36, 414, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 40, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 65, 46, 14);
		panel.add(lblCelular);
		
		tfNome = new JTextField();
		tfNome.setBounds(63, 8, 341, 20);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(63, 37, 341, 20);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfCelular = new JTextField();
		tfCelular.setBounds(63, 62, 341, 20);
		panel.add(tfCelular);
		tfCelular.setColumns(10);
		
		// contador de cadastrados
		JLabel lblTotal = new JLabel("0 Contatos Cadastrados");
		lblTotal.setBounds(10, 128, 153, 14);
		panel.add(lblTotal);
		setLocationRelativeTo(null);
		
		// ação ao botão Adicionar
		JButton btnCadastrar = new JButton("Adicionar na Lista");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = tfNome.getText();
				String email = tfEmail.getText();
				String celular = tfCelular.getText();
				
				Contato c = new Contato(nome, email, celular);
				
				dados.cadastraContato(c);
				
				lblTotal.setText(dados.numeroDeContatos() + " Contados Cadastrados");
				
				System.out.println(c);
				
				JOptionPane.showMessageDialog(null, "Contato cadastrado co Sucesso!");
				
				tfNome.setText("");
				tfEmail.setText("");
				tfCelular.setText("");
				
			}
		});
		
		btnCadastrar.setBounds(251, 99, 153, 23);
		panel.add(btnCadastrar);
		
	}
}
