
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;
import javafx.scene.layout.Background;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * @author btd
 */
public class Mesa {
    private static int totalMesas = 0;
    private int numIDMesa;    //numero de identificação da mesa
    private DefaultListModel                   dlmPedidos;   //itens pedidos
    private double totalPagar;
    private boolean ocupacaoMesa; //informa se mesa está ocupada
    private Instant horarioEntrada; //horário de início do dlmPedidos
    private Instant horarioSaida;   //horario de fechamento do dlmPedidos
    
    //Necessário para converter Instant em String
    private DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );

    public Mesa() {
        totalMesas++;   //atualiza o número de mesas
        this.numIDMesa = totalMesas;
        dlmPedidos = new DefaultListModel                  ();
        this.totalPagar = 0;
        ocupacaoMesa = false; 
    }

    Mesa(int i) {
        this.numIDMesa = -1;
        dlmPedidos = new DefaultListModel                  ();
        this.totalPagar = 0;
        ocupacaoMesa = false;
    }
   

    public int getNumIDMesa() {
        return numIDMesa;
    }   

    public boolean isOcupacaoMesa() {
        return ocupacaoMesa;
    }

    public void setOcupacaoMesa(boolean ocupacaoMesa) {
        this.ocupacaoMesa = ocupacaoMesa;
    }
    
    
    

    public void acrescentarPedido(Pedido p) {
        
        //Verificar se elemento já foi pedido
        boolean jaPedido = false;
        for(int i=0; i< dlmPedidos.getSize(); i++){            
            Pedido p2 = (Pedido) dlmPedidos.getElementAt(i);    //captura elemento
            if(p2.getProduto().getNome() == p.getProduto().getNome()){
                int dif = p2.getQtdeDoProduto() + p.getQtdeDoProduto();
                p.addItem(p2.getQtdeDoProduto()); //soma com a qtde que já tinha
                
                dlmPedidos.set(i, p);   //atualiza o elemento
                jaPedido = true;
                break;
            }
        }
        //se produto semelhante ainda foi pedido
        if(!jaPedido){
            dlmPedidos.addElement(p);
        }
    }

    public void cancelarPedido(Pedido produto, int qtde) {
        if(dlmPedidos.contains(produto)){
            int index = dlmPedidos.indexOf(produto);
            dlmPedidos.remove(index);
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Não foi encontrado pedido para esse ítem!", 
                    "Cancelamento de Pedido", JOptionPane.ERROR_MESSAGE);
        }
            
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
    public void abrirMesa(){
        horarioEntrada= Instant.now();
        ocupacaoMesa = true;        
        
    }
  
    
    public void fecharComanda(){
        horarioSaida = Instant.now();        
        String comanda; //descrição do dlmPedidos
        
        
        //Salva uma string contendo a descrição do dlmPedidos
        //JOptionPane.showMessageDialog(null, getHorarioEntrada());
        JOptionPane.showMessageDialog(null,"Mesa Fechada às "+ getHorarioSaida());
        comanda = 
                "Mesa " + numIDMesa +
                "\n\nHorário de Entrada: " + getHorarioEntrada() + 
                "\nHorário de Saida: " + getHorarioSaida() + 
                "\n\nItens Pedidos: \n";
        
        
        /*comanda = String.format(
                "Mesa %s\n" + 
                "Horário de Entrada: %s\n" +
                "Horário de Saida: %s\n" +
                "Itens Pedidos: \n",
                numIDMesa,getHorarioEntrada(),getHorarioSaida()); 
        */
        
        Pedido p = new Pedido();
        for(int i=0; i< dlmPedidos.getSize(); i++){
            p = (Pedido) dlmPedidos.getElementAt(i);
            comanda += p.toString();
            
            comanda += "\n";
            totalPagar += p.getValorDoPedido();
        }
       
        comanda += "\n\nTotal a Pagar: R$ " + totalPagar + "\n";
                
        //Limpa o vetor de pedidos        
        dlmPedidos.clear();
        
        ocupacaoMesa = false;
        
        JOptionPane.showMessageDialog(null, comanda, "Comanda", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
    public DefaultListModel getDefaultListModel() {
        return defaultListModel;
    } */

    public String getHorarioEntrada() {
        if(ocupacaoMesa){
            String sHorEntrada = formatter.format( horarioEntrada );
            return sHorEntrada;
        }
        else{
            return "";
        }
    }

    public String getHorarioSaida() {
        if(ocupacaoMesa){
            String sHorSaida = formatter.format( horarioSaida );
            return sHorSaida;
        }
        else{
            return "";
        }
    }

    public DefaultListModel getDlmPedidos() {
        return dlmPedidos;
    }
    
    
    

    @Override
    public String toString() {
        return "Mesa " + numIDMesa;
    }
    
    
}
