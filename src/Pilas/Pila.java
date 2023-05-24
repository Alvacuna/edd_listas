package Pilas;

import javax.swing.JOptionPane;

public class Pila {

    public int MAX;
    public int P[];
    public int tope;

    public Pila(int n) {
        MAX = n;
        P = new int[MAX];
        tope = 0;
    }

    public boolean vacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean lleno() {
        if (tope == MAX) {
            return true;
        } else {
            return false;
        }

    }

    public void adiciona(int e) {
        if (!lleno()) {
            P[tope] = e;
            tope++;
        } else {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }

    public int elimina() {
        int e = -1;
        if (!vacio()) {
            tope--;
            e = P[tope];
        } else {
            JOptionPane.showMessageDialog(null, "pila Vacia");
        }
        return e;
    }

    public String listar() {
        String s = "";
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            s = s + "  " + e;
        }
        restaura(PA);
        return s;
    }

    public void restaura(Pila PA) {
        int e;
        while (!PA.vacio()) {
            e = PA.elimina();
            adiciona(e);
        }
    }

    void eliminaDiv(int x) {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (e % x != 0) {
                PA.adiciona(e);
            }
        }
        restaura(PA);
    }

    public void adicionaOrd(int x) {
        int e;
        boolean sw=false;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (x < e) {
                PA.adiciona(e);
            } else {
                PA.adiciona(x);
                PA.adiciona(e);
                sw=true;
                break;
            }
        }
        if (sw==false)
            PA.adiciona(x);
        restaura(PA);
    }

    public int suma() {
        int s = 0, e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e % 2 == 0) {
                s = s + e;
            }
        }
        restaura(PA);
        return s;
    }

    public void eliminaFondo() {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
        }
        e = PA.elimina();
        restaura(PA);
    }

    public void invierte() {
        int e;
        Pila PA = new Pila(MAX);
        Pila PA1 = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
        }
        PA1.restaura(PA);
        restaura(PA1);
    }

    public void adicionaEnsima(Pila PA) {
        int e;
        Pila PA1 = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA1.adiciona(e);
        }
        e = PA1.elimina();
        adiciona(e);
        restaura(PA);
        restaura(PA1);
    }

    public int sumaImp() {
        int e, s = 0;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e % 2 != 0) {
                s = s + e;
            }
        }
        restaura(PA);
        return s;
    }

    public void eliminaX(int x) {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (e != x) {
                PA.adiciona(e);
            }

        }
        restaura(PA);
    }

    public void eliminaRep() {
        int x;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            x = elimina();
            PA.adiciona(x);
            eliminaX(x);
        }
        restaura(PA);
    }

    public int buscarMenor() {
        int e, m;
        Pila PA = new Pila(MAX);
        m = elimina();
        PA.adiciona(m);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e < m) {
                m = e;
            }
        }
        restaura(PA);
        return m;
    }

    public int buscarMayor() {
        int e, m;
        Pila PA = new Pila(MAX);
        m = elimina();
        PA.adiciona(m);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e > m) {
                m = e;
            }
        }
        restaura(PA);
        return m;
    }

    public void intercambia() {
        int ma, me;
        int e;
        Pila PA = new Pila(MAX);
        ma = buscarMayor();
        me = buscarMenor();
        while (!vacio()) {
            e = elimina();
            if (ma == e) {
                PA.adiciona(me);
            } else if (me == e) {
                PA.adiciona(ma);
            } else {
                PA.adiciona(e);
            }
        }
        restaura(PA);
    }

    public void eliminaX1(int x) {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (e != x) {
                PA.adiciona(e);
            } else {
                break;
            }
        }
        restaura(PA);
    }

    public void ordena() {
        int m;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            m = buscarMenor();
            PA.adiciona(m);
            eliminaX1(m);
        }
        restaura(PA);
    }

    public boolean bucar1(int x) {
        int e;
        boolean sw = false;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e == x) {
                sw = true;
            }
        }
        restaura(PA);
        return sw;
    }

    public void intersecta(Pila A, Pila B, Pila C) {
        int e;
        Pila PA = new Pila(MAX);
        while (!A.vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (B.bucar1(e) == true) {
                C.adiciona(e);
            }
        }
        A.restaura(PA);
    }

    public int mayor() {
        int e, m;
        Pila PA = new Pila(MAX);
        m = elimina();
        PA.adiciona(m);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (e > m) {
                m = e;
            }
        }
        restaura(PA);
        return m;

    }

    public void generaDatos(int n) {
        int i, e;
        for (i = 1; i <= n; i++) {
            e = (int) (Math.random() * 10);
            adiciona(e);
        }
    }

    public int cuenta(int x) {
        int c = 0, e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            if (x == e) {
                c = c + 1;

            }
        }
        restaura(PA);
        return c;
    }

    public Pila copiaPila() {
        int e;
        Pila PA = new Pila(MAX);
        Pila PA1 = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            PA.adiciona(e);
            PA1.adiciona(e);
        }
        restaura(PA);
        PA.restaura(PA1);
        return PA;
    }

    public void frecuencia(Pila PO, Pila PF, Pila PR) {
        int e, c;
        while (!PO.vacio()) {
            e = PO.elimina();// e=1
            PF.adiciona(e); // pF
            c = PO.cuenta(e) + 1;
            PR.adiciona(c);
            PO.eliminaX(e);
        }
    }

    public boolean esPrimo(int n) {
        int i, c = 0;
        for (i = 1; i <= n; i++) {
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

    public void eliminaPrimo() {
        int e;
        Pila PA = new Pila(MAX);
        while (!vacio()) {
            e = elimina();
            if (esPrimo(e) == false) {
                PA.adiciona(e);
            } else {
                break;
            }
        }
        restaura(PA);
    }
public void union(Pila P1, Pila P2, Pila P3){
  int e;
  Pila PA = new Pila (MAX);
  while(!P1.vacio()){
      e=P1.elimina();
      PA.adiciona(e);
      P3.adiciona(e);
  }
  P1.restaura(PA);
  while(!P2.vacio()){
      e=P2.elimina();
      PA.adiciona(e);
      if(P3.bucar1(e)==false)
          P3.adiciona(e);
      
  }
  P2.restaura(PA);
  
}   
 
public void adyasente(){
 int e1,e2,a;
 Pila PA = new Pila(MAX);
 while(!vacio()){
    e1=elimina();
    e2=elimina();
    PA.adiciona(e2);
    PA.adiciona(e1);
 }
 restaura(PA);
}
}
