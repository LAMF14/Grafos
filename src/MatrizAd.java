public class MatrizAd {
    private final int n;
    private final int[][] matriz;

    public MatrizAd(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }
        }
    }

    public void agregar(int i, int j){
        matriz[i][j] += 1;
    }

    public void remover(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }

    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "  " );
            }
            System.out.println();
        }
    }
}
