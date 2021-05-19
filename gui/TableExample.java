package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class TableExample extends JFrame
{
    public TableExample()
    {
        String[] columns = new String[] {
                "학번", "이름", "중간", "기말"
        };

        Object[][] data = new Object[][] {
                {20200001, "John", 30, 40 },
                {20200002, "Rambo", 40, 10 },
                {20200003, "Zorro", 10, 50 },
        };

        JTable table = new JTable(data, columns);

        this.add(new JScrollPane(table));
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableExample();
            }
        });
    }
}