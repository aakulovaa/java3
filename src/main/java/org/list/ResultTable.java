package org.list;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс для создания таблицы с результатами работы программы
 */
public class ResultTable extends JDialog{
    private JTable table1;
    private JPanel panel1;
    private JButton buttonOK;

    /**
     * Конструктор класа, в котором создается диалоговое окно с таблицей и кнопкой для его закрытия
     */
    public ResultTable() {
        setContentPane(panel1);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Обработчик нажатия на кнопку - приводит к завершения работы
     */
    private void onOK() {
        dispose();
    }

    /**
     * Метод заполнения таблицы данными из класса <br>Performance</br>
     */
    private void createUIComponents() {
        Performance performance = new Performance();
        int operationCount = 5000;
        String[] columnNames = {
                "List Name",
                "Operation",
                "Operation count",
                "Time"
        };
        String[][] data = {
                {"ArrayList", ".add()",String.valueOf(operationCount), performance.arrayAdd(operationCount) + " ns"},
                {"LinkedList", ".add()",String.valueOf(operationCount),performance.linkedAdd(operationCount)+ " ns"},
                {"ArrayList", ".remove()",String.valueOf(operationCount),performance.arrayRemove(operationCount)+ " ns"},
                {"LinkedList", ".remove()",String.valueOf(operationCount),performance.linkedRemove(operationCount)+ " ns"},
                {"ArrayList", ".get()",String.valueOf(operationCount),performance.arrayGet(operationCount)+ " ns"},
                {"LinkedList", ".get()",String.valueOf(operationCount),performance.linkedGet(operationCount)+ " ns"}
        };
        table1 = new JTable(data,columnNames);
    }
    public static void main(String[] args) {
        ResultTable resultTable = new ResultTable();
        JTable table11 = resultTable.table1;
        JScrollPane scrollPane = new JScrollPane(table11);

        resultTable.getContentPane().add(scrollPane);
        resultTable.setPreferredSize(new Dimension(450, 200));
        resultTable.pack();
        resultTable.setLocationRelativeTo(null);
        resultTable.setVisible(true);
        System.exit(0);
    }
}
