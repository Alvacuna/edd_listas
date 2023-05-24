package Colas;

import javax.swing.JOptionPane;

public class ColaCir {

    public int MAX;
    public int C[];
    public int prin, fin, aux;

    public ColaCir(int n) {
        MAX = n;
        C = new int[MAX];
        prin = 0;
        fin = 0;
    }

    public boolean vacio() {
        if (prin == fin) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lleno() {
        if ((fin + 1) % MAX == prin) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(int e) {
        if (!lleno()) {
            C[fin] = e;
            fin = (fin + 1) % MAX;
        } else {
            JOptionPane.showMessageDialog(null, "Cola llena");
        }
    }

    public int elimina() {
        int e = -1;
        if (!vacio()) {
            e = C[prin];
            prin = (prin + 1) % MAX;
        } else {
            JOptionPane.showMessageDialog(null, "Cola Vacia");
        }
        return e;
    }

    String listar() {
        String s = "";
        int e;
        aux = fin;
        while (aux != prin) {
            e = elimina();
            s = s + "  " + e;
            adicionar(e);
        }
        return s;
    }

    public void insertaXord(int x) {
        int e;
        aux = fin;
        boolean sw = true;
        while (aux != prin) {
            e = elimina();
            if (sw == true) {
                if (e < x) {
                    adicionar(e);
                } else {
                    adicionar(x);
                    adicionar(e);
                    sw = false;
                }
            } else {
                adicionar(e);
            }
        }
    }

    public boolean busca(int x) {
        boolean sw = false;
        int e;
        aux = fin;
        while (aux != prin) {
            e = elimina();
            adicionar(e);
            if (e == x) {
                sw = true;
            }
        }
        return sw;
    }

    public void union(ColaCir A, ColaCir B, ColaCir CR) {
        int e;
        A.aux = A.fin;
        while (A.aux != A.prin) {
            e = A.elimina();
            A.adicionar(e);
            CR.adicionar(e);
        }
        B.aux = B.fin;
        while (B.aux != B.prin) {
            e = B.elimina();
            B.adicionar(e);
            if (CR.busca(e) == false) {
                CR.adicionar(e);
            }
        }
    }   
    
     public void interseccion(ColaCir A, ColaCir B, ColaCir CR) {
        int e;
        A.aux = A.fin;
        while (A.aux != A.prin) {
            e = A.elimina();
            A.adicionar(e);
            if (B.busca(e) == true) {
                CR.adicionar(e);
            }
        }
    }   
}
