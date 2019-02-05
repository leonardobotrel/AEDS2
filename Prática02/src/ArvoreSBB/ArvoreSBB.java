package ArvoreSBB;

import Item.Item;

public class ArvoreSBB {
    private static class No {
        Item reg;
        No esq, dir;
        byte incE, incD;
    }

    private static final byte Horizontal = 0;
    private static final byte Vertical = 1;
    private No raiz;
    private boolean propSBB;

    //Atribui null para a raíz da árvore e atribui true para a propriedade da árvore.
    public ArvoreSBB() {
        this.raiz = null;
        this.propSBB = true;
    }

    //Recebe um objeto do tipo Item, e chama a função pesquisa.
    public Item pesquisa(Item reg) {
        int comparacoes = 0;
        return this.pesquisa(reg, this.raiz, comparacoes);
    }

    //Recebe um objeto do tipo Item, e chama a função insere.
    public void insere(Item reg) {
        this.raiz = insere(reg, null, this.raiz, true);
    }

    //Retorna ums String pre order da árvore.
    public String PreOrder(){
        if (this.raiz == null) {
            return "";
        }
        return readPreOrder(this.raiz);
    }

    private String readPreOrder(No no){
        //Verifica se o No é null.
        if (no == null) {
            return "";
        }
        String rt = no.toString();

        if (no.esq != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrder(no.esq);
        }
        if (no.dir != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrder(no.dir);
        }
        return rt;
    }

    //Pesquisa na árvore pelo registro recebido como parametro, retorna o Item correspondente caso a busca seja bem sucedida ou null caso contrário.
    private Item pesquisa (Item reg, No p, int comparacoes) {
        //Verifica se o No é null
        if (p == null) {
            System.out.println("Registro não encontrado.");
            System.out.println("Número de comparações: " + comparacoes);
            return null; // Registro não encontrado
        }

            // Compara o registro recebido com o do No, e caso seja menor chama o filho a esquerda.
        else if (reg.compara (p.reg) < 0) {
            comparacoes++;
            return pesquisa(reg, p.esq, comparacoes);
        }

            //Compara o registro recebido com o do No, e caso seja maior chama o filho a direita.
        else if (reg.compara (p.reg) > 0) {
            comparacoes++;
            return pesquisa(reg, p.dir, comparacoes);
        }

            //Retorna o registro encontrado.
        else
            p.reg.setNumComparacoes(comparacoes);
            return p.reg;
    }

    //Metodos para manter a estrutura da árvore.

    //Faz a transformacao esquerda esquerda e retorna o no transformado
    private No ee(No ap) {
        No ap1 = ap.esq;
        ap.esq = ap1.dir;
        ap1.dir = ap;
        ap1.incE = Vertical;
        ap.incE = Vertical;
        ap = ap1;
        return ap;
    }

    //Faz a transformacao esquerda direita e retorna o no transformado
    private No ed(No ap) {
        No ap1 = ap.esq;
        No ap2 = ap1.dir;
        ap1.incD = Vertical;
        ap.incE = Vertical;
        ap1.dir = ap2.esq;
        ap2.esq = ap1;
        ap.esq = ap2.dir;
        ap2.dir = ap;
        ap = ap2;
        return ap;
    }

    //Faz a transformacao direita direita e retorna o no transformado
    private No dd(No ap) {
        No ap1 = ap.dir;
        ap.dir = ap1.esq;
        ap1.esq = ap;
        ap1.incD = Vertical;
        ap.incD = Vertical;
        ap = ap1;
        return ap;
    }

    //Faz a transformacao direita esquerda e retorna o no transformado
    private No de(No ap) {
        No ap1 = ap.dir;
        No ap2 = ap1.esq;
        ap1.incE = Vertical;
        ap.incD = Vertical;
        ap1.esq = ap2.dir;
        ap2.dir = ap1;
        ap.dir = ap2.esq;
        ap2.esq = ap;
        ap = ap2;
        return ap;
    }

    //Caminha pela árvore até encontrar o lugar correto de inserir o item.
    private No insere(Item reg, No pai, No filho, boolean filhoEsq) {
        //Verifica se o No é null, se for null cria um novo No e insere o registro. Atribui vertical para as incliniçoes, atribui false para a propriedade da árvore.
        if (filho == null) {
            filho = new No();
            filho.reg = reg;
            filho.incE = Vertical;
            filho.incD = Vertical;
            filho.esq = null;
            filho.dir = null;

            if (pai != null)
                if (filhoEsq) pai.incE = Horizontal;
                else
                    pai.incD = Horizontal;

            this.propSBB = false;
        }
        //Compara o registro recebido com o do No, e caso seja menor chama o filho a esquerda.
        else if (reg.compara(filho.reg) < 0) {
            filho.esq = insere(reg, filho, filho.esq, true);

            //Verifica a propriedade da árvore.
            if (!this.propSBB)
                if (filho.incE == Horizontal) {
                    if (filho.esq.incE == Horizontal) {
                        filho = this.ee(filho); // transformação esquerda-esquerda

                         if (pai != null)
                            if (filhoEsq) pai.incE = Horizontal;
                            else pai.incD = Horizontal;
                    }
                    else if (filho.esq.incD == Horizontal) {
                        filho = this.ed(filho); // transformação esquerda-direita
                        if (pai != null)
                            if (filhoEsq)
                                pai.incE = Horizontal;
                            else
                                pai.incD = Horizontal;
                    }
                }
                else
                    this.propSBB = true;//Atribui verdadeiro a propriedade da árvore.
            }

            //Compara o registro recebido com o do No, e caso seja maior chama o filho a direita.
            else if (reg.compara ( filho .reg) > 0) {
                filho . dir = insere (reg, filho , filho .dir , false);

                //Verifica a propriedade da árvore.
                if (!this.propSBB)
                    if ( filho .incD == Horizontal) {
                    if ( filho . dir .incD == Horizontal) {
                        filho = this.dd ( filho ); // transformação direita-direita

                        if (pai != null)
                            if (filhoEsq) pai.incE=Horizontal;
                        else
                        pai.incD=Horizontal;
                }
                else if ( filho . dir .incE == Horizontal) {
                    filho = this.de ( filho ); // transformação direita-esquerda
                    if (pai != null)
                        if (filhoEsq)
                            pai.incE=Horizontal;
                    else
                        pai.incD=Horizontal;
                }
            }
            else
                this.propSBB = true; //Atribui verdadeiro a propriedade da árvore
        }
        //Avisa que o registro já está na árvore.
        else {
            System.out. println ( "Erro: Registro ja existente" );
            this.propSBB = true; //Atribui verdadeiro a propriedade da árvore
        }
        return filho;
    }
}