package projeto;

import java.util.Scanner;

/**
 * João Pedro Ribeiro Machado RA:11201720180 Gerson Chen RA:11201722709 Camila
 * Rodrigues Bressio RA:11201722383 Raphaela Nathataly RA: 11201722552
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int vCod[] = new int[200];
        int vIdade[] = new int[200];
        String vNome[] = new String[200];
        int vNota[] = new int[200];
        int op = 0, exp = 0, consCod;
        int aux = 0;
        double otimo = 0, bom = 0, regular = 0, ruim = 0, porc;
        boolean teste = true;

        while (op != 5) {

            System.out.println("MENU");
            System.out.println("1-)Cadastra Dados");
            System.out.println("2-)Consultar dados expectador");
            System.out.println("3-)Calcular dados ");
            System.out.println("4-)Exibir dados expectadores");
            System.out.println("5-) Sair ");
            System.out.println("Digite a opção");
            op = valor.nextInt();
            System.out.println("   ");

            if (op == 1) {
                System.out.println("Digite o codigo: ");
                vCod[exp] = valor.nextInt();
                System.out.println("Digite Idade: ");
                vIdade[exp] = valor.nextInt();
                System.out.println("Digite o nome do filme: ");
                vNome[exp] = valor.next();
                System.out.println("Digite a nota do filme; 10-Otimo/ 9-Bom / 8-Regular / 7- Ruim");
                vNota[exp] = valor.nextInt();
                if (vNota[exp] == 10) {
                    otimo++;
                } else if (vNota[exp] == 9) {
                    bom++;
                } else if (vNota[exp] == 8) {
                    regular++;
                } else if (vNota[exp] == 7) {
                    ruim++;
                }
                exp++;

            }
            if (op == 2) {
                System.out.println("Qual o codigo do usuario");
                consCod = valor.nextInt();
                for (int i = 0; i < exp; i++) {
                    if (consCod == vCod[i]) {
                        System.out.println("NOME DO FILME: " + vNome[i]);
                        System.out.println("IDADE: " + vIdade[i]);
                        System.out.println("NOTA: " + vNota[i]);
                        teste = !teste;
                    }

                }
                if (teste) {
                    System.out.println("Expectador não cadastrado.");

                }

            }
            if (op == 3) {
                if (exp != 0) {
                    System.out.printf("Porcentagem da resposta BOM: %.2f ", 100 * bom / exp);
                    System.out.printf("Porcentagem da resposta REGULAR: %.2f ", 100 * regular / exp);
                    System.out.printf("Porcentagem da resposta RUIM: %.2f ", 100 * ruim / exp);

                    for (int j = 0; j < exp; j++) {
                        if (vIdade[j] > aux && vNota[j] == 9) {
                            aux = vIdade[j];
                            System.out.println("Maior idade entre os bom " + aux);
                        }
                    }
                } else {
                    System.out.println("Nenhum expectador está cadastrado em nossa base de dados. ");
                }
            }
            if (op == 4) {
                if (exp != 0) {
                    System.out.println("CÓDIGO  |  IDADE  |  NOME DO FILME  |  OPINIÃO");
                    for (int l = 0; l < exp; l++) {
                        System.out.print(vCod[l] + "    " + vIdade[l] + "    " + vNome[l] + "     " + vNota[l] + "    ");
                        System.out.println("   ");
                    }
                } else {
                    System.out.println("Nenhum expectador está cadastrado em nossa base de dados. ");
                }
            }

        }
        System.out.println("PROGRAMA FINALIZADO!!!");
    }

}
