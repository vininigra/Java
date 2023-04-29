
/**
 * Escreva uma descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String titulacao;
    private String email;

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(String nome, String titulacao, String email)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.titulacao = titulacao;
        this.email = email;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void exibirInformacao()
    {
        // escreva seu código aqui
        System.out.println("Informacoes Professor");
        System.out.println("Nome :" +nome);
        System.out.println("Titulacao :" +titulacao);
        System.out.println("Email :" +email);
        
    }
}
