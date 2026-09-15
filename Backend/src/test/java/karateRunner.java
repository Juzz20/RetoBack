import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class karateRunner {

    @Test
    void testAll() {

        Results results = Runner.path("classpath:REST")
                .outputCucumberJson(true)
                .parallel(1);

        ReportUtils.generateReport(results.getReportDir());

        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}