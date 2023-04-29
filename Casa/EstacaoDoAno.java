public class EstacaoDoAno{
    public static void main (int mes)
    {
        String estacao;//armazenara o nome do mes
        if (mes == 12 || mes == 1 || mes == 2){
            //if dos meses de verao
            estacao="Verão";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            //if dos meses de inverno
            estacao = "Outono";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            //if dos meses de inverno
            estacao = "Inverno";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            //if dos meses de primavera
            estacao = "Primavera";
        }
        else //Else para mes invalido
        estacao = "Desconhecida";
        System.out.println("Mês : " + mes + " - Estação : " + estacao + ".");//Exibe estacao
    }
}
