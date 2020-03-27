package mained;

public class fila {

    private int tamanho;
    private int final_fila;
    private Pessoa[] vetor;

    public int getTamanho() {
        return tamanho;
    }

    public boolean setTamanho(int tamanho) {
        if (tamanho > 2 && tamanho < 100) {
            this.tamanho = tamanho;
            vetor = new Pessoa[tamanho];
            return true;

        } else {
            return false;
        }
    }

    public int getFinal_fila() {
        return final_fila;
    }

    public void setFinal_fila(int final_fila) {
        this.final_fila = final_fila;
    }

    public fila() {
        tamanho = 0;
        final_fila = -1;
        vetor = null;
    }

    public boolean Vazia() {
        if (vetor[0] == null) {
            return true;
        } else {
            return false;
        }

    }

    public boolean cheia() {
        if (final_fila + 1 == tamanho) {
            return true;
        } else {
            return false;

        }
    }

    public boolean enfileirar(Pessoa pessoa) {

        if (cheia()) {
            return false;
        } else {
            final_fila++;
            vetor[final_fila] = pessoa;
            return true;
        }
    }

    public Pessoa desenfileirar() {
        if (Vazia()) {
            return null;
        } else {
            Pessoa pessoa = vetor[0];
            for (int i = 1; i <= final_fila; i++) {
                vetor[i - 1] = vetor[i];
            }
            vetor[final_fila] = null;
            final_fila--;
            return pessoa;
        }

    }

}
