/*
 * ThreadRelatorios.java
 *
 * Created on 4 de Novembro de 2005, 17:29
 */

/**
 *
 * @author  DOUGLAS
 */
public class ThreadRelatorios extends javax.swing.JDialog implements Runnable {
    
    /** Creates new form ThreadRelatorios */
    public ThreadRelatorios(java.awt.Frame parent) {
        super(parent, false);
        setBounds(300,300,400,16);
        initComponents();
        
       
//        new Thread(this).start();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aguarde !!! Gerando Relat\u00f3rio!");
        setResizable(false);
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        new ThreadRelatorios(new javax.swing.JFrame()).show();
//    }
//    
    
    public void run() {
        this.show();
        try{
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
           
            while(parar){
                this.repaint();
                Thread.sleep(1000);
            }
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Stop(){
        parar = false;
    }
    
    private boolean parar = true;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
