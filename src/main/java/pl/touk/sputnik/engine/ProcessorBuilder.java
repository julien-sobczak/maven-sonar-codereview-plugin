package pl.touk.sputnik.engine;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import pl.touk.sputnik.configuration.Configuration;
import pl.touk.sputnik.configuration.GeneralOption;
import pl.touk.sputnik.processor.sonar.SonarProcessor;
import pl.touk.sputnik.review.ReviewProcessor;

public class ProcessorBuilder {

    @NotNull
    public static List<ReviewProcessor> buildProcessors(Configuration configuration) {
        List<ReviewProcessor> processors = new ArrayList<>();
        if (Boolean.valueOf(configuration.getProperty(GeneralOption.SONAR_ENABLED))) {
            processors.add(new SonarProcessor(configuration));
        }
        return processors;
    }
}
