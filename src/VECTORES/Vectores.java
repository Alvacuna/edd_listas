package VECTORES;

import javax.swing.JOptionPane;

public class Vectores {

    public int MAX;
    public int V[];
//constructor

    public Vectores(int n) {
        MAX = n;
        V = new int[MAX];
    }

    public void llenar() {
        int e;
        int i;
        for (i = 0; i < MAX; i++) {
            e = Integer.parseInt(JOptionPane.showInputDialog("Elemento", ""));
            V[i] = e;
        }
    }
    public String mostrar(){
        String s="";
        
         for (int i = 0; i < MAX; i++) {
            s = s + "  "+V[i];
        }
     return s;   
    }
    
    public int mayor()
    {
       int em;
       em=V[0];
        for (int i = 1; i < MAX; i++) {
            if(em < V[i])
                em=V[i];
        }
      return em;  
    }

    
    
    
    
    
    
}
