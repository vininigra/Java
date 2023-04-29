
/**
 * Escreva uma descrição da classe Casa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Casa
{
    
    private int sala,  quarto, cozinha, banheiro;
        
      
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    

    /**
     * Construtor para objetos da classe Casa
     */
      public Casa(int sala, int quarto, int cozinha, int banheiro)
      {
        
        this.sala=sala;
        this.quarto=quarto;
        this.cozinha=cozinha;
        this.banheiro=banheiro;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibeInformacoes()
    {
        System.out.println("Essa casa possui ");
        System.out.println("Sala(s) :" + sala);
        System.out.println("Quarto(s) :" + quarto);
        System.out.println("Cozinha(s) :" + cozinha);
        System.out.println("Banheiro(s) :" + banheiro); 
    }
}
