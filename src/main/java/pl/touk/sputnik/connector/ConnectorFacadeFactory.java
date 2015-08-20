package pl.touk.sputnik.connector;

import org.jetbrains.annotations.NotNull;

import pl.touk.sputnik.configuration.Configuration;
import pl.touk.sputnik.configuration.GeneralOptionNotSupportedException;
import pl.touk.sputnik.connector.gerrit.GerritFacadeBuilder;

public class ConnectorFacadeFactory {
    public static final ConnectorFacadeFactory INSTANCE = new ConnectorFacadeFactory();

    GerritFacadeBuilder gerritFacadeBuilder = new GerritFacadeBuilder();

    @NotNull
    public ConnectorFacade build(@NotNull ConnectorType type, Configuration configuration) {
        switch (type) {
            case STASH:
                throw new UnsupportedOperationException();
            case GERRIT:
                return gerritFacadeBuilder.build(configuration);
            default:
                throw new GeneralOptionNotSupportedException("Connector " + type.getName() + " is not supported");
        }
    }
}
