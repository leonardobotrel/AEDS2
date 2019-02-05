
public class ProgramacaoDinamica {

    int n; //Número de estações
    int a[][]; //tempo gasto por estacao (i indica em qual linha de montagem está, j indica o numero da estacao)
    int t[][]; //Tempo para transferir de uma estacao em uma linha para uma em outra linha
    int[] e,x; //Entrada e saída
    int[] l1,l2,f1,f2;//l1 e l2 são arrays para acompanhar(em cada estação) o número da linha de montagem que o item estava sendo processado.f1 e f2 mantêm o tempo para passar pela fábrica até o número da estação especificado por (j) para cada linha de montagem
    int out[]=new int[2];



    ProgramacaoDinamica() {

        n = 6;
        l1 = new int[n];
        l2 = new int[n];
        f1 = new int[n];
        f2 = new int[n];
        a = new int[][]{{7, 9, 3, 4, 8, 4},
                {8, 5, 6, 4, 5, 7}};

        t = new int[][]{{2, 3, 1, 3, 4},
                {2, 1, 2, 2, 1}};

        e = new int[]{2, 4};

        x = new int[]{3, 2};

        f1[0] = e[0] + a[0][0];

        f2[0] = e[1] + a[1][0];

    }

    public  void fastest_way(int j){
        //Verifica por um tempo menor
        if(f1[j-1]+a[0][j]<=f2[j-1]+a[0][j]+t[1][j-1]){
            //Estação anterior na linha 1
            f1[j]=f1[j-1]+a[0][j];
            l1[j]=1;
        }

        else{//Estação anterior na linha 2
            f1[j]=f2[j-1]+a[0][j]+t[1][j-1];
            l1[j]=2;
        }

        //Repete o processo para  linha 2
        //Verifica por um tempo menor
        if(f2[j-1]+a[1][j]<=f1[j-1]+a[1][j]+t[0][j-1]){
            //Estação anterior na linha 2
            f2[j]=f2[j-1]+a[1][j];
            l2[j]=2;
        }

        else{
            //Estação anterior na linha 1
            f2[j]=f1[j-1]+a[1][j]+t[0][j-1];
            l2[j]=1;
        }
    }

    public void result(){

        if(f1[5]+x[0]<=f2[5]+x[1]){
            out[0]=f1[5]+x[0];
            out[1]=1;
        }

        else{
            out[0]=f2[5]+x[1];
            out[1]=2;
        }

        System.out.println("Tempo gasto:" + out[0]);

        int i = out[1];

        System.out.println("linha: " + i + ", Estação: " + n);
        for (int j = n-1; j >= 1; j--) {
            if (i == 1)
                i = l1[j];
            else
                i = l2[j];

            //Printa o numero da estacao (j-1)
            System.out.println("Linha: " + i + ", Estação: " + (j));
        }

    }

}
