package assignment;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class DDDashboard extends JFrame {

    private static final long serialVersionUID = 1L;

    public DDDashboard(String applicationTitle, String chartTitle) {
        super(applicationTitle);

        // This will create the dataset
        CategoryDataset dataset = createDataset();
        
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        
        // add it to our application
        setContentPane(chartPanel);

        setLocationRelativeTo(null);
    }

    /**
     * Creates a sample dataset for a bar chart
     */
    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(29, "Category1", "L");
        dataset.addValue(20, "Category1", "M");
        dataset.addValue(51, "Category1", "W");

        return dataset;
    }

    /**
     * Creates a bar chart
     */
    private JFreeChart createChart(CategoryDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createBarChart(
                title,          // chart title
                "Category",     // domain axis label
                "Value",        // range axis label
                dataset          // data
        );

        return chart;
    }

    public static void main(String[] args) {
        DDDashboard chart = new DDDashboard("Bar Chart Example", "Sample Bar Chart");
        chart.pack();
        chart.setVisible(true);
    }
}
