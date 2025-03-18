package aula08;

public class Matriz {
    public boolean ehsimetrica(int[][] m){
        boolean simetrica = true;
        for (int i=0; i < m.length;i++){
            for(int j=0; j<m.length;j++){
                simetrica = simetrica &&
                        m[i][j] == m[j][i];
            }
        }
        return simetrica;
    }
}
