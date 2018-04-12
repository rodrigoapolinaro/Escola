import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcCompleta extends JFrame implements ActionListener{
    
    JButton bt_somar, bt_subtrair, bt_multiplicar ,bt_dividir, bt_ce , bt_back, bt_igual;
    JButton bt_1, bt_2, bt_3 , bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_0 ;
    JTextField tf_calculadora;
    JMenuBar barra_menu;
    JMenu menu_calculadora;
    JMenuItem mi_somar, mi_dividir, mi_multiplicar, mi_subtrair, mi_limpar, mi_sair;
    double num1=0, num2=0,resultado=0;
    char tecla_pressionada;
    boolean cliquei=false,segundo_numero=false;
    
    
    public calcCompleta(){
        
        setTitle("Calculadora Lucas");
        setSize(300,300);
        setLocation(180,180);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
        getContentPane(). setLayout(null);
        
        bt_somar       = new JButton("+");
        bt_multiplicar      = new JButton("*");
        bt_dividir       = new JButton("/");
        bt_subtrair      = new JButton("-");
        bt_1       = new JButton("1");
        bt_2       = new JButton("2");
        bt_3       = new JButton("3");
        bt_4       = new JButton("4");
        bt_5       = new JButton("5");
        bt_6       = new JButton("6");
        bt_7       = new JButton("7");
        bt_8      = new JButton("8");
        bt_9      = new JButton("9");
        bt_0      = new JButton("0");
        bt_back       = new JButton("Backspace");
        bt_ce      = new JButton("ce");
        bt_igual       = new JButton("=");
        tf_calculadora       = new JTextField(100);
        
        barra_menu = new JMenuBar();
        setJMenuBar(barra_menu);
        menu_calculadora = new JMenu("Calculadora");
        barra_menu.add(menu_calculadora);
        
        mi_somar      = new JMenuItem("Somar");
        mi_multiplicar      = new JMenuItem("Multiplicar");
        mi_dividir      = new JMenuItem("Dividir");
        mi_subtrair      = new JMenuItem("Subtrair ");
        mi_limpar      = new JMenuItem("Limpar");
        mi_sair      = new JMenuItem("Sair");
        
        menu_calculadora.add(mi_somar);
        menu_calculadora.add(mi_multiplicar);
        menu_calculadora.add(mi_dividir);
        menu_calculadora.add(mi_subtrair);
        menu_calculadora.addSeparator();
        menu_calculadora.add(mi_limpar);
        menu_calculadora.addSeparator();
        menu_calculadora.add(mi_sair);
        
        bt_1.setForeground(Color.blue);
        bt_2.setForeground(Color.blue);
        bt_3.setForeground(Color.blue);
        bt_4.setForeground(Color.blue);
        bt_5.setForeground(Color.blue);
        bt_6.setForeground(Color.blue);
        bt_7.setForeground(Color.blue);
        bt_8.setForeground(Color.blue);
        bt_9.setForeground(Color.blue);
        bt_0.setForeground(Color.blue);
        bt_back.setForeground(Color.red);
        bt_ce.setForeground(Color.red);
        bt_somar.setForeground(Color.red);
        bt_multiplicar.setForeground(Color.red);
        bt_subtrair.setForeground(Color.red);
        bt_dividir.setForeground(Color.red);
        bt_igual.setForeground(Color.red);
        
        tf_calculadora.setBounds(20, 10, 230, 25);
        bt_back.       setBounds(20, 45, 110, 30);
        bt_ce.         setBounds(140, 45, 110, 30);
        bt_7.          setBounds(20, 80, 50, 30);
        bt_8.          setBounds(80, 80, 50, 30);
        bt_9.          setBounds(140, 80, 50, 30);
        bt_dividir.    setBounds(200, 80, 50, 30);
        bt_4.          setBounds(20, 115, 50, 30);
        bt_5.          setBounds(80, 115, 50, 30);
        bt_6.          setBounds(140, 115, 50, 30);
        bt_multiplicar.setBounds(200, 115, 50, 30);
        bt_1.          setBounds(20, 150, 50, 30);
        bt_2.          setBounds(80, 150, 50, 30);
        bt_3.          setBounds(140, 150, 50, 30);
        bt_subtrair.   setBounds(200, 150, 50, 30);
        bt_0.          setBounds(20, 185, 100, 30);
        bt_igual.      setBounds(140, 185, 50, 30);
        bt_somar.      setBounds(200, 185, 50, 30);
    
    
    bt_somar         .addActionListener(this);
    bt_multiplicar         .addActionListener(this);
    bt_subtrair        .addActionListener(this);
     bt_dividir         .addActionListener(this);
    bt_0        .addActionListener(this);
    bt_1         .addActionListener(this);
     bt_2         .addActionListener(this);
    bt_3         .addActionListener(this);
    bt_4        .addActionListener(this);
     bt_5         .addActionListener(this);
    bt_6        .addActionListener(this);
    bt_7        .addActionListener(this);
     bt_8         .addActionListener(this);
    bt_9        .addActionListener(this);
    bt_igual        .addActionListener(this);
     bt_back        .addActionListener(this);
    bt_ce         .addActionListener(this);
    
    getContentPane().add(tf_calculadora);
    getContentPane().add(bt_back);
    getContentPane().add(bt_ce);
    getContentPane().add(bt_7);
    getContentPane().add(bt_8);
    getContentPane().add(bt_9);
    getContentPane().add(bt_4);
    getContentPane().add(bt_5);
    getContentPane().add(bt_6);
    getContentPane().add(bt_1);
    getContentPane().add(bt_2);
    getContentPane().add(bt_3);
    getContentPane().add(bt_0);
    getContentPane().add(bt_igual);
    getContentPane().add(bt_multiplicar);
    getContentPane().add(bt_subtrair);
    getContentPane().add(bt_dividir);
    getContentPane().add(bt_somar);
    
  }
    public static void main(String args[])
    {
        JFrame obj_calc = new calcCompleta();
        
        obj_calc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent acao)
    {    
        if (acao.getSource() == bt_1)
            numeros("1");
        if (acao.getSource() == bt_2)
            numeros("2");
        if (acao.getSource() == bt_3)
            numeros("3");
        if (acao.getSource() == bt_4)
            numeros("4");
        if (acao.getSource() == bt_5)
            numeros("5");
        if (acao.getSource() == bt_6)
            numeros("6");
        if (acao.getSource() == bt_7)
            numeros("7");
        if (acao.getSource() == bt_8)
            numeros("8");
        if (acao.getSource() == bt_9)
            numeros("9");
        if (acao.getSource() == bt_0)
            numeros("0");
        
        if(acao.getSource() == bt_ce)
            tf_calculadora.setText("");
        if(acao.getSource() == bt_back)
        {
            int conta = tf_calculadora.getText(). length();
            
            if(conta > 0)
                tf_calculadora.setText(tf_calculadora.getText().substring(0, conta-1));
            
            
        }
        if (acao.getSource() == bt_somar)
        {
            if(segundo_numero == true)
                calcula_mostra();
            calcular('+');
            segundo_numero = true;
        }
        if (acao.getSource() == bt_dividir)
        {
            if(segundo_numero == true)
                calcula_mostra();
            calcular('/');
            segundo_numero = true;
        }
        if (acao.getSource() == bt_subtrair)
        {
            if(segundo_numero == true)
                calcula_mostra();
            calcular('-');
            segundo_numero = true;
        }
        if (acao.getSource() == bt_multiplicar)
        {
            if(segundo_numero == true)
                calcula_mostra();
            calcular('*');
            segundo_numero = true;
        }
       if (acao.getSource() == bt_igual)
       {
           calcula_mostra();
           segundo_numero=false;
       }
    }
        private void calcular(char botao) 
        {
           cliquei = true;
           tecla_pressionada = botao;
           num1 = Double.parseDouble(tf_calculadora.getText());
    }
        

    private void numeros(String numero) 
    {
        if(cliquei == true)
            tf_calculadora.setText(numero);
        else
            tf_calculadora.setText(tf_calculadora.getText()+numero);
        
        cliquei=false;
    }

    private void calcula_mostra() 
    {
        if (tecla_pressionada == '+')
            resultado = num1 + Double.parseDouble(tf_calculadora.getText());
        
              else if (tecla_pressionada == '*')
            resultado = num1 * Double.parseDouble(tf_calculadora.getText());

                     else if (tecla_pressionada == '-')
            resultado = num1 - Double.parseDouble(tf_calculadora.getText());

                             else if (tecla_pressionada == '/')
            resultado = num1 / Double.parseDouble(tf_calculadora.getText());

        tf_calculadora.setText(String.valueOf(resultado));
        cliquei=true;
    }

    
    
}
