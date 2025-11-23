public class PhraseOMatic {
    public static void main(String[] args) {

        // LISTA 1: Adjetivos ou sujeitos técnicos
        String[] lista1 = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "win-win", "front-end", "baseado na web", "inteligente", "dinâmico"};

        // LISTA 2: Termos de ação/meio
        String[] lista2 = {"habilitado", "adesivo", "valor agregado", "orientado a rede", "centralizado", "distribuído", "clusterizado", "marcado", "posicionado"};

        // LISTA 3: Substantivos finais
        String[] lista3 = {"processo", "ponto de carga", "solução", "arquitetura", "competência", "estratégia", "mindshare", "portal", "espaço", "visão"};

        // 1. Descobrir quantas palavras tem em cada lista
        int tamanho1 = lista1.length;
        int tamanho2 = lista2.length;
        int tamanho3 = lista3.length;

        // 2. Gerar três números aleatórios (Índices)
        // O Math.random() gera um número entre 0 e quase 1.
        int rand1 = (int) (Math.random() * tamanho1);
        int rand2 = (int) (Math.random() * tamanho2);
        int rand3 = (int) (Math.random() * tamanho3);

        // 3. Montar a frase pegando as palavras nas posições sorteadas
        String frase = lista1[rand1] + " " + lista2[rand2] + " " + lista3[rand3];

        // 4. Imprimir
        System.out.println("O que precisamos é de uma " + frase);
    }
}
