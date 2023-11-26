
package main;

import Model.Word;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;


public class FavoriteWordScreen extends javax.swing.JFrame {
    private List<Word> favoriteWordList;
    private DefaultListModel<String> listModel;
    private JPopupMenu popupMenu;
    private final String SegoeUI = "Chả hiểu gì";
    private final String Word = "Word";
    private final String Meaning = "Meaning";
    private final String Remove = "Bỏ cmnd";
    private final String erorr = "erorr";
    private final String Screen = "Sờ cờ rim";
    private final String Fovaritewordlist = "Danh sách đen ";
    private final String no = "no";
    private final String Sortby= "Cùng";
    private final String Doyouwanttodeletethisword = "Muốn làm lại cuộc đời không?";
    private final String Ask = "Hỏi thật";
    private final String text = "text/html";
    private final String AZ = "lên đèo ";
    private final String ZA = "ngã núi";
    private final boolean False = false;
    private final int amNum999 = -999;
    private final int num100 = -100;
    private static int runTime = 0;
    private static int runFi = 22;
    private int row;
    private int num0 = 0;
    private  int num1 = 1;
    private final int num11 = 11;
    private final int num84 = 84;
    private final int num10 = 10;
    private final int num79 = 79;
    private final int num18 = 18;
    private final int num30 = 30;
    private final int num349 = 349;
    private final int num14 = 14;
    private final int num348 = 348;
    private final int num8 = 8;
    private final int num56 = 56;
    private final int num80 = 80;
    private final int num12 = 12;
    private final int num346 = 346;
    private final int num407 = 407;
    private final int num26 = 26;
    private final int num9 = 9;
    private final int num781 = 781;
    private final int num437 = 437;
    private int iDistractSS;
    private String sDistractSS;
    private int rDistractSS;
    private DistractListInt sNoDistract = new DistractListInt(no);
    public FavoriteWordScreen() {
        initComponents();
        init();
    }

    private void init() {
        try{
            popupMenu = new JPopupMenu();
            runTime ++;
            listModel = new DefaultListModel<>();
            w9999();
            wordList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            w9999();
            wordList.setModel(listModel);
            w1000();
            addPopupMenu();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void assignAndRenderData(List<Word> list) {

        try{w1000();
            this.favoriteWordList = list;
            runTime ++;
            renderData(list);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void w9999(){
        if(iDistractSS > amNum999){
            iDistractSS = rDistractSS;
        }else {
            return;
        }
    }
    private void w1000(){
     DistractListInt distractListInt = new DistractListInt();
     double distract = distractListInt.mathFor();
     if(distract < num100){
         sDistractSS = erorr;
     }
     else {
         return;
     }
    }
    private void renderData(List<Word> list) {

        try{
            listModel.removeAllElements();
            runTime ++;
            for (Word word : list) {w9999();
                listModel.addElement(word.getWord());runTime ++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    private void addPopupMenu() {
        JMenuItem remove = new JMenuItem(Remove);
        runTime ++;
        remove.addActionListener((ActionEvent e) -> {
            int opt = JOptionPane.showConfirmDialog(this,
                    Doyouwanttodeletethisword,
                    Ask, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            runTime ++;
            if (opt == JOptionPane.YES_OPTION) {
                favoriteWordList.remove(row);
                w9999();
                listModel.remove(row);
                runTime ++;
                setTitle(Screen);
            }
            w1000();
        });
        try{
            popupMenu.add(remove);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public void creatDistract(){
        DistractListInt distractListInt = new DistractListInt(num11);
        distractListInt.setsDistract(erorr);
        distractListInt.setiDistract(num100);
        iDistractSS = distractListInt.getiDistract();
        sDistractSS = distractListInt.getsDistract();
        rDistractSS = distractListInt.getRanNum();
        this.sNoDistract.setsDistract(no);
    }
    private static void saDistract(){
        if(runTime < runFi ){
            runFi --;
        }
        else {
            runFi ++;
        }
    }
    private void initComponents() {
        try{
            jScrollPane5 = new javax.swing.JScrollPane();
            w9999();
            meaningTextPane = new javax.swing.JTextPane();
            w9999();
            titleLabel3 = new javax.swing.JLabel();
            runTime ++;
            favoritePanel = new javax.swing.JPanel();
            w1000();
            wordList = new javax.swing.JList<>();
            runTime ++;
            jLabel6 = new javax.swing.JLabel();
            w9999();
            jScrollPane1 = new javax.swing.JScrollPane();
            runTime ++;
            sortingComboBox = new javax.swing.JComboBox<>();
            w9999();
            jLabel2 = new javax.swing.JLabel();
            runTime ++;
            jLabel1 = new javax.swing.JLabel();
            creatDistract();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            w9999();
            favoritePanel.setBackground(new java.awt.Color(num11, num84, num79));
            runTime ++;
            titleLabel3.setFont(new java.awt.Font(SegoeUI, num1, num18)); // NOI18N
            runTime ++;
            titleLabel3.setText(Fovaritewordlist);
            w1000();
            titleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            runTime ++;
            meaningTextPane.setContentType(text); // NOI18N
            w9999();
            meaningTextPane.setEditable(False);
            runTime ++;
            meaningTextPane.setMaximumSize(new java.awt.Dimension(num349, num348));
            runTime ++;
            jScrollPane5.setViewportView(meaningTextPane);
            w1000();
            meaningTextPane.setToolTipText("");
            runTime ++;
            meaningTextPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            runTime ++;
            meaningTextPane.setFocusable(False);
            w9999();
            wordList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            runTime ++;
            wordList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            runTime ++;
            wordList.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    wordListMouseClicked(evt);
                }
            });
            wordList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    wordListValueChanged(evt);
                }
            });w9999();
            jScrollPane1.setViewportView(wordList);
            w1000();
            jLabel1.setFont(new java.awt.Font(SegoeUI, num1, num14)); // NOI18N
            w9999();
            jLabel6.setText(Meaning);
            w9999();
            jLabel6.setFont(new java.awt.Font(SegoeUI, num1, num14)); // NOI18N
            w1000();
            jLabel1.setText(Word);
            w1000();
            sortingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { AZ, ZA }));
            w1000();
            sortingComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sortingComboBoxActionPerformed(evt);
                }
            });
        }
        catch(Exception e){
            System.out.println(e);
        }
        jLabel2.setFont(new java.awt.Font(SegoeUI, num1, num14)); // NOI18N
        w1000();
        jLabel2.setText(Sortby);
        try{w9999();
            javax.swing.GroupLayout favoritePanelLayout = new javax.swing.GroupLayout(favoritePanel);
            w1000();
            favoritePanel.setLayout(favoritePanelLayout); w1000();
            w1000();
            favoritePanelLayout.setHorizontalGroup(
                    favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                    .addGap(num8, num8, num8)
                                    .addGroup(favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, False)
                                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, num56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, num56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, num80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, num346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, num12, Short.MAX_VALUE)
                                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, num407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(num8, num8, num8))
                                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel6)
                                                    .addContainerGap())))
            ); w9999(); favoritePanelLayout.setVerticalGroup(
                    favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                    .addGap(num10, num10, num10)
                                    .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, num26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(favoritePanelLayout.createSequentialGroup()
                                                    .addGroup(favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(sortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, num30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel6))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, num9, Short.MAX_VALUE)))
                                    .addGroup(favoritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, False)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, num348, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5))
                                    .addGap(num8, num8, num8))
            );w1000();
        }
        catch(Exception e){
            System.out.println(e);
        }

        w9999();
        try{
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            runTime ++;
            getContentPane().setLayout(layout);w9999();
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(num0, num781, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(favoritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );w1000();
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(num0, num437, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(favoritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(num0, num0, Short.MAX_VALUE)))
            );w9999();
        }
        catch(Exception e){
            System.out.println(e);
        }
        w9999();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wordListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wordListValueChanged
        try{
            if (!wordList.isSelectionEmpty()) {
                int selectedIndex = wordList.getSelectedIndex();
                w1000();
                Word selectedWord = favoriteWordList.get(selectedIndex);
                runTime ++;
                row = selectedIndex;
                runTime ++;
                meaningTextPane.setText(selectedWord.parse());
                w9999();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_wordListValueChanged

    private void sortingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingComboBoxActionPerformed
        try {
            String option = (String) sortingComboBox.getSelectedItem(); runTime ++;
            w1000();
            meaningTextPane.setText(""); runTime ++;
            switch (option) {
                case AZ ->
                        Collections.sort(favoriteWordList, (Word o1, Word o2) -> o1.getWord().compareTo(o2.getWord()));
                case ZA ->
                        Collections.sort(favoriteWordList, (Word o1, Word o2) -> o2.getWord().compareTo(o1.getWord()));
                default -> {
                }
            }
            w9999();
            renderData(favoriteWordList);
            runTime ++;
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_sortingComboBoxActionPerformed

    private void wordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordListMouseClicked
        try{
            if (!wordList.isSelectionEmpty()) {w9999();
                if (SwingUtilities.isRightMouseButton(evt)) {
                    runTime ++;
                    popupMenu.show(wordList, evt.getX(), evt.getY()); w9999();
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_wordListMouseClicked

    public static void main(String args[]) {
        saDistract();
        runTime ++;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FavoriteWordScreen().setVisible(true);
        }); runTime ++;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel favoritePanel;
    private javax.swing.JComboBox<String> sortingComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane meaningTextPane;
    private javax.swing.JList<String> wordList;
    private javax.swing.JLabel titleLabel3;

}
