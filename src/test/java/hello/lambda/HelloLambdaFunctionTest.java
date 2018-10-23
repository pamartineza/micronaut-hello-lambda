package hello.lambda;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloLambdaFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        HelloLambdaClient client = server.getApplicationContext().getBean(HelloLambdaClient.class);

        assertEquals(client.index().blockingGet(), "hello-lambda");
        server.stop();
    }
}
