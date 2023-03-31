package SERIE01.EXO08;

public class Niveau {
    private String niveau;
    private String[] module;
    public Niveau(String[] module,String niveau)
    {
       this.module=module;
       this.niveau=niveau;
    }
    public void affiherModule()
    {
        System.out.println("LE NIVEAU d\'etude est : " +this.niveau);
        for(int i=0;i<this.module.length;i++)
        {
            System.out.println(this.module[i]);
        }
    }
    public String getNiveau()
    {
        return this.niveau;
    }
    public String[] getModules(){
        return this.module;
    }
    
}
