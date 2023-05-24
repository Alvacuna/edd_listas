package Colas;

import javax.swing.JOptionPane;

public class Cola {

    public int MAX;
    public int C[];
    public int prin, fin, aux;

    public Cola(int n) {
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
        if (fin == MAX) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(int e) {
        if (!lleno()) {
            C[fin] = e;
            fin = fin + 1;
        } else {
            JOptionPane.showMessageDialog(null, "Cola llena");
        }
    }

    public int elimina() {
        int e = -1;
        if (!vacio()) {
            e = C[prin];
            prin = prin + 1;
        } else {
            JOptionPane.showMessageDialog(null, "Cola Vacia");
        }
        return e;
    }

    String listar() {
        String s = "";
        int e;
        Cola CA = new Cola(MAX);
        aux = prin;
        while (!vacio()) {
            e = elimina();
            s = s + "  " + e;
            CA.adicionar(e);
        }
        restaura(CA);
        return s;
    }

    public void restaura(Cola CA) {
        int e;
        prin = aux;
        fin = aux;
        while (!CA.vacio()) {
            e = CA.elimina();
            adicionar(e);
        }

    }

    void eliminaMultiplo5() {
        int e;
        Cola CA = new Cola(MAX);
        aux = prin;
        while (!vacio()) {
            e = elimina();
            if (e % 5 != 0) {
                CA.adicionar(e);
            }
        }
        restaura(CA);
    }

    public int sumaImpares() {
        int s = 0;
        int e;
        Cola CA = new Cola(MAX);
        aux = prin;
        while (!vacio()) {
            e = elimina();
            CA.adicionar(e);
            if (e % 2 != 0) {
                s = s + e;
            }
        }
        restaura(CA);
        return s;
    }

    public void genera(int n) {
        int x = 1;
        for (int i = 1; i < n; i++) {
            adicionar(x);
            x = x + i;
        }
    }

    public void intercamboaAdy() {
        int e1, e2, c = 0;
        Cola CA = new Cola(MAX);
        while (!vacio()) {
            if (c % 2 == 0 && fin - prin != 1) {
                e1 = elimina();
                e2 = elimina();
                CA.adicionar(e1);
                CA.adicionar(e2);
                c = c + 2;
            } else {
                e1 = elimina();
                CA.adicionar(e1);
                c = c + 1;
            }
        }
        restaura(CA);
    }

    boolean primo(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void llevaFrentePrimos() {
        Cola CA1 = new Cola(MAX);
        Cola CA2 = new Cola(MAX);
        int e;
        while (!vacio()) {
            e = elimina();
            if (primo(e) == true) {
                CA1.adicionar(e);
            } else {
                CA2.adicionar(e);
            }
        }
        fin=prin=0;
        while(!CA1.vacio()){
            adicionar(CA1.elimina());
        }
        while(!CA2.vacio()){
            adicionar(CA2.elimina());
        }
    }

}
