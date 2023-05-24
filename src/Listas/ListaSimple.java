package Listas;

public class ListaSimple {

    public Nodo L = null;

    public void adicionaInicio(double e) {
        Nodo q = new Nodo();
        q.dato = e;
        q.sigte = L;
        L = q;
    }

    public void adicionaFinal(double e) {
        Nodo q = new Nodo();
        q.dato = e;
        if (L == null) {
            q.sigte = L;
            L = q;
        } else {
            Nodo r = L;
            while (r.sigte != null) {
                r = r.sigte;
            }
            r.sigte = q;
            q.sigte = null;

        }

    }

    public String listar() {
        String s = "";
        Nodo r = L;
        while (r != null) {
            s = s + "  " + r.dato;
            r = r.sigte;
        }
        return s;
    }

    public void adicionaAntes(double e, double x) {
        if (L != null) {
            Nodo r = L;
            Nodo w = L;
            while (r.dato != x && r != null) {
                w = r;
                r = r.sigte;
            }
            if (r != null) {
                if (r == L) {
                    adicionaInicio(e);
                } else {
                    Nodo q = new Nodo();
                    q.dato = e;
                    w.sigte = q;
                    q.sigte = r;
                }
            }
        }
    }

    public void adicionaDespues(double e, double x) {
        if (L != null) {
            Nodo r = L;

            while (r.dato != x && r != null) {

                r = r.sigte;
            }
            if (r != null) {
                if (r.sigte == null) {
                    adicionaFinal(e);
                } else {
                    Nodo q = new Nodo();
                    q.dato = e;
                    q.sigte = r.sigte;
                    r.sigte = q;
                }
            }
        }
    }

    public void eliminaInicio() {
        if (L != null) {
            Nodo r = L;
            L = L.sigte;
            r = null;
        }
    }

    public void eliminaFinal() {
        if (L != null) {
            Nodo w = L;
            Nodo r = L;
            while (r.sigte != null) {
                w = r;
                r = r.sigte;
            }
            w.sigte = null;
            r = null;
        }
    }

    public void eliminaX(double x) {
        if (L != null) {
            Nodo r = L;
            Nodo w = L;
            while (r.dato != x && r != null) {
                w = r;
                r = r.sigte;
            }
            if (r != null) {
                if (r == L) {
                    eliminaInicio();
                } else if (r.sigte == null) {
                    eliminaFinal();
                } else {
                    w.sigte = r.sigte;
                    r = null;
                }
            }
        }
    }

    public void ordena() {
        if (L != null) {
            Nodo r = L;
            Nodo w;
            while (r.sigte != null) {
                w = r.sigte;
                while (w != null) {
                    if (r.dato > w.dato) {
                        double aux = r.dato;
                        r.dato = w.dato;
                        w.dato = aux;
                    }
                    w = w.sigte;
                }
                r = r.sigte;
            }
        }
    }

    public void insertaX1(double x) {

        Nodo r = L;
        while (r.dato != x && r.sigte != null) {
            r = r.sigte;
        }
        if (r.sigte == null && r.dato != x) {
            adicionaFinal(x);
        }
    }

    public double sumaM3() {
        double s = 0;
        Nodo r = L;
        while (r != null) {
            if (r.dato % 3 == 0) {
                s = s + r.dato;
            }
            r = r.sigte;
        }
        return s;
    }

    public void eliminaM3() {
        if (L != null) {
            Nodo r = L;
            Nodo w = L;
            while (r != null) {
                if (r.dato % 3 == 0) {
                    if (r == L) {
                        eliminaInicio();
                        r = L;
                    } else {
                        w.sigte = r.sigte;
                        r = w;
                    }
                }
                w = r;
                r = r.sigte;
            }

        }
    }

    public int contar() {
        int c = 0;
        Nodo r = L;
        while (r != null) {
            c++;
            r = r.sigte;
        }
        return c;
    }
   public void elimina3()
   {
     int c=contar();
     if(c>=3){
       Nodo r =L;
       L.sigte.sigte = r.sigte.sigte.sigte;
     }
   
   }

}
