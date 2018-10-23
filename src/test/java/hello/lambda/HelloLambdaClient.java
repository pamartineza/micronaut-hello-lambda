package hello.lambda;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface HelloLambdaClient {

    @Named("hello-lambda")
    Single<String> index();

}
