import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.Timer;
public class Ejercicio_72 extends javax.swing.JFrame
{
    DefaultListModel<String> modelo=new DefaultListModel<>();
    Stack tareas = new Stack();
    Stack tiempo1 = new Stack();
    int i=0,j=0,k=0,l=0,m=0;
    public Ejercicio_72() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotComunicacion = new javax.swing.JButton();
        BotSensores = new javax.swing.JButton();
        TexTiempo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LisTareas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        BotOk = new javax.swing.JButton();
        TexTemporizador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        BotComunicacion.setBackground(new java.awt.Color(153, 0, 153));
        BotComunicacion.setForeground(new java.awt.Color(51, 255, 204));
        BotComunicacion.setText("Tarea de Comunicacion");
        BotComunicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)));
        BotComunicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotComunicacionActionPerformed(evt);
            }
        });

        BotSensores.setBackground(new java.awt.Color(153, 0, 153));
        BotSensores.setForeground(new java.awt.Color(51, 255, 204));
        BotSensores.setText("Tarea de Sensores");
        BotSensores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)));
        BotSensores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotSensores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSensoresActionPerformed(evt);
            }
        });

        TexTiempo.setBackground(new java.awt.Color(153, 0, 153));
        TexTiempo.setForeground(new java.awt.Color(51, 255, 204));
        TexTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexTiempo.setText("Añadir Tiempo: 00:00 s");
        TexTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 1, true));
        TexTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexTiempoActionPerformed(evt);
            }
        });

        LisTareas.setBackground(new java.awt.Color(153, 0, 153));
        LisTareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        LisTareas.setForeground(new java.awt.Color(51, 255, 204));
        LisTareas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                LisTareasComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(LisTareas);

        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Robot medio feo :0");

        BotOk.setBackground(new java.awt.Color(153, 0, 153));
        BotOk.setForeground(new java.awt.Color(51, 255, 204));
        BotOk.setText("OK");
        BotOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        BotOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotOkActionPerformed(evt);
            }
        });

        TexTemporizador.setEditable(false);
        TexTemporizador.setBackground(new java.awt.Color(153, 0, 153));
        TexTemporizador.setForeground(new java.awt.Color(51, 255, 204));
        TexTemporizador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexTemporizador.setText("Tiempo restante: 00:00 s");
        TexTemporizador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        TexTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexTemporizadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotComunicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BotSensores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TexTiempo)
                        .addGap(10, 10, 10)
                        .addComponent(BotOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TexTemporizador))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotComunicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotSensores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(TexTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        TexTiempo.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BotSensoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSensoresActionPerformed
        if(k==0)
        {
            tareas.push("Tarea sensores # "+i);
            i++;
            k++;
        }
    }//GEN-LAST:event_BotSensoresActionPerformed

    private void BotComunicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotComunicacionActionPerformed
        if(k==0)
        {
            tareas.push("Tarea comunicaciones # "+j);
            j++;
            k++;
        }
    }//GEN-LAST:event_BotComunicacionActionPerformed

    private void TexTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexTiempoActionPerformed

    }//GEN-LAST:event_TexTiempoActionPerformed

    private void BotOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotOkActionPerformed
        if(Integer.parseInt(TexTiempo.getText())<10)
        {
            LisTareas.setModel(modelo);
            modelo.addElement((String) tareas.peek());
            TexTemporizador.setText("Tiempo restante: 00:0"+TexTiempo.getText()+" s");
            m=Integer.parseInt(TexTiempo.getText());
            tiempo1.push(m);
            TexTiempo.setText("");
        }
        else
        {
            if(Integer.parseInt(TexTiempo.getText())<99)
            {
                LisTareas.setModel(modelo);
                modelo.addElement((String) tareas.peek());
                TexTemporizador.setText("Tiempo restante: 00:"+TexTiempo.getText()+" s");
                m=Integer.parseInt(TexTiempo.getText());
                tiempo1.push(m);
                TexTiempo.setText("");
            }
            else
            {
                LisTareas.setModel(modelo);
                modelo.addElement((String) tareas.peek());
                TexTemporizador.setText("Tiempo restante: "+TexTiempo.getText()+" s");
                m=Integer.parseInt(TexTiempo.getText());
                tiempo1.push(m);
                TexTiempo.setText("");
            }
        }
        k=0;
        l=0;
        tiempo.start();
    }//GEN-LAST:event_BotOkActionPerformed

    private void TexTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexTemporizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexTemporizadorActionPerformed

    private void LisTareasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_LisTareasComponentAdded

    }//GEN-LAST:event_LisTareasComponentAdded
    Timer tiempo = new Timer(1000, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(l<(int)tiempo1.peek())
            {
                if(m<=10)
                {
                    TexTemporizador.setText("Tiempo restante: 00:0"+(m-l)+" s");
                }
                else
                {
                    if(m<99)
                    {
                        TexTemporizador.setText("Tiempo restante: 00:"+(m-l)+" s");  
                    }
                    else
                    { 
                        TexTemporizador.setText("Tiempo restante: "+(m-l)+" s");
                    }
                }
                l++;
            }
            else
            {
                modelo.removeElement(tareas.peek());
                tiempo1.pop();
                tareas.pop();
                l=0;
            }
        }
    });
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Ejercicio_72().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotComunicacion;
    private javax.swing.JButton BotOk;
    private javax.swing.JButton BotSensores;
    private javax.swing.JList<String> LisTareas;
    private javax.swing.JTextField TexTemporizador;
    private javax.swing.JTextField TexTiempo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
