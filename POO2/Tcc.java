import java.util.Date;

/**
 * Escreva uma descrição da classe Tcc aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tcc
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String titulo;
    private Date ano;
    private String situacao;
    private int notas;

    /**
     * Construtor para objetos da classe Tcc
     */
    public Tcc(String titulo, Date ano, String situacao, int notas)
    {
        // inicializa variáveis de instância
        this.titulo = titulo;
        this.ano = ano;
        this.situacao = situacao;
        this.notas = notas;
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
        System.out.println("Informacoes TCC :");
        System.out.println("Titulo : " + titulo);
        System.out.println("Ano : " + ano);
        System.out.println("Situacao : " + situacao);
        System.out.println("Notas : " + notas);
    }
}
