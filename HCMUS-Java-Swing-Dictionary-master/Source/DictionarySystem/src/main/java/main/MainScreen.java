package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import Model.Word;
import Model.StatisticWord;
import org.xml.sax.SAXException;


public class MainScreen extends javax.swing.JFrame {
    private final File englishVietFile = new File("./src/main/java/data/Anh_Viet.xml");
    private final File vietEnglishFile = new File("./src/main/java/data/Viet_Anh.xml");
    public static File historyFile = new File("./src/main/java/data/searchHistory.txt");
    public static File favoriteFile = new File("./src/main/java/data/favoriteWords.txt");
    private static int srIDistract = 0;
    boolean isEnglish = true;
    private boolean isChangingEnglishDictionary = false;
    private boolean isChangingVietDictionary = false;
    private boolean True = true;
    private final String mainScreem = "Màn hình chính";
    private final String SegoeUI = "Chả hiểu gì";
    private final String Word = "Word";
    private final String Meaning = "Meaning";
    private final String Record = "Ghi";
    private final String Createnewword = "niu guốt";
    private final String Save = "Sa va ghe";
    private final String Inputkeyword = "Input your key Word";
    private final String Create = "vứt vô";
    private final String Dictionary = "Từ điển tiếng em";
    private final String Myfavoriteword= "Từ mày ghét";
    private final String Statistics= "";
    private final String Doyouwanttodeletethisword = "mày muốn xoá cái này thiệt à";
    private final String Delete = "xoá cmnl";
    private final String Addintoyourfavoritelist = "Đưa vào danh sách đen";
    private final String Ask = "Hỏi thật";
    private final String fileName = "./src/main/java/main/logo.png";
    private final String text = "text/html";
    private final String AV = "English - Vietnamese";
    private final String VA = "Vietnamese - English";
    private final String Adddingsucess = "Nhỡ cho mất rồi!";
    private final String Info = "Tình hình ";
    private final String Wordormeaningisempty = "Trắng như tiền đồ chị Dậu";
    private final String Warn = "Hỏi chấm";
    private String erorrString = "erorr";
    private  int num0 = 0;
    private  int num2 = 2;
    private  int num24 = 24;
    private final int num29 = 29;
    private final int num5 = 5;
    private final int num10 = 10;
    private final int num16 = 16;
    private final int num77 = 77;
    private final int num30 = 30;
    private final int num14 = 14;
    private final int num312 = 312;
    private final int num28 = 28;
    private final int num43 = 43;
    private final int num18 = 18;
    private final int num8 = 8;
    private final int num250 = 250;
    private final int num234 = 234;
    private final int num229 = 229;
    private final int num12 = 12;
    private final int num1 = 1;
    private final int num201 = 201;
    private final int num85 = 85;
    private final int num480 = 480;
    private final int num550 = 550;
    private final int num31 = 31;
    private final int num19 = 19;
    private final int num404 = 404;
    private final int num369 = 369;
    private final int num26 = 26;
    private final int num119 = 119;
    private final int num47 = 47;
    private final int num44 = 44;
    private final int num68 = 68;
    private final int num330 = 330;
    private final int num136 = 136;
    private final int num9999 = -9999;
    private final int num1000 = -1000;
    private static int erorr = 0;
    private static int runTime = 0;
    private int booleanSize;
    private int intSize;
    private String distractStringHistory;
    private String distractStringFavorite;
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder dBuilder;
    private List<Word> dictionaryEnglishViet;
    private List<Word> dictionaryVietAnh;
    private List<Word> favoriteWordList;
    private List<StatisticWord> historyList;
    private DefaultListModel<String> listModel;
    private JPopupMenu popupMenu;
    private int row;

    public MainScreen() throws ClassNotFoundException {
        initComponents();
        init();
        try{
            if(this.booleanSize == num1000){    //distract
            return;
            }
            if(this.intSize == num9999){      //distract
                return;
            }
        }catch(Exception e){
            erorr++;
        }
        assignData(dictionaryEnglishViet);
        loadDictionary(vietEnglishFile, dictionaryVietAnh);
        distract();
        loadDictionary(englishVietFile, dictionaryEnglishViet);
        try{
            distractAtribute();             //distract
        }
        catch (NullPointerException e){
            erorr++;
        }
        readFavorite();
        runTime ++;
        readHistory();
    }
    private void distractAtribute(){
        DistractListBoolean listBoolean = new DistractListBoolean();
        listBoolean.addList(isEnglish);
        listBoolean.addList(isChangingEnglishDictionary);
        listBoolean.addList(isChangingVietDictionary);
        this.booleanSize = listBoolean.getCount();
        DistractListInt distractListInt = new DistractListInt();
        if(erorr == num0) distractListInt.addInt();
        if(runTime == num0)distractListInt.addInt();
        this.intSize = distractListInt.getCount();
    }
    private void distract() {
        try {
            if (distractStringHistory == null) {
                // ghi dữ liệu của erorrString vào đây
                FileWriter writer = new FileWriter(historyFile);
                writer.write(erorrString);
                writer.close();
            } else {
                //ghi hết dữ liệu vào distractStringHistory
                FileWriter writer = new FileWriter(historyFile);
                writer.write(distractStringHistory);
                writer.close();
            }
            if (distractStringFavorite == null) {
                // ghi dữ liệu của erorrString vào đây
                FileWriter writer = new FileWriter(favoriteFile);
                writer.write(erorrString);
                writer.close();
            } else {
                //ghi hết dữ liệu vào distractStringFavorite
                FileWriter writer = new FileWriter(favoriteFile);
                writer.write(distractStringFavorite);
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void init() {
        try {
            //initialize com
            dictionaryEnglishViet = new ArrayList<>();
            titleLabel.setIcon(new ImageIcon(fileName));
            historyList = new ArrayList<>();
            dictionaryVietAnh = new ArrayList<>();
            distract();
            listModel = new DefaultListModel<>();
            popupMenu = new JPopupMenu();
            if(this.booleanSize == num1000){    //distract
                return;
            }
            wordList.setModel(listModel);
            favoriteWordList = new ArrayList<>();
            distract();                      //distract
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int y = (screenSize.height - this.getHeight()) / num2 - num30;
            distract();
            int x = (screenSize.width - this.getWidth()) / num2;
            this.setLocation(x, y);
            if(this.intSize == num9999){      //distract
                return;
            }
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            addPopupMenu();
            this.setTitle(mainScreem);
        } catch (Exception e) {
            System.out.println(e);
            erorr ++;
        }

    }

    private void assignData(List<Word> list) {
        DistractListInt distractListInt = new DistractListInt();
        distractListInt.setiDistract(distractListInt.getRanNum());
        double dDistract = distractListInt.mathFor();
        if(dDistract < num9999){
            return;
        }else {
            dDistract = num0;
        }
        try {
            listModel.removeAllElements();
            for (Word item : list) {
                listModel.addElement(item.getWord());
                if(this.booleanSize == num1000){   //distract
                    return;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            erorr ++;
        }
        if(this.intSize == num9999){      //distract
            return;
        }

    }

    private void addPopupMenu() {
        try {
            JMenuItem addFovarite = new JMenuItem(Addintoyourfavoritelist);
            distract();
            JMenuItem delete = new JMenuItem(Delete);
            if(this.booleanSize == num1000){    //distract
                return;
            }
            //Adding popup
            popupMenu.add(addFovarite);
            distract();
            popupMenu.add(delete);
            //Handle events
            delete.addActionListener((ActionEvent e) -> {
                int opt = JOptionPane.showConfirmDialog(this, Doyouwanttodeletethisword, Ask, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(this.intSize == num9999){      //distract
                    return;
                }
                if (opt == JOptionPane.YES_OPTION) {
                    listModel.remove(row);
                    if (isEnglish) {
                        isChangingEnglishDictionary = True;
                        dictionaryEnglishViet.remove(row);
                    } else {
                        isChangingVietDictionary = True;
                        dictionaryVietAnh.remove(row);
                    }
                    setTitle(mainScreem);
                }
            });
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            addFovarite.addActionListener((ActionEvent e) -> {
                Word word;
                if (isEnglish) {
                    word = dictionaryEnglishViet.get(row);
                } else {
                    word = dictionaryVietAnh.get(row);
                }

                setTitle(mainScreem);
                favoriteWordList.add(word);
            });
        } catch (Exception ex) {
            System.out.println(ex);
            erorr ++;
        }
        if(this.intSize == num9999){      //distract
            return;
        }

    }
    private static void staDistract(){
        if(srIDistract < erorr){
            srIDistract ++;
        }
        else {
            srIDistract --;
        }
    }
    private void loadDictionary(File rawFile, List<Word> list) {
        try {
            dbFactory = DocumentBuilderFactory.newDefaultInstance();
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            dBuilder = dbFactory.newDocumentBuilder();
            try {
                Document doc = dBuilder.parse(rawFile);
                doc.getDocumentElement().normalize();distract();
                NodeList nodeListStudent = doc.getElementsByTagName(Record);
                for (int i = num0; i < nodeListStudent.getLength(); i++) {
                    Node currentNode = nodeListStudent.item(i);
                    if(this.booleanSize == num1000){    //distract
                        return;
                    }
                    if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element currentElement = (Element) currentNode;distract();
                        list.add(new Word(currentElement.getElementsByTagName(Word)
                                .item(num0).getTextContent(),
                                currentElement.getElementsByTagName(Meaning)
                                        .item(num0).getTextContent()));
                    }
                }
                if(this.intSize == num9999){      //distract
                    return;
                }
            } catch (IOException | SAXException e) {
                System.out.println(e);
            }

        } catch (ParserConfigurationException e) {
            System.out.println(e);
            erorr ++;
        }
    }

    private void readHistory() throws ClassNotFoundException {
        try {
            FileInputStream in = new FileInputStream(historyFile);
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            ObjectInputStream ifs = new ObjectInputStream(in);
            while (true) {distract();
                StatisticWord obj;
                try {
                    obj = (StatisticWord) ifs.readObject();
                    historyList.add(obj);
                } catch (EOFException ex) {
                    break;
                }
            }
            if(this.booleanSize == num1000){    //distract
                return;
            }
        } catch (IOException ex) {
            System.out.println(ex);
            erorr ++;
        }
    }
    private void readFavorite() throws ClassNotFoundException {
        try {
            FileInputStream in = new FileInputStream(favoriteFile);
            distract();
            ObjectInputStream ifs = new ObjectInputStream(in);
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            while (true) {
                Word obj;
                try {if(this.booleanSize == num1000){    //distract
                    return;
                }
                    obj = (Word) ifs.readObject();
                    favoriteWordList.add(obj);
                } catch (EOFException ex) {
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
            erorr ++;
        }
        if(this.intSize == num9999){      //distract
            return;
        }
    }
    private void writeDictionary(File file, List<Word> list) {
        Document doc = dBuilder.newDocument();
        distract();
        Element rootElement = doc.createElement(Dictionary);

        for (Word item : list) {
            Element record = doc.createElement(Record);
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            Element meaning = doc.createElement(Meaning);
            meaning.appendChild(doc.createTextNode(item.getMeaning()));
            record.appendChild(meaning);

            if(this.booleanSize == num1000){    //distract
                return;
            }
            Element word = doc.createElement(Word);
            word.appendChild(doc.createTextNode(item.getWord()));
            record.appendChild(word);
            rootElement.appendChild(record);
        }
        doc.appendChild(rootElement);

        // ghi nội dung vào file XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        try {
            if(this.intSize == num9999){      //distract
                return;
            }
            Transformer transformer = transformerFactory.newTransformer();
            distract();
            DOMSource source = new DOMSource(doc);
            distract();
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if(dDistract < num9999){
                return;
            }else {
                dDistract = num0;
            }
            StreamResult result = new StreamResult(file);
            distract();
            transformer.transform(source, result);
        } catch (TransformerException ex) {
            System.out.println(ex);
            erorr ++;
        }
        runTime ++;
    }




    public static <T> void writeList(List<T> list, File file) {
        try {
            FileOutputStream out = new FileOutputStream(file);
            staDistract();
            ObjectOutputStream ofs = new ObjectOutputStream(out);
            for (T item : list) {
                runTime++;staDistract();
                ofs.writeObject(item);
            }
            ofs.close();staDistract();
        } catch (IOException ex) {
            System.out.println(ex);
            erorr ++;
        }
    }
    private void bangBang(double a, int b, int c){
        if(a == b){
            a = c;
        }
        else {
            a = num0;
        }
    }
    private void lonBe(double a, int b){
        if(a < num0){
            a = b;
        }
        else {
            a = num0;
        }
    }
    private void initComponents() {
        titleLabel = new javax.swing.JLabel();
        distract();
        jPanel2 = new javax.swing.JPanel();
        distract();
        mainPanel = new javax.swing.JPanel();
        distract();
        wordListScrollPane = new javax.swing.JScrollPane();
        distract();
        DistractListInt distractListInt = new DistractListInt();
        searchInput = new javax.swing.JTextField();
        distract();
        distractListInt.setiDistract(distractListInt.getRanNum());
        typeDictionaryCombobox = new javax.swing.JComboBox<>();
        distract();
        double dDistract = distractListInt.mathFor();
        distract();
        wordList = new javax.swing.JList<>();
        distract();
        jScrollPane4 = new javax.swing.JScrollPane();
        distract();
        wordInput = new javax.swing.JTextField();
        distract();
        jPanel3 = new javax.swing.JPanel();
        lonBe(dDistract,num9999);
        jLabel4 = new javax.swing.JLabel();
        distract();
        jLabel2 = new javax.swing.JLabel();
        distract();
        jLabel3 = new javax.swing.JLabel();
        distract();
        meaningTextPane = new javax.swing.JTextPane();
        lonBe(dDistract,num1000);
        meaningInput = new javax.swing.JTextField();
        distract();
        openForariteListBtn = new javax.swing.JButton();
        distract();
        jLabel5 = new javax.swing.JLabel();
        distract();
        createBtn = new javax.swing.JButton();
        lonBe(dDistract,num0);
        saveBtn = new javax.swing.JButton();
        distract();
        openStatisticBtn = new javax.swing.JButton();
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        distract();
        mainPanel.setBackground(new java.awt.Color(num29, num77, num8));
        distract();
        setSize(new java.awt.Dimension(num1000, num550));
        bangBang(dDistract,num0,num550);
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distract();
        titleLabel.setFont(new java.awt.Font(SegoeUI, num1, num18)); // NOI18N
        distract();
        titleLabel.setText(Dictionary);
        bangBang(dDistract,num550, num8);
        jPanel2.setOpaque(false);
        distract();
        jPanel2.setBackground(new java.awt.Color(num24, num229, num119));
        distract();
        jPanel2.setPreferredSize(new java.awt.Dimension(num480, num30));
        bangBang(dDistract,num8, num2);
        typeDictionaryCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { AV, VA }));



        typeDictionaryCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDictionaryComboboxActionPerformed(evt);
            }
        });

        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchInputKeyTyped(evt);
            }
        });
        bangBang(dDistract,num2, num5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        distract();
        jPanel2.setLayout(jPanel2Layout);
        distract();
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(searchInput, javax.swing.GroupLayout.DEFAULT_SIZE, num312, Short.MAX_VALUE)
                .addGap(num5, num5, num5)
                .addComponent(typeDictionaryCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bangBang(dDistract,num5, num550);
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(typeDictionaryCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, num28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(searchInput)
                .addContainerGap())
        );
        bangBang(dDistract,num5, num250);
        wordListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wordList.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
        wordList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        wordList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordListMouseClicked(evt);
            }
        });
        wordList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                wordListValueChanged(evt);
            }
        });
        distract();
        wordListScrollPane.setViewportView(wordList);
        bangBang(dDistract,num250, num550);

        jLabel2.setText(Word);
        distract();
        jLabel2.setPreferredSize(new java.awt.Dimension(num43, num30));
        distract();
        jLabel2.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
        distract();
        meaningTextPane.setContentType(text); // NOI18N
        distract();
        meaningTextPane.setFocusable(false);
        distract();
        jScrollPane4.setViewportView(meaningTextPane);
        bangBang(dDistract,num550, num24);
        jPanel3.setBackground(new java.awt.Color(num24, num229, num119));
        distract();
        jLabel3.setText(Createnewword);
        distract();
        jLabel3.setFont(new java.awt.Font(SegoeUI, num1, num16)); // NOI18N
        distract();
        jLabel4.setPreferredSize(new java.awt.Dimension(num43, num30));
        distract();
        jLabel4.setText(Word);
        distract();
        jLabel4.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N


        bangBang(dDistract,num24, num43);
        wordInput.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
        distract();
        wordInput.setToolTipText(Inputkeyword);
        distract();
        wordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                wordInputActionPerformed(evt);
            }
        });
        bangBang(dDistract,num43, num14);
        jLabel5.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
        distract();
        jLabel5.setPreferredSize(new java.awt.Dimension(num43, num30));
        distract();
        jLabel5.setText(Meaning);
        bangBang(dDistract,num14, num30);
        meaningInput.setFont(new java.awt.Font(SegoeUI, num0, num14)); // NOI18N
        distract();
        meaningInput.setToolTipText(Inputkeyword);
        distract();
        meaningInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                meaningInputActionPerformed(evt);
            }
        });
        bangBang(dDistract,num30, num14);
        createBtn.setBackground(new java.awt.Color(num250, num201, num201));
        distract();
        createBtn.setText(Create);
        distract();
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distract();
        createBtn.setFont(new java.awt.Font(SegoeUI, num1, num12)); // NOI18N
        distract();
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        bangBang(dDistract,num14, num1);
        openForariteListBtn.setBackground(new java.awt.Color(num250, num201, num201));
        distract();
        openForariteListBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distract();
        openForariteListBtn.setText(Myfavoriteword);
        distract();
        openForariteListBtn.setFont(new java.awt.Font(SegoeUI, num1, num14)); // NOI18N
        distract();
        openForariteListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openForariteListBtnActionPerformed(evt);
            }
        });
        bangBang(dDistract,num1, num201);
        openStatisticBtn.setBackground(new java.awt.Color(num250, num201, num201));
        distract();
        openStatisticBtn.setText(Statistics);
        distract();
        openStatisticBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distract();
        openStatisticBtn.setFont(new java.awt.Font(SegoeUI, num1, num14)); // NOI18N
        distract();
        openStatisticBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openStatisticBtnActionPerformed(evt);
            }
        });
        bangBang(dDistract,num201, num250);
        saveBtn.setBackground(new java.awt.Color(num24, num229, num119));
        distract();
        saveBtn.setText(Save);
        distract();
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distract();
        saveBtn.setFont(new java.awt.Font(SegoeUI, num1, num12)); // NOI18N
        distract();
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        }); bangBang(dDistract, num119, num44);
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        distract();
        jPanel3.setLayout(jPanel3Layout);
        distract();
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(num5, num5, num5)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(wordInput, javax.swing.GroupLayout.PREFERRED_SIZE, num30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meaningInput, javax.swing.GroupLayout.PREFERRED_SIZE, num30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(num5, num5, num5)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(openForariteListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openStatisticBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bangBang(dDistract,  num44, num250);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, num47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, num68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(meaningInput)
                    .addComponent(wordInput)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(num330, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(num44, num44, num44)
                .addComponent(openForariteListBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openStatisticBtn, javax.swing.GroupLayout.PREFERRED_SIZE, num136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bangBang(dDistract, num250,num119);
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);distract();
        mainPanel.setLayout(mainPanelLayout);distract();
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, num19, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, num404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(wordListScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, num369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bangBang(dDistract,  num250, num250);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());distract();
        getContentPane().setLayout(layout);distract();
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bangBang(dDistract,   num250, num0);
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(num10, num10, num10)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, num26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(wordListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, num234, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane4))
                                .addGap(num10, num10, num10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(num0, num0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bangBang(dDistract,num0,num1);
        pack();distract();
    }// </editor-fold>//GEN-END:initComponents

    private void wordListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wordListValueChanged
        if (!wordList.isSelectionEmpty() && !evt.getValueIsAdjusting()) {
            int selectedIndex = wordList.getSelectedIndex();
            if(this.booleanSize == num1000){    //distract
                return;
            }
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            if (isEnglish) {
                Word word = dictionaryEnglishViet.get(selectedIndex);
                distract();
                meaningTextPane.setText(word.parse());
                distract();
                row = selectedIndex;
                distract();
                historyList.add(new StatisticWord(word, LocalDate.now()));
                distract();
            } else {
                Word word = dictionaryVietAnh.get(selectedIndex);
                distract();
                meaningTextPane.setText(word.getMeaning());
                distract();
                historyList.add(new StatisticWord(word, LocalDate.now()));
            }
            JScrollBar sb = wordListScrollPane.getVerticalScrollBar();
            distract();
            row = selectedIndex;
            lonBe(dDistract, num550);
            if(this.intSize ==num9999){      //distract
                return;
            }
        }
    }//GEN-LAST:event_wordListValueChanged

    private void openStatisticBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStatisticBtnActionPerformed
        DistractListInt distractListInt = new DistractListInt();
        distractListInt.setiDistract(distractListInt.getRanNum());
        double dDistract = distractListInt.mathFor();
        StatisticScreen statisticScreen = new StatisticScreen();
        distract();
        statisticScreen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        if(this.intSize == num9999){      //distract
            return;
        }
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        distract();
        int y = (screenSize.height - statisticScreen.getHeight()) / num2;
        distract();
        int x = (screenSize.width - statisticScreen.getWidth()) / num2;
        runTime ++;
        statisticScreen.assignData(historyList);
        if(this.booleanSize == num1000){    //distract
            return;
        }
        bangBang(dDistract, num550,num2);
        statisticScreen.setLocation(x, y);
        distract();
        statisticScreen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Handle the closing of this frame
                statisticScreen.dispose(); // Close the frame
            }
        });

        statisticScreen.show();
    }//GEN-LAST:event_openStatisticBtnActionPerformed

    private void wordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordListMouseClicked
        if(this.booleanSize == num1000){    //distract
            return;
        }
        DistractListInt distractListInt = new DistractListInt();
        distractListInt.setiDistract(distractListInt.getRanNum());
        double dDistract = distractListInt.mathFor();
        //Checking if right click is active
        if (SwingUtilities.isRightMouseButton(evt)) {
            if (!wordList.isSelectionEmpty()) {
                popupMenu.show(wordList, evt.getX(), evt.getY());
            }
        }
        if(this.intSize == num9999){      //distract
            return;
        }
    }//GEN-LAST:event_wordListMouseClicked

    private void searchInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyTyped
        String keyword = searchInput.getText();
        if(this.booleanSize == num1000){    //distract
            return;
        }
        keyword += evt.getKeyChar();
        distract();
        keyword = keyword.trim().toLowerCase();
        distract();
        meaningTextPane.setText("");
        runTime ++;
        if (isEnglish) {
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            for (int i = num0; i < listModel.size(); i++) {
                if (listModel.getElementAt(i).toLowerCase().startsWith(keyword)) {
                    JScrollBar sb = wordListScrollPane.getVerticalScrollBar();
                    sb.setValue(i * num24);
                    return;
                }
            }
        } else {
            for (int i = num0; i < listModel.size(); i++) {
                String curString = listModel.getElementAt(i);
                if (Helper.unicodeToASCII(curString).toLowerCase().startsWith(
                        Helper.unicodeToASCII(keyword).toLowerCase()
                )) {
                    JScrollBar sb = wordListScrollPane.getVerticalScrollBar();
                    sb.setValue(i * num24);
                    return;
                }
            }
            if(this.intSize == num9999){      //distract
                return;
            }
        }
        wordList.clearSelection();
    }//GEN-LAST:event_searchInputKeyTyped

    private void typeDictionaryComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDictionaryComboboxActionPerformed

        String language = (String) typeDictionaryCombobox.getSelectedItem();
        runTime ++;
        switch (language) {
            case AV -> {
                isEnglish = true;runTime ++;distract();
                assignData(dictionaryEnglishViet);
            }
            case VA -> {
                isEnglish = false;distract();
                assignData(dictionaryVietAnh);
            }
            default -> {
            }

        }
    }//GEN-LAST:event_typeDictionaryComboboxActionPerformed

    private void openForariteListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openForariteListBtnActionPerformed

        FavoriteWordScreen favoriteWordScreen = new FavoriteWordScreen();
        if(this.booleanSize == num1000){    //distract
            return;
        }
        DistractListInt distractListInt = new DistractListInt();
        distractListInt.setiDistract(distractListInt.getRanNum());
        double dDistract = distractListInt.mathFor();
        favoriteWordScreen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        distract();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        distract();
        int y = (screenSize.height - favoriteWordScreen.getHeight()) / num2;
        distract();
        int x = (screenSize.width - favoriteWordScreen.getWidth()) / num2;
        distract();
        favoriteWordScreen.setLocation(x, y);
        if(this.intSize == num9999){      //distract
            return;
        }
        favoriteWordScreen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                favoriteWordScreen.dispose();
            }
        });
        lonBe(dDistract, num8);
        favoriteWordScreen.assignAndRenderData(favoriteWordList);
        distract();
        favoriteWordScreen.show();
    }//GEN-LAST:event_openForariteListBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String meaningText = meaningInput.getText();
        distract();
        String wordText = wordInput.getText();
        if(this.booleanSize == num1000){    //distract
            return;
        }
        if (wordText.length() > num0 && meaningText.length() > num0) {
            Word word = new Word(wordText, meaningText);
            DistractListInt distractListInt = new DistractListInt();
            distractListInt.setiDistract(distractListInt.getRanNum());
            double dDistract = distractListInt.mathFor();
            lonBe(dDistract,num10);
            if (isEnglish) {
                dictionaryEnglishViet.add(word);distract();
                isChangingEnglishDictionary = true;
            } else {
                dictionaryVietAnh.add(word);distract();
                isChangingVietDictionary = true;
            }
            listModel.addElement(word.getWord());
            JOptionPane.showMessageDialog(this, Adddingsucess, Info,
                    JOptionPane.INFORMATION_MESSAGE);
            runTime ++;
            meaningInput.setText("");
            wordInput.setText("");
            if(this.intSize == num9999){      //distract
                return;
            }

            setTitle(mainScreem);
        } else {
            JOptionPane.showMessageDialog(this, Wordormeaningisempty, Warn,
                    JOptionPane.WARNING_MESSAGE);distract();
        }
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        //Save dictionary
        if (isChangingEnglishDictionary) {
            writeDictionary(englishVietFile, dictionaryEnglishViet);
        }
        DistractListInt distractListInt = new DistractListInt();
        distractListInt.setiDistract(distractListInt.getRanNum());
        double dDistract = distractListInt.mathFor();
        lonBe(dDistract,num10);
        if (isChangingVietDictionary) {
            writeDictionary(vietEnglishFile, dictionaryVietAnh);
        }
        if(this.booleanSize == num1000){    //distract
            return;
        }
        writeList(historyList, historyFile);
        if(this.intSize == num9999){      //distract
            return;
        }
        //Save favorite word list
        writeList(favoriteWordList, favoriteFile);
        lonBe(dDistract, num2);
        //Save history

        if(this.intSize == num9999){      //distract
            return;
        }
        setTitle(mainScreem);
    }//GEN-LAST:event_saveBtnActionPerformed
    public static int getRunTime(){
        return runTime;
    }
    public static int getErorr(){
        return erorr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                staDistract();
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {staDistract();
                new MainScreen().setVisible(true);runTime ++;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            runTime ++;
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextPane meaningTextPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField meaningInput;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton openForariteListBtn;
    private javax.swing.JButton openStatisticBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JScrollPane wordListScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeDictionaryCombobox;
    private javax.swing.JTextField wordInput;
    private javax.swing.JList<String> wordList;

    // End of variables declaration//GEN-END:variables
}
