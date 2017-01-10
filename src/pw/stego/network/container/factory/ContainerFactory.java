package pw.stego.network.container.factory;

import java.io.File;
import java.io.IOException;

/**
 * Factory to create containers for proxy
 * Created by lina on 05.01.17.
 */
public interface ContainerFactory {
    /**
     * @param params arguments to generate custom container
     * @return container file
     * @throws IOException on file creation error
     */
    File createContainer(String[] params) throws IOException;
}
