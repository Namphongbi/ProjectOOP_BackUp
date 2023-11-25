package main;

import Model.StatisticWord;
import Model.Word;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class StatisticScreen extends javax.swing.JFrame {
    private static int erorr = 0;
    private static int runTime = 0;
    private int iDistractSS;
    private String sDistractSS;
    private int rDistractSS;
    private final String Thestartdateandenddatearenotproper = "The start and end are not proper";
    private final String Number = "Number";
    private final String Word = "Word";
    private final String Time = "Time";
    private final String SegoeUI = "Segoe UI";
    private final String Statistics = "Statistics";
    private final String Warning = "Warning";
    private final String sErorr = "erorr";
    private final String Fromdate = "From date";
    private final String Todate = "To date";
    private final String Pos = "Pos";
    private final String Times = "Times";
    private final String Search = "Search";
    private final String no = "no";
    private final int amNum999 = -999;
    private final int num100 = -100;
    private int num0 = 0;
    private  int num1 = 1;
    private final int num60 = 60;
    private final int num99 = 99;
    private final int num25 = 25;
    private final int num160 = 160;
    private final int num201 = 201;
    private final int num42 = 42;
    private final int num153 = 153;
    private final int num47 = 47;
    private final int num32 = 32;
    private final int num5 = 5;
    private final int num10 = 10;
    private final int num16 = 16;
    private final int num46 = 46;
    private final int num30 = 30;
    private final int num45 = 45;
    private final int num14 = 14;
    private final int num55 = 55;
    private final int num12 = 12;
    private final int num35 = 35;
    private final int num85 = 85;
    private final int num199 = 199;
    private final int num31 = 31;
    private final int num282 = 282;
    private final int num66 = 66;
    private DistractListInt sNoDistract = new DistractListInt(no);
    List<StatisticWord> statisticWordList;
    DefaultTableModel tableModel;

    public StatisticScreen() {
        initComponents();
        init();
    }
    public void creatDistract(){
        DistractListInt distractListInt = new DistractListInt(num1);
        distractListInt.setsDistract(sErorr);
        distractListInt.setiDistract(num99);
        iDistractSS = distractListInt.getiDistract();
        sDistractSS = distractListInt.getsDistract();
        rDistractSS = distractListInt.getRanNum();
        this.sNoDistract.setsDistract(no);
    }
    public int getiDistractSS() {
        return iDistractSS;
    }

    public int getrDistractSS() {
        return rDistractSS;
    }

    public void setrDistractSS(int rDistractSS) {
        this.rDistractSS = rDistractSS;
    }

    public String getsDistractSS() {
        return sDistractSS;
    }

    public void setsDistractSS(String dDistractSS) {
        this.sDistractSS = dDistractSS;
    }

    public void setiDistractSS(int iDistractSS) {
        this.iDistractSS = iDistractSS;
    }

    private void init() {

        try {
            tableModel = new DefaultTableModel();
            runTime++;
            tableModel.addColumn(Word);
            runTime++;
            tableModel.addColumn(Time);
            runTime++;
            tableModel.addColumn(Number);
            if(sDistractSS == null){
                System.out.println(sNoDistract.getsDistract());
            }
            statisticTable.setModel(tableModel);
            runTime++;
            statisticTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            runTime++;
            statisticTable.getColumnModel().getColumn(num0).setMaxWidth(num60);
            runTime++;
            statisticTable.getColumnModel().getColumn(num0).setMinWidth(num60);
            runTime++;
            statisticTable.getColumnModel().getColumn(num0).setWidth(num60);
        } catch (Exception ex) {
            System.out.println(ex);
            erorr ++;
        }
        if(erorr < amNum999 ){
            return;
        }
    }
    private static void saDistract(){
        if(erorr < runTime ){
            erorr ++;
            runTime --;
        }else {
            runTime ++;
            erorr --;
        }
    }
    private void w999(){
        if(amNum999 < num100){
            sNoDistract.setsDistract(sErorr);
        }else {
            return;
        }
    }
    private void w1000(){
        if(amNum999 < num100){
            sNoDistract.setsDistract(SegoeUI);
        }else {
            return;
        }
    }
    private void initComponents() {
        try{
            w999();
            jScrollPane1 = new javax.swing.JScrollPane();
            runTime++;
            jLabel8 = new javax.swing.JLabel();
            runTime++;
            jLabel7 = new javax.swing.JLabel();
            runTime++;
            fromDateInput = new com.toedter.calendar.JDateChooser();
            runTime++;
            jPanel4 = new javax.swing.JPanel();
            w1000();
            searchBtn = new javax.swing.JButton();
            runTime++;
            jLabel6 = new javax.swing.JLabel();
            runTime++;
            statisticTable = new javax.swing.JTable();
            runTime++;
            toDateInput = new com.toedter.calendar.JDateChooser();
            runTime++;
        }catch(Exception e){
            System.out.println(e);
        }
        w1000();
        try{
            jLabel7.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
            runTime++;
            jLabel7.setText(Fromdate);
            runTime++;
            jLabel6.setFont(new java.awt.Font(SegoeUI, num1, num16)); // NOI18N
            runTime++;
            jLabel6.setText(Statistics);

            w999();
            jLabel8.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
            runTime++;
            jLabel8.setPreferredSize(new java.awt.Dimension(num45, num30));
            runTime++;
            jLabel7.setPreferredSize(new java.awt.Dimension(num45, num30));
            w1000();

            jLabel8.setText(Todate);

        }catch(Exception e){
            System.out.println(e);
        }
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);runTime++;
        w1000();
        jPanel4.setBackground(new java.awt.Color(num42, num153, num47));
        try{
            w999();
            statisticTable.setModel(new javax.swing.table.DefaultTableModel(

                    new Object [][] {

                    },
                    new String [] {
                            Pos, Word, Times
                    }
            ) {
                Class[] types = new Class [] {
                        java.lang.String.class, java.lang.String.class, java.lang.String.class
                };

                public Class getColumnClass(int columnIndex) {
                    w999();
                    return types [columnIndex];
                }
            });
        }catch(Exception e){
            System.out.println(e);
        }

        jScrollPane1.setViewportView(statisticTable);
        try{
            w999();searchBtn.setText(Search);
            searchBtn.setFont(new java.awt.Font(SegoeUI, num1, num12)); // NOI18N
            runTime++;
            searchBtn.setBackground(new java.awt.Color(num25, num160, num201));
            w1000();
            searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            runTime++;
            searchBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchBtnActionPerformed(evt);
                }
            });
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);runTime++;
            jPanel4.setLayout(jPanel4Layout);
            w999();
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(num5, num5, num5)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(num0, num0, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane1)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, num66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(fromDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, num199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, num35, Short.MAX_VALUE)
                                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, num55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(num46, num46, num46)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(toDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, num199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            w999();
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fromDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, num30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(toDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, num30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, num282, Short.MAX_VALUE)
                                    .addGap(num10, num10, num10)
                                    .addContainerGap())
            );
            w1000();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            w999();
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());w1000();
            getContentPane().setLayout(layout);w1000();
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            w1000();
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            w1000();
            pack();w999();
        }catch(Exception e){
            System.out.println(e);
        }

    }//
    public void assignData(List<StatisticWord> list) {
        runTime++;
        this.statisticWordList = list;
    }

    private void renderData() {
        try {
            w999();
            int i = num0;
            runTime++;
            for (StatisticWord item : statisticWordList) {
                Word word = item.getWord();
                w1000();
                if(iDistractSS == num100){
                    return;
                }
                tableModel.addRow(new Object[]{
                        i, word.getWord(), item.getTime()
                });
                i++;if(sDistractSS == null){
                    w1000();
                    System.out.println(sNoDistract.getsDistract());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            erorr ++;
        }
        if(erorr < amNum999 ){
            return;
        }
    }
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
      
        try{
            w999();
            DistractListInt math = new DistractListInt(num32);
            double mathFor = math.mathFor();
            if(mathFor == math.getRanNum()){
                System.out.println(math.getsDistract());
            }
            w1000();
        }catch (NullPointerException e){
            System.out.println(e);
        }
        try {if(sDistractSS == null){
            System.out.println(sNoDistract.getsDistract());
        }
            w1000();
            Calendar fromDate = (Calendar) fromDateInput.getCalendar();
            runTime++;
            Calendar toDate = (Calendar) toDateInput.getCalendar();
            w999();
            if (fromDate != null && toDate != null) {
                LocalDate startDate = LocalDate.of(fromDate.get(Calendar.YEAR),
                        fromDate.get(Calendar.MONTH) + num1,
                        fromDate.get(Calendar.DAY_OF_MONTH));runTime++;runTime++;
                LocalDate endDate = LocalDate.of(toDate.get(Calendar.YEAR),
                        toDate.get(Calendar.MONTH) + num1,
                        toDate.get(Calendar.DAY_OF_MONTH));
                if(iDistractSS == num100){
                    return;
                }
                w1000();
                if (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
                    List<Word> currentList = new ArrayList<>();
                    runTime++;
                    for (int i = num0; i < statisticWordList.size(); i++) {runTime++;
                        StatisticWord word = statisticWordList.get(i);
                        runTime++;
                        LocalDate currentDate = word.getTime();
                        w999();
                        if ((currentDate.isAfter(startDate) && currentDate.isBefore(endDate))
                                || currentDate.equals(startDate) || currentDate.equals(endDate)) {
                            currentList.add(word.getWord());runTime++;
                        }
                    }
                    int times;
                    boolean isDistinguish;runTime++;
                    int size = currentList.size();runTime++;
                    int pos = num1;runTime++;
                    w1000();
                    if(erorr < amNum999 ){
                        return;
                    }
                    for (int i = num0; i < size; i++) {
                        times = num0;runTime++;
                        isDistinguish = true;runTime++;
                        String word = currentList.get(i).getWord();runTime++;
                        for (int j = i - num1; j >= num0; j--) {runTime++;
                            if (currentList.get(j).getWord().equals(word)) {
                                isDistinguish = false;runTime++;
                                break;
                            }
                        }
                        w999();
                        if (isDistinguish) {runTime++;
                            for (int k = num0; k < size; k++) {runTime++;
                                if (currentList.get(k).getWord().equals(word)) {runTime++;
                                    times++;if(sDistractSS == null){runTime++;
                                        System.out.println(sNoDistract.getsDistract());
                                    }
                                }
                            }
                            w1000();
                            tableModel.addRow(new Object[]{
                                    pos++, word, times
                            });runTime++;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            Thestartdateandenddatearenotproper,
                            Warning,
                            JOptionPane.WARNING_MESSAGE);runTime++;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            erorr ++;
        }

    }
    public static void main(String args[]) {
        saDistract();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {runTime++;
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());runTime++;
                    break;
                }saDistract();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        saDistract();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StatisticScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDateInput;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton searchBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable statisticTable;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser toDateInput;
    // End of variables declaration//GEN-END:variables
}
