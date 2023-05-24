
package VECTORES;

public class Empleado {
   public String ci,pat,mat,nom,dir,tel;
   public double sal;
    //constructor
    public Empleado() {
    }

    public Empleado(String ci1, String pat1, String mat1, String nom, String dir, String tel, double sal) {
         ci = ci1;
         pat = pat1;
        this.mat = mat1;
        this.nom = nom;
        this.dir = dir;
        this.tel = tel;
        this.sal = sal;
    }
  

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getCi() {
        return ci;
    }

    public String getPat() {
        return pat;
    }

    public String getMat() {
        return mat;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public String getTel() {
        return tel;
    }

    public double getSal() {
        return sal;
    }
    
    public String getTodo(){
        String s="";
        s=ci + "\t"+pat+ "\t"+mat+ "\t"+nom+ "\t"+dir+ "\t"+tel+ "\t"+sal+ "\n";
        return s;
    }
 
}
