public class Pilha 
{
    int a[] = new int[7];
    int i;
    
    public void empilha()
    {
        a[0]=7;
        a[1]=5;
        a[2]=8;
        a[3]=2;
        a[4]=10;
        a[5]=-6;
        a[6]=-14;
        
        for(i=6; i>=6; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=5; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=4; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=3; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=2; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=1; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=6; i>=0; i--)
        {
            System.out.println("Empilhando: "+a[i]);
        }
    }
    
    public void desempilha()
    {
        for(i=6; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=5; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=4; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=3; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=2; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=1; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=0; i>=0; i--)
        {
            System.out.println("Desempilando: "+a[i]);
        }
    }
    
}
