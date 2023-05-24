
package VECTORES;

public class AdmEmp {
    public Empleado v[];
    public int n,i;
  public AdmEmp(int tam)
  {
    n=tam;
    v = new Empleado[n];
    i=0;
  }
  public void adiciona(Empleado de){
    v[i]=de; 
    i++;
  }
  
  public String listar()
  {
    int j;
    String s="";
    for(j=0; j<i;j++){
       s= s  + v[j].getTodo();
    }
    return s;
  }
  
  public void elimina(String ci)
  {
    int j;
      for (j = 0;  j< i; j++) {
          if(v[j].getCi().equals(ci)){
              for (int k = j; k < i; k++) {
                  v[k]=v[k+1];
              }
           i--;   
           break;
          }
      }
  }
}
