package pl.touk.sputnik.engine;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import pl.touk.sputnik.configuration.Configuration;
import pl.touk.sputnik.configuration.ConfigurationSetup;
import pl.touk.sputnik.configuration.GeneralOption;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class ProcessorBuilderTest {

    @Test
    public void shouldNotBuildAnyProcessor() {
        Configuration config = new ConfigurationSetup().setUp(Collections.<String, String>emptyMap());

        assertThat(ProcessorBuilder.buildProcessors(config)).isEmpty();
    }

}