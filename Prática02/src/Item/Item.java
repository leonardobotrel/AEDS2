package Item;

public class Item {
    private int chave;
    private int numComparacoes;

    public Item(int chave) {
        this.chave = chave;
    }

    public int compara(Item it) {
        Item item = it;
        if (this.chave < item.chave)
            return -1;
        else if (this.chave > item.chave)
            return 1;
        return 0;
    }

    public int getChave() {
        return chave;
    }
    public int getNumComparacoes(){
        return numComparacoes;
    }
    public void setNumComparacoes(int numComparacoes){
        this.numComparacoes = numComparacoes;
    }
}
