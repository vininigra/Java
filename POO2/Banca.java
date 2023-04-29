import java.util.Date;

/**
 * Escreva uma descrição da classe Banca aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Banca
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Date data;
    private String parecer;
    

    /**
     * Construtor para objetos da classe Banca
     */
    public Banca(Date date, String parecer)
    {
        // inicializa variáveis de instância
        this.data = data;
        this.parecer = parecer;
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibirInformacoes()
    {
        // escreva seu código aqui
        System.out.println("Informacoes Banca ");
        System.out.println("Data :" +data);
        System.out.println("Parecer :" + parecer);
    }
}
