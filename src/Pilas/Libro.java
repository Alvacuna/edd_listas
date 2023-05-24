
package Pilas;

public class Libro {
   String id,tit,aut,edit,prec;

    public Libro() {
    }

    public Libro(String id, String tit, String aut, String edit, String prec) {
        this.id = id;
        this.tit = tit;
        this.aut = aut;
        this.edit = edit;
        this.prec = prec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getPrec() {
        return prec;
    }

    public void setPrec(String prec) {
        this.prec = prec;
    }
    
    public String getTodo(){
        String s=id+"\t"+tit+"\t"+aut+"\t"+edit+"\t"+prec+"\n";
        return s;
    }
   
   
}
