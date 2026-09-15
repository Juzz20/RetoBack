import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class ReportUtils {

    public static void generateReport(String karateOutputPath) {

        File reportDir = new File(karateOutputPath);

        List<String> jsonFiles = FileUtils.listFiles(reportDir,
                        new String[]{"json"}, true)
                .stream()
                .map(File::getAbsolutePath)
                .collect(Collectors.toList());

        Configuration config =
                new Configuration(new File("target/cucumber-report"), "Proyecto Backend");

        ReportBuilder reportBuilder =
                new ReportBuilder(jsonFiles, config);

        reportBuilder.generateReports();

    }

}